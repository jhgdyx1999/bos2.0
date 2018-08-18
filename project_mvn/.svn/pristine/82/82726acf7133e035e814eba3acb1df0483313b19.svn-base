package com.itheima.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.itheima.dao.DepartmentDao;
import com.itheima.entity.Department;

/**
 * @author Jack
 * @datetime 2018年8月13日 下午4:53:24
 * 
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> findAll() {
		return (List<Department>) getHibernateTemplate().find("from Department");
	}

}
