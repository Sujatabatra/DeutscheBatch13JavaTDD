package com.sujata.share.service;

import java.util.List;
import java.util.Optional;

import com.sujata.share.entity.Share;
import com.sujata.share.persistence.ShareDao;
import com.sujata.share.persistence.ShareDaoImpl;

public class ShareServiceImpl implements ShareService {

	private ShareDao shareDao=new ShareDaoImpl();
	
	@Override
	public List<Share> getAllShares() {
		return shareDao.getAllRecord();
	}

	@Override
	public boolean insertNewShare(Share share) {
		return shareDao.saveRecord(share)>0;
	}

	@Override
	public Optional<Share> searchShareById(int shareId) {
		
		return Optional.ofNullable(shareDao.getRecordById(shareId));
	}

}
