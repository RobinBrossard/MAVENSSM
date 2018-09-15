/**
 * @Project MAVENSSM
 * @Package com.zlw.test.service
 * @filename UserService.java
 * @author robin	
 * 2018年9月13日 下午11:10:11
 * TODO	
 */
package com.zlw.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zlw.test.mapper.UserMapper;

/**
 * @Project MAVENSSM
 * @Package com.zlw.test.service
 * @filename UserService.java
 * @author robin	
 * 2018年9月13日 下午11:10:11
 * TODO	
 */
@Service
public class UserService {
 
	@Resource
	private UserMapper userMapper;
 
	public String findUserById(int id) {
		return userMapper.findUserById(id);
 
	}
 
}