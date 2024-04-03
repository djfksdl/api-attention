package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/attention/mainmenu")
	public JsonResult getList(@RequestParam(value="category") String category) {
		System.out.println("AttentionController.getList");
		
		System.out.println(category);
		List<AttentionVo> productList = attentionService.exeList(category);
		System.out.println(productList);
		
		//만약 이미지 없는게 있으면 기본 이미지 넣기
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getSave_name() == null) {
				productList.get(i).setSave_name("imgReady.png");
			}
		}
		
		return JsonResult.success(productList);
	}
	
	//이미지 눌렀을때 no값으로 데이터 가져와서 장바구니에 넣기
	@GetMapping("/attention/mainmenu/cart")
	public JsonResult cartList(@RequestParam(value="no")int no) {
		System.out.println("AttentionController.cartList");
		
		AttentionVo attentionVo = attentionService.exeCart(no);
		
		System.out.println(attentionVo);
		
		return JsonResult.success(attentionVo);
	}
	
	//삭제하기
	@DeleteMapping("/attention/mainmenu/delete")
	public JsonResult delete(@RequestParam(value="no")int no) {
		System.out.println("AttentionController.delete");
		
		attentionService.exeRemove(no);
		
		
		return null;
	}

}
