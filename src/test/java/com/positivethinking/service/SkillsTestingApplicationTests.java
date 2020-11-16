package com.positivethinking.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkillsTestingApplicationTests {

	
	@Test
	void shouldReturnNullListUsingNullList() {

		List<List<Integer>> listOfSub = SkillsTestingApplication.getListOfSublist(null, 2);
		assertThat(listOfSub).isNull();
	}

	@Test
	void shouldReturnNullListUsingNullNb() {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		List<List<Integer>> listOfSub = SkillsTestingApplication.getListOfSublist(list, null);
		assertThat(listOfSub).isNull();
	}

	@Test
	void shouldReturnFourSubList() {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		List<List<Integer>> listOfSub = SkillsTestingApplication.getListOfSublist(list, 2);
		assertThat(listOfSub.size()).isEqualTo(4);
		assertThat(listOfSub.get(0).size()).isEqualTo(2);
		assertThat(listOfSub.get(1).size()).isEqualTo(2);
		assertThat(listOfSub.get(2).size()).isEqualTo(2);
		assertThat(listOfSub.get(3).size()).isEqualTo(1);
	}

}
