package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.AttentionVo;

@Repository
public class AttentionDao {
	
	@Autowired
	private  SqlSession sqlSession;
	
	//전체리스트 불러오기
	public List<AttentionVo> selectList() {
		
		System.out.println("AttentionDao.selectList");
		
		List<AttentionVo> productList= sqlSession.selectList("kiosk.selectList");
		
//		System.out.println(productList);
		return productList;
		
	}
	
	public AttentionVo selectOneByNo(int no) {
		System.out.println("AttentionDao.selectOneByNo");
		
		AttentionVo attentionVo = sqlSession.selectOne("kiosk.selectByNo", no);
		
		return attentionVo;
	}
}
