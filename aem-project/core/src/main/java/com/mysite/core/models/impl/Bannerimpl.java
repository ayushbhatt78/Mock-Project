package com.mysite.core.models.impl;


import com.mysite.core.models.Banner;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.*;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = Banner.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Bannerimpl implements Banner {
    private static final Logger LOG = LoggerFactory.getLogger(Bannerimpl.class);



    @Inject
    Resource componentResource;

    @ValueMapValue
    private List<String> banner;


    @Override
    public List<String> getBanner() {
        if(banner!=null){
            return new ArrayList<String>(banner);
        }else{
            return Collections.emptyList();
        }
    }

    @Override
    public List<Map<String, String>> getBannerDetailsWithMap() {
        List<Map<String, String>> bannerDetailsMap=new ArrayList<>();
        try {
            Resource bannerDetail=componentResource.getChild("bannerDetailsWithMap");
            if(bannerDetail!=null){
                for (Resource banner : bannerDetail.getChildren()) {
                    Map<String,String> bookMap=new HashMap<>();
                    bookMap.put("heading",banner.getValueMap().get("heading",String.class));
                    bookMap.put("image",banner.getValueMap().get("image",String.class));
                    bookMap.put("blogLink",banner.getValueMap().get("blogLink",String.class));
                    bannerDetailsMap.add(bookMap);
                }
            }
        }catch (Exception e){
            LOG.info("\n ERROR while getting Banner Details {} ",e.getMessage());
        }
        LOG.info("\n SIZE {} ",bannerDetailsMap.size());
        return bannerDetailsMap;
    }
}
