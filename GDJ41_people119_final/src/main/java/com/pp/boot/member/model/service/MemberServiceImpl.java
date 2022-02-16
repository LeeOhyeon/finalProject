package com.pp.boot.member.model.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.boot.member.model.dao.MemberDao;
import com.pp.boot.member.model.vo.Member;
import com.pp.boot.member.model.vo.Scrap;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public Member loginMember(Map param) {
		return dao.loginMember(session, param);
	}

	@Override
	public int enrollMember(Member member) {
		
		return dao.enrollMember(session,member);
	}

	@Override
	public Member checkEmail(String email) {

		return dao.checkEmail(session,email);
	}

	@Override
	public Member searchId(Map param) {
		return dao.searchId(session,param);
	}

	@Override
	public int updatePassword(Map param) {
		return dao.updatePassword(session,param);
	}

	@Override
	public int updateMemberName(Map param) {
		return dao.updateMemberName(session,param);
	}

	@Override
	public int updatebirth(Map param) {
		return dao.updatebirth(session,param);
	}
	
	@Override
	public int updateGender(Map param) {
		return dao.updateGender(session,param);
	}
	
	@Override
	public int updateAddress(Map param) {
		return dao.updateAddress(session,param);
	}

	@Override
	public int updateEmail(Map param) {
		return dao.updateEmail(session,param);
	}

	@Override
	public int updatePhone(Map param) {
		return dao.updatePhone(session,param);
	}

	@Override
	public int insertScrap(Map<String, Object> param) {
		return dao.insertScrap(session,param);
	}

	@Override
	public Scrap selectScrapList(String memberId) {
		return dao.selectScrapList(session,memberId);
	}

	
	
	
}
