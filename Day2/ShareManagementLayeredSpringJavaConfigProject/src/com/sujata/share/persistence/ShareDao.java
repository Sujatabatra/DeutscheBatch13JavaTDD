package com.sujata.share.persistence;

import java.util.List;

import com.sujata.share.entity.Share;

//Dao : Data Access Object
public interface ShareDao {
	
	List<Share> getAllRecord();
	int saveRecord(Share share);
	Share getRecordById(int shareId);

}
