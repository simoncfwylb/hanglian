package com.hangliantx.service;

import org.springframework.stereotype.Service;

import com.hangliantx.common.spring.extend.PropertyConfig;

@Service
public class PropertieService {
    
    @PropertyConfig
    public String REPOSITORY_PATH; 
    
    @PropertyConfig
    public String IMAGE_BASE_URL;

}
