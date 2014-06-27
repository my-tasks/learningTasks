package com.kk.study.buildtools.util;

public class ClassName {

	public static String getCurrentClassName() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException ex) {
			String name =ex.getStackTrace()[2].getClassName(); 
			return name.substring(name.lastIndexOf(".")+1);
		}
	}
}
