package com.wings.mywiki.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
	@Autowired
	private SqlSessionTemplate ss;

	public int getCount() {
		return ss.selectOne("user.count");
	}
}