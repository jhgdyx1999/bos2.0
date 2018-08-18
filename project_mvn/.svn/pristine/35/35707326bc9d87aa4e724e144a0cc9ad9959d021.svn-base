package com.itheima.web.action;

import java.util.List;
import javax.annotation.Resource;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.itheima.entity.Department;
import com.itheima.service.DepartmentService;

/**
 * @author Jack
 * @datetime 2018年8月13日 下午4:48:02
 * 
 */
@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace("/dept")
public class DepartmentAction extends BaseAction{

	private static final long serialVersionUID = -5536979988683600691L;
	
	@Resource
	private DepartmentService departmentService;

	@Action(value="list",results= {@Result(name="list",location="/index.jsp")})
	public String list() {
		List<Department> departments = departmentService.findAll();
		requestMap.put("departments", departments);
		return "list";
	}
}
