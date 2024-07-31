package com.sujata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao shareDao;
	
	@Override
	public List<Share> getAllShares() {
		return shareDao.findAll();
	}

	@Override
	public Optional<Share> getShareById(int shareId) {
		return shareDao.findById(shareId);
	}

	@Override
	public Optional<Share> findShareByName(String shareName) {
		return Optional.ofNullable(shareDao.giveShareByName(shareName));
	}

}
