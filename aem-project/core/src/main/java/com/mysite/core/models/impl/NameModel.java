package com.mysite.core.models.impl;


import com.mysite.core.models.NameModelIn;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = {Resource.class}, adapters = NameModelIn.class,
                     defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NameModel implements NameModelIn {

    @Inject
    @Default(values="Ayush")
    String firstname;

    @Inject
    @Default(values="bhatt")
    String lastname;


    @Override
    public String FirstName() {
        return firstname;
    }

    @Override
    public String LastName() {
        return lastname;
    }
}
