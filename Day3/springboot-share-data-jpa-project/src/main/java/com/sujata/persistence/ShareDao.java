package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Share;

@Repository
public interface ShareDao extends JpaRepository<Share, Integer> {
	
	//Make use of naming convention for functions, you need not to write query 
//	public Share getByShareName(String shareName);
	
	/*
	 * @Query(value="JPQL SYNTAX",nativeQuery=false)
	 * @Query(value="SQL Syntax", nativeQuery=true)
	 * 
	 * JPQL : Java Persistence Query Language
	 * SQL : select * from shares;  select * from tablename
	 * JPQL : from Share;   from ClassName;
	 * 
	 * SQL : select columnname1,columname2 from tablename
	 * JPQ: : select propertyName(s) from ClassName
	 * 
	 * SQL : select columnName(s) from tablename where columnname=value
	 * JPQL : select propertyName(s) from ClassName where propertyName=value
	 * 
	 */
	@Query(value="from Share where shareName=:name",nativeQuery = false)
	public Share giveShareByName(@Param("name") String shareName);
	

}
