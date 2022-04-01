package com.mysite.core.models;

import java.util.List;
import java.util.Map;

public interface Banner {

    List<String> getBanner();

    List<Map<String,String>> getBannerDetailsWithMap();
}
