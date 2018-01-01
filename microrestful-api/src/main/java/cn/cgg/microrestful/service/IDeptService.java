package cn.cgg.microrestful.service;

import java.util.List;

import cn.cgg.microrestful.vo.Dept;

public interface IDeptService {

		public boolean add(Dept dept) ;
		public Dept get(Long deptno) ;
		public List<Dept> list() ;	
}
