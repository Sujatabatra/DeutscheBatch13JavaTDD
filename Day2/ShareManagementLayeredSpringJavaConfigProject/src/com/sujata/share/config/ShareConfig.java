package com.sujata.share.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.share.persistence.ShareDaoImpl;
import com.sujata.share.presentation.SharePresentationImpl;
import com.sujata.share.service.ShareServiceImpl;

@Configuration
public class ShareConfig {

	@Bean
	public ShareDaoImpl shareDao() {
		return new ShareDaoImpl();
	}
	
	@Bean
	public ShareServiceImpl shareService() {
		ShareServiceImpl shareServiceImpl=new ShareServiceImpl();
		shareServiceImpl.setShareDao(shareDao());
		return shareServiceImpl;
	}
	
	@Bean
	public SharePresentationImpl sharePresentation() {
		return new SharePresentationImpl(shareService());
	}
}
