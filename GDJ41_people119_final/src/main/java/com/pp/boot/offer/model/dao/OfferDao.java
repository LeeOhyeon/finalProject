package com.pp.boot.offer.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.pp.boot.offer.model.vo.Offer;

public interface OfferDao {

	// 전체 공고 리스트 불러오기
//	List<Offer> selectOfferList(SqlSessionTemplate session, int cPage, int numPerpage);
	List<Offer> selectOfferList(SqlSessionTemplate session);
	
	// 전체 공고 개수 확인
	int countOfferList(SqlSessionTemplate session);
	
}
