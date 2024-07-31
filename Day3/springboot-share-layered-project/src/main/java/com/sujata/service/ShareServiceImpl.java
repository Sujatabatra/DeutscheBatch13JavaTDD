package com.sujata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.entity.Share;
import com.sujata.persistence.ShareDao;
import com.sujata.persistence.ShareDaoImpl;

//@Component
@Service
public class ShareServiceImpl implements ShareService {

//	private ShareDao shareDao=new ShareDaoImpl();

	@Autowired
	private ShareDao shareDao;

	public void setShareDao(ShareDao shareDao) {
		this.shareDao = shareDao;
	}

	@Override
	public List<Share> getAllShares() {
		return shareDao.getAllRecord();
	}

	@Override
	public boolean insertNewShare(Share share) {
		return shareDao.saveRecord(share) > 0;
	}

	@Override
	public Optional<Share> searchShareById(int shareId) {

		return Optional.ofNullable(shareDao.getRecordById(shareId));
	}

}
