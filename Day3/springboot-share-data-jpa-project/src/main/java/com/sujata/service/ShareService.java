package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.entity.Share;

public interface ShareService {

	List<Share> getAllShares();
	
	Optional<Share> getShareById(int shareId);
	
	Optional<Share> findShareByName(String shareName);
}
