package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.AttentionService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AttentionVo;

@RestController
public class AttentionController {
	
	@Autowired
	private AttentionService attentionService;
	
	//메뉴 리스트 불러오기
	@GetMapping("/attention")
	public JsonResult getList() {
		System.out.println("AttentionController.getList");
		
		List<AttentionVo> productList = attentionService.exeList();
		System.out.println(productList);
		
		return JsonResult.success(productList);
	}
	
	//이미지 눌렀을때 no값으로 데이터 가져와서 장바구니에 넣기
	@GetMapping("/attention/cart")
	public JsonResult chartList(@RequestParam(value="no")int no) {
		System.out.println("AttentionController.chartList");
		
		AttentionVo attentionVo = attentionService.exeCart(no);
		
		System.out.println(attentionVo);
		
		return JsonResult.success(attentionVo);
	}

}
