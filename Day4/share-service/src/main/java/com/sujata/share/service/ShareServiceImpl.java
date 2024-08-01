package com.sujata.share.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.share.entity.Share;
import com.sujata.share.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	ShareDao shareDao;
	
	@Override
	public List<Share> getAllShares() {
		return shareDao.findAll();
	}

	@Override
	public Optional<Share> getShareById(int shareId) {
		return shareDao.findById(shareId);
	}

}
