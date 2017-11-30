package com.vmware.dc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;

public class Garbag {
	static Logger log = Logger.getLogger(Garbag.class);
	int[] a = { 10, 30 };

	public Garbag() {
		log.info("garbage demo");
		log.info("garbag");
	}

	public static void main(String[] args) {
		PropertyConfigurator.configure("log.prop");
		Garbag g1 = new Garbag();
		Garbag g2 = new Garbag();

		g1 = null;
		Demo d1 = new Demo();
		d1.add();
		int[] b = {};
		try {
			log.info("Array OUT +++++++++++++++++++++++++");
			log.info(b[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			log.error(e.getMessage());
		}
		log.info("=============");
		bigArray();
		log.info("=============");
		bigHashmap();
		log.info("=============");
		// stem.gc();
		log.info("=============");
		testStringBuffer();
		log.info("=============");
	}

	private static void testStringBuffer() {
		log.info("StringBufferTest");
		StringBuffer sb = new StringBuffer();
		log.info(sb.capacity());
		for (int i = 0; i < 10000; i++) {
			sb.append("all is my java program is here:" + i);
			if (i % 100 == 0) {
				log.info(sb.capacity());
				// sb.ensureCapacity(100);
				log.info("Cap:" + sb.capacity());
			}
		}
		log.info(sb);

	}

	private static void bigHashmap() {
		log.info("HashMapTest");
		Map<String, String> sp = new HashMap<String, String>();
		for (int i = 0; i < 10000; i++) {
			sp.put("key" + i, "value" + i);
		}

		log.info(sp.size());

	}

	private static void bigArray() {
		log.info("ArrayTest");
		List<String> op = new ArrayList<String>();
		for (int i = 0; i < 10000; i++) {
			op.add("operation" + i);

			if (i % 1000 == 0) {
				log.info(i + ":" + op.size());
			}
		}

	}

	@Override
	public String toString() {

		this.grpvarags(10, 20, 40, 50);
		this.grpvarags(a);
		return "Garbag []";
	}

	public void grpvarags(int... a) {
		log.info("var args Test");

		for (int b : a) {
			log.info(b);
		}
		int i = a.length == 0 ? 0 : 1;

		log.info("Total:" + a.length);
		try {
			exceptionCatcher();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info(e.getMessage());
		}

	}

	private void exceptionCatcher() throws IOException {
		throw new IOException();

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		Garbag t = this;
		log.info(t);
		log.info("garbage collected");
	}
}
