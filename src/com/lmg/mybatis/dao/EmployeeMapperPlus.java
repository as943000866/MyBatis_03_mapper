package com.lmg.mybatis.dao;

import com.lmg.mybatis.bean.Employee;

public interface EmployeeMapperPlus {
	
	public Employee getEmpById(Integer id);
	
	public Employee getEmpAndDept(Integer id);
}
