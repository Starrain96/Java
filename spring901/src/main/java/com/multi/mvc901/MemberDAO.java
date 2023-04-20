package com.multi.mvc901;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MemberVO bag) {
		
		int result = my.insert("member.create", bag);
		return result;
	}

	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}

	public int delete(String id) {
		int result = my.delete("member.del", id);
		return result;
	}

	public MemberVO one(String id) {
		MemberVO bag = my.selectOne("member.one", id);
		return bag;
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = my.selectList("member.list");
		return list;
	}
}
