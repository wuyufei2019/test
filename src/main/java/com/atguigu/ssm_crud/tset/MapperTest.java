package com.atguigu.ssm_crud.tset;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.ssm_crud.dao.DepartmentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations={"classpath:beans.xml"})
public class MapperTest {
	@Autowired
	DepartmentMapper dmapper;

	@Test	
	public void test(){
		System.out.println("oo");
	//System.out.println(dmapper);
	}

}
