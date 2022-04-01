package com.mysite.core.models;

import java.util.List;
import java.util.Map;

public interface Blogs {

    List<String> getBlogs();

    List<Map<String,String>> getBlogsDetailsWithMap();
}
