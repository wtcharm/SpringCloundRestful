package cn.cgg.microrestful.provider.dept.rest;



import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.cgg.microrestful.service.IDeptService;
import cn.cgg.microrestful.vo.Dept;

@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService ;
	@PostMapping("/dept/add")
	public Object add(@RequestBody Dept dept) {
		return this.deptService.add(dept) ;
	} 
	@GetMapping("/dept/list")
	public Object list() {
		return this.deptService.list() ;
	}
//	@PostMapping("/dept/get")
//	public Object get(@RequestBody long deptno) {
//		return this.deptService.get(deptno) ;  
//	}
	@GetMapping("/dept/get/{deptno}")
	public Object get(@PathVariable("deptno") long deptno) {
		return this.deptService.get(deptno) ; 
	}
}
