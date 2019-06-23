package com.demo.utils;

import java.util.Date;

public class TemplateToolMethods {
	/**
	 * in template support date.longtime()
	 * @param date
	 * @return
	 */
	public static String longtime(Date date){
		return String.valueOf(date.getTime());
	}
	
	public void init() {
		System.out.println("xxxxxxxxx init");
	}
	
	public void inited(){
		System.out.println("xxxxxxxxx inited");
	}
}
