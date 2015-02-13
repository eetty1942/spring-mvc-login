package com.maple.test.dao;

import org.springframework.stereotype.Repository;

import com.maple.test.model.Member;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Override
	public void insertMember(Member member) {
		//DB 저장
		
		throw new java.lang.RuntimeException();
	}
	@Override
	public void loginMember(Member member) {
		//DB 저장
		
		throw new java.lang.RuntimeException();
	}
}
