package com.geeknotes.mvnpack.main;

import com.geeknotes.mvnpack.util.Config;

public class Luncher {

	public static void main(String[] args) {
		System.out.println("当前的数据库是:" + Config.get("DATABASE", "mysql"));
	}

}
