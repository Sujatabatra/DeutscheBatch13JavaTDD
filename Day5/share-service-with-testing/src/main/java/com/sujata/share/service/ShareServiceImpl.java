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

	@Override
	public Share deleteShareById(Integer shareId) {
		Optional<Share> optionalShare = getShareById(shareId);
		Share share = null;
		if (optionalShare.isPresent()) {
			share = optionalShare.get();
			shareDao.deleteById(share.getShareId());
		}
		return share;
	}

	@Override
	public Share updateMarketPrice(Integer shareId, Double marketPrice) {
		Optional<Share> optionalShare = getShareById(shareId);
		Share share = null;
		if (optionalShare.isPresent()) {
			share = optionalShare.get();
			share.setPrice(marketPrice);
			shareDao.save(share); // .save() : save and update
		}
		return share;
	}

	@Override
	public Share insertNewShare(Share share) {
		Optional<Share> optionalShare = getShareById(share.getShareId());
		Share sh = null;
		if (!(optionalShare.isPresent())) {
			sh = shareDao.save(share);
		}
		return sh;
	}

}
