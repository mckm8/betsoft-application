package com.betsoft;

import com.betsoft.security.JwtTokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BetsoftApplicationTests {

	@Test
	public void contextLoads() {

		JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
		ReflectionTestUtils.setField(jwtTokenUtil, "expiration", 3600L);
		ReflectionTestUtils.setField(jwtTokenUtil, "secret", "secret");
		Map<String, Object> claims = new HashMap<>();
		System.out.println(jwtTokenUtil.doGenerateToken(claims, "mleko", "unknown"));	}


}
