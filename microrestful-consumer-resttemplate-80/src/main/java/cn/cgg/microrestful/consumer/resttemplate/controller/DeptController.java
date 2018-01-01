package cn.cgg.microrestful.consumer.resttemplate.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.cgg.microrestful.vo.Dept;



@RestController
public class DeptController {
	public static final String DEPT_ADD_URL = "http://dept-8001.com:8001/dept/add" ;
	public static final String DEPT_GET_URL = "http://dept-8001.com:8001/dept/get" ;
	public static final String DEPT_LIST_URL = "http://dept-8001.com:8001/dept/list" ;
	@Resource
	private RestTemplate restTemplate ;
	@GetMapping("/consumer/dept/list") 
	public Object listDeptRest() {
		return this.restTemplate.getForObject(DEPT_LIST_URL, List.class) ;
	}
	@GetMapping("/consumer/dept/get")
	public Object getDeptRest(long deptno) {
		Dept dept = this.restTemplate.getForObject(DEPT_GET_URL + "/" + deptno, Dept.class) ;
		// Dept dept = this.restTemplate.postForObject(DEPT_GET_URL, deptno, Dept.class) ;
		return dept ; 
	} 
	@GetMapping("/consumer/dept/add") 
	public boolean addDeptRest(Dept dept) {
		Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class) ;
		return flag ; 
	}
}
