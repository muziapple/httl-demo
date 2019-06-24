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
		System.out.println("xxxxxxxxx init 将在属性注入完成后执行");
	}
	
	public void inited(){
		System.out.println("xxxxxxxxx inited 所有扩展点初始化完后执行，以初始化先后逆序执行");
	}
}
