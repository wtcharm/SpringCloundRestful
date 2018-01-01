package cn.cgg.microrestful.provider.dept.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import cn.cgg.microrestful.vo.Dept;

@Mapper
public interface IDeptDAO {
	public boolean doCreate(Dept dept) ;
	public Dept findById(Long deptno) ;
	public List<Dept> findAll() ; 
}
