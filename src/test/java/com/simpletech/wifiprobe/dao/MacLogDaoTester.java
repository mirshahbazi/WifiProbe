package com.simpletech.wifiprobe.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simpletech.wifiprobe.model.MacLog;
import com.simpletech.wifiprobe.util.JacksonUtil;

/**
 * 数据库表t_mac_log的Dao层测试类
 * @author 树朾
 * @date 2015-11-02 17:16:40 中国标准时间
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class MacLogDaoTester {

	@Autowired
	MacLogDao dao;
	
	@Test
	public void insert() throws Exception{
		MacLog model = new MacLog();
		Object result = dao.insert(model);
		System.out.println(JacksonUtil.toJson(result).replace("{","\n{"));
	}
	
	@Test
	public void update() throws Exception {
		MacLog model = new MacLog();
		Object result = dao.update(model);
		System.out.println(JacksonUtil.toJson(result).replace("{","\n{"));
	}
	
	@Test
	public void delete() throws Exception {
		Object result = dao.delete("1");
		System.out.println(JacksonUtil.toJson(result).replace("{","\n{"));
	}
	
	@Test
	public void countAll() throws Exception {
		Object result = dao.countAll();
		System.out.println(JacksonUtil.toJson(result).replace("{","\n{"));
	}

	@Test
	public void findByPage() throws Exception {
		Object result = dao.findByPage(5,0);
		System.out.println(JacksonUtil.toJson(result).replace("{","\n{"));
	}
	
}
