package com.positivethinking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkillsTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsTestingApplication.class, args);
	}

	/**
	 * convert a list to a sublist list.
	 * 
	 * @param list: list of integer.
	 * @param nb: maximal number of list by sublist.
	 * @return list of sublist.
	 */
	public static List<List<Integer>> getListOfSublist(List<Integer> list, Integer nb) {
		if(list == null || nb == null) {
			return null;
		}
		List<List<Integer>> listOfSub = new ArrayList<List<Integer>>();
		for (int i = 0; i + nb < list.size(); i += nb) {
			listOfSub.add(list.subList(i, i + nb));
		}
		if (list.size() % nb != 0) {
			listOfSub.add(list.subList(list.size() - (list.size() % nb), list.size()));
		}
		return listOfSub;
	}
}



