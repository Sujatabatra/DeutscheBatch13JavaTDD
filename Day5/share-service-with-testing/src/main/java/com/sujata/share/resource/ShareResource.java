package com.sujata.share.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(path = "/shares/{sId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Share getShareByIdResource(@PathVariable("sId") int shareId) {
		Optional<Share> optionalShare=shareService.getShareById(shareId);
		return optionalShare.orElse(null);
	}
	
	@DeleteMapping(path = "/shares/{sId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Share deleteShareByIdResource(@PathVariable("sId") Integer shareId) {
		return shareService.deleteShareById(shareId);
	}
	
	@PostMapping(path = "/shares",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Share saveShareResource(@RequestBody Share share) {
		return shareService.insertNewShare(share);
	}
	
	@PutMapping(path = "/shares/{id}/{price}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Share modifySharePriceResource(@PathVariable("id") Integer shareId,@PathVariable("price") Double marketPrice) {
		return shareService.updateMarketPrice(shareId, marketPrice);
	}
}
