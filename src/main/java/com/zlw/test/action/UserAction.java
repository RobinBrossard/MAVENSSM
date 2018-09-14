/**
 * @Project MAVENSSM
 * @Package com.zlw.test.action
 * @filename UserAction.java
 * @author robin	
 * 2018��9��13�� ����11:11:11
 * TODO	
 */
package com.zlw.test.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zlw.test.service.UserService;

/**
 * @Project MAVENSSM
 * @Package com.zlw.test.action
 * @filename UserAction.java
 * @author robin	
 * 2018��9��13�� ����11:11:11
 * TODO	
 */
@Controller
@RequestMapping("/user")
public class UserAction {
 
	@Resource
	private UserService userService;
 
	@RequestMapping("/findUserById")
	public String findUserById(int id, Model model) {
		String username = userService.findUserById(id);
		if (username != null) {
			model.addAttribute("username", username);
		} else {
			model.addAttribute("username", "δ�ҵ�");
		}
		return "test";
	}
 
}