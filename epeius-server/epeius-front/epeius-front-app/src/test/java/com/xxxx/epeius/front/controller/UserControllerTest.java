package com.xxxx.epeius.front.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Description: 示范单元测试
 * Author: lishangmin
 * Created: 2019-04-12 13:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	/**
	 * 测试查询是否成功 -- Http Get
	 */
	@Test
	public void whenQueryUserSuccess() throws Exception {
		MvcResult result = mockMvc
				.perform(
						MockMvcRequestBuilders
								.get("/user")
								.param("username","success")
								.contentType(MediaType.APPLICATION_JSON_UTF8)
				)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();

	}

	/**
	 * 测试时候创建成功 -- Http POST
	 */
	@Test
	public void whenCreateUserSuccess() throws Exception {
		MvcResult result = mockMvc
				.perform(
						MockMvcRequestBuilders
								.post("/user")
								.contentType(MediaType.APPLICATION_XML)
								.content("<A></a>")

				)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.print())
				.andReturn();
	}
}