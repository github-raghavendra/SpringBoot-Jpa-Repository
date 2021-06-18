package com.springBoot.jpa.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.springBoot.jpa.service.GuideService;
import com.springBoot.jpa.service.StudentService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = OneToManyController.class)
public class OneToManyControllerTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private StudentService studentService;

	@MockBean
	private GuideService guideService;

	@Test
	public void saveStudent_test() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders.get("/t1").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(request).andExpect(status().isCreated())
								.andReturn();

		logger.info("The MvcResult is -> {}", result);
	}
}
