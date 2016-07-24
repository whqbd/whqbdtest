package com.eachonline.demo.util;
import java.util.UUID;

public class UUIDUtils {

	public static String uuid(){
		
		return UUID.randomUUID().toString().replace("-", "");
		
	}
	
	public static void main(String[] args){
		
		System.out.println(uuid());
		
	}
	
}
