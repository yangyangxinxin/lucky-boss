package com.luckysweetheart.boss;

import com.luckysweetheart.boss.dao.SystemUserMapper;
import com.luckysweetheart.boss.entity.SystemUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BossApplicationTests {

	@Resource
	private SystemUserMapper systemUserMapper;

	@Test
	public void contextLoads() {
		SystemUser systemUser = new SystemUser();
		systemUser.setCreateTime(new Date());
		systemUser.setEmail("981987024@qq.com");
		int id = systemUserMapper.insert(systemUser);
		System.out.println(id);
	}

}
