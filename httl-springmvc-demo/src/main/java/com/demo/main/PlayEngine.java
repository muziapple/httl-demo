package com.demo.main;

import httl.Engine;
import httl.Template;

import java.util.HashMap;
import java.util.Map;

public class PlayEngine {

	public static void main(String[] args) throws Throwable {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("user", "wei");
		parameters.put("books", "ag");
		
		//due to bug when parsing windows path, copy config file to class path
		Engine engine = Engine.getEngine("httl.properties");
		
		//need config
		//loaders=httl.spi.loaders.FileLoader
		//template.directory=
		Template template = engine.getTemplate("playengine.httl");
		
		//if only xxx_write.java WriterTemplate.doRenderStream throws UnsupportedOperationException
		//这里写死了outputstream，不像HttpServletResponse既可以取outputstream又可以取writer
		template.render("parameters", System.out);
	}

}
