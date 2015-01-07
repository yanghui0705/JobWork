package com.redis.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import redis.clients.jedis.Jedis;

public class AppTest {

	public static void main(String[] args) {
		Logger loger = LogManager.getLogger("[jedis]");
		String ip = "localhost";
		int port = 6379;
		
		Jedis jedis = new Jedis(ip, port);
		loger.info("����redis������ "+ip+" : "+port);
		
		String key = "yanghui";
		loger.info("��ȡ��"+key+"��ӳ���value = "+jedis.get(key));
		jedis.close();
		jedis = null;
		
		loger.info("�������...");
	}
}
