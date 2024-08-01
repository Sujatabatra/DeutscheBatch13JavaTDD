package com.sujata.share.service;

import java.util.List;
import java.util.Optional;

import com.sujata.share.entity.Share;

public interface ShareService {

	List<Share> getAllShares();
	Optional<Share> getShareById(int shareId);
}
