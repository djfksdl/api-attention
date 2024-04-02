package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.AttentionDao;
import com.javaex.vo.AttentionVo;

@Service
public class AttentionService {

	@Autowired
	private AttentionDao attentionDao;
	
	//리스트 불러오기
	public List<AttentionVo> exeList(String category) {
		System.out.println("AttentionService.exeList");
		
		List<AttentionVo> productList = attentionDao.selectList(category);
		
		
		return productList;
	}
	
	//이미지 눌렀을때 장바구니에 담을 정보 가져오기
	public AttentionVo exeCart(int no) {
		System.out.println("AttentionService.exeCart");
		
		AttentionVo attentionVo = attentionDao.selectOneByNo(no);
		
		return attentionVo;
	}
	
	//삭제
	public int exeRemove(int no) {
		System.out.println("AttentionService.exeRemove");
		
		int count =attentionDao.delete(no);
		return count;
	}
}
