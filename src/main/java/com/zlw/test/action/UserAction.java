/**
 * @Project MAVENSSM
 * @Package com.zlw.test.action
 * @filename UserAction.java
 * @author robin	
 * 2018年9月13日 下午11:11:11
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
 * 2018年9月13日 下午11:11:11
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
			model.addAttribute("username", "未找到");
		}
		return "test";
	}
 
}