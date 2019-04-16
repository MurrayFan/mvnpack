package com.geeknotes.mvnpack.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	private static Properties properties = null;
	static {
		try {
			properties = new Properties();
			// 1.加载properties文件
			InputStream is = new FileInputStream("conf/config.properties");
			// 2.加载输入流
			properties.load(is);
		} catch (Exception e) {
		}
	}

	public static String get(String key, String defaultVal) {
		String s = properties.getProperty(key, defaultVal);
		return s;
	}

	public static int get(String key, Integer defaultVal) {
		String s = properties.getProperty(key);
		if (s == null) {
			return defaultVal;
		}
		return Integer.parseInt(s);
	}

	public static boolean isEquals(String key, String expectVal) {
		String s = properties.getProperty(key);
		if (s == null || expectVal == null) {
			return false;
		}
		return s.equals(expectVal);
	}
}
