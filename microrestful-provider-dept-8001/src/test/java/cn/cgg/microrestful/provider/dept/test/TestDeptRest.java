package cn.cgg.microrestful.provider.dept.test;



import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.cgg.microrestful.provider.dept.Dept8001_ProviderStart;
import cn.cgg.microrestful.provider.dept.rest.DeptRest;
import cn.cgg.microrestful.vo.Dept;



@SpringBootTest(classes=Dept8001_ProviderStart.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDeptRest {
	private static Integer rand ; 
	static {
		rand = new Random().nextInt(Integer.MAX_VALUE) ;
	}
	@Resource 
	private DeptRest deptRest ;
	@Test
	public void testAdd() {
		Dept vo = new Dept() ;
		vo.setDname("新部门 - " + rand);
		vo.setLoc("新位置 - " + rand);
		System.err.println(this.deptRest.add(vo));
	}
	@Test
	public void testGet() {
		System.err.println(this.deptRest.get(1));
	}
	@Test
	public void testList() {
		System.err.println(this.deptRest.list());
	}
}

