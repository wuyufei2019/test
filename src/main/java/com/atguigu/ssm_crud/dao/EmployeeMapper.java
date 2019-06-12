package com.atguigu.ssm_crud.dao;

import com.atguigu.ssm_crud.beans.Employee;
import com.atguigu.ssm_crud.beans.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
	
//	List<Employee> selectByExampleWithDept(EmployeeExample example);
//
//    Employee selectByPrimaryKeyWithDept(Integer employeeId);
	
    //以下是自动生成的
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}