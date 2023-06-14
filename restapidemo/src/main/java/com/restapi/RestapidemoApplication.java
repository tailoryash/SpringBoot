package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class RestapidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapidemoApplication.class, args);
//		String s = "Hey, I am Yash Tailor. Working at I am Simform Solutions";
//		String[] strArr = s.split(" ");
//		HashMap<String, Integer> res = new HashMap<>();
//		for (String ans:
//			 strArr) {
//			Integer index = res.get(ans);
//			if(index == null){
//				res.put(ans, 1);
//			}else{
//				res.put(ans, index+1);
//			}
//		}
//		for(Map.Entry<String, Integer> mp: res.entrySet()){
//			System.out.println(mp.getKey() + " " + mp.getValue());
//		}
//
//		Stream<String> countWords = Arrays.stream(s.replace(".", "").replace(",", "").split("\\s"));
//		System.out.println(countWords.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
	}
}
