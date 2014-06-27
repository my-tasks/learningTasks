package com.kk.study.buildtools.log;

import com.kk.study.buildtools.util.ClassName;

public class Logger {
	
public static void log(String message){
		System.out.println("["+ClassName.getCurrentClassName()+"] : "+message);
}

}
