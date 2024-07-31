package com.sujata.share.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sujata.share.persistence.ShareDaoImpl;
import com.sujata.share.presentation.SharePresentationImpl;
import com.sujata.share.service.ShareServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.sujata")
public class ShareConfig {

	
}
