package com.itheima.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.itheima.dao.DepartmentDao;
import com.itheima.entity.Department;
import com.itheima.service.DepartmentService;

/**
 * @author Jack
 * @datetime 2018年8月13日 下午4:52:38
 * 
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Resource
	private DepartmentDao departmentDao;

	@Override
	public List<Department> findAll() {
		
		return departmentDao.findAll();
	}

}
