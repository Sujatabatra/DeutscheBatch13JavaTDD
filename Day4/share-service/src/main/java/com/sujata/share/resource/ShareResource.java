package com.sujata.share.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.share.entity.Share;
import com.sujata.share.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	ShareService shareService;
	
	@GetMapping(path = "/shares",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Share> getAllSharesResource(){
		return shareService.getAllShares();
	}
}
