package com.mysite.core.models.impl;

import com.mysite.core.models.Blogs;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.*;

@Model(
        adaptables = Resource.class,
        adapters = Blogs.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Blogsimpl implements Blogs {
    private static final Logger LOG = LoggerFactory.getLogger(Blogsimpl.class);

    @SlingObject
    Resource componentResource;

    @ValueMapValue
    private List<String> blogs;

    @Override
    public List<String> getBlogs() {
        if(blogs!=null){
            return new ArrayList<String>(blogs);
        }else{
            return Collections.emptyList();
        }
    }


    @Override
    public List<Map<String, String>> getBlogsDetailsWithMap() {
        List<Map<String, String>> blogsDetailsMap=new ArrayList<>();
        try {
            LOG.info("\n Resource {}", componentResource);
            Resource blogsDetail=componentResource.getChild("blogsDetailsWithMap");
            if(blogsDetail!=null){
                for (Resource blogs : blogsDetail.getChildren()) {
                    Map<String,String> blogMap=new HashMap<>();
                    blogMap.put("pagetitle",blogs.getValueMap().get("pagetitle",String.class));
                    blogMap.put("blogtitle",blogs.getValueMap().get("blogtitle",String.class));

                    blogsDetailsMap.add(blogMap);
                }
            }
        }catch (Exception e){
            LOG.info("\n ERROR while getting Banner Details {} ",e.getMessage());
        }
        LOG.info("\n SIZE {} ",blogsDetailsMap.size());
        return blogsDetailsMap;
    }
}
