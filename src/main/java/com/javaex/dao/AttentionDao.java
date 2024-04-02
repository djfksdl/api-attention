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
	public List<AttentionVo> selectList(String category) {
		
		System.out.println("AttentionDao.selectList");
		
		List<AttentionVo> productList= sqlSession.selectList("kiosk.selectList",category);
		
//		System.out.println(productList);
		return productList;
		
	}
	//장바구니에 넣기
	public AttentionVo selectOneByNo(int no) {
		System.out.println("AttentionDao.selectOneByNo");
		
		AttentionVo attentionVo = sqlSession.selectOne("kiosk.selectByNo", no);
		
		return attentionVo;
	}
	
	//삭제하기
	public int delete(int no) {
		System.out.println("AttentionDao.delete");
		
		int count = sqlSession.delete("kiosk.delete", no);
		return count;
	}
}
