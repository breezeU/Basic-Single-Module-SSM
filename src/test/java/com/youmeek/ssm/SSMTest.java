package com.youmeek.ssm;

import com.youmeek.ssm.module.user.domain.SysUser;
import com.youmeek.ssm.module.user.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SSMTest {
	@Resource
	private SysUserService sysUserService;

	@Test
	public void test1() {
		SysUser sysUser = sysUserService.getById(1L);
		System.out.println("--------------------------------" + sysUser.toString());
	}
}
