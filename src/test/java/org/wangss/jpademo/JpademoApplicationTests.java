package org.wangss.jpademo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wangss.jpademo.Jpa.IStudentJpa;
import org.wangss.jpademo.Model.Student;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpademoApplicationTests {

	@Autowired
	private IStudentJpa jpa;

	@Test
	public void contextLoads() {
		List<Student> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Student s = new Student();
			s.setAddress("peking");
			s.setName("beijing");
			jpa.saveAndFlush(s);
		}

	}

}
