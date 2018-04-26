package com.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
	
	private final static Map<String, String> aliasMap = new ConcurrentHashMap<String, String>(16);

	public static void main(String[] args) {
		aliasMap.put("aa", "qq");
		System.out.println(canonicalName("aa"));

	}
	public static String canonicalName(String name) {
		String canonicalName = name;
		// Handle aliasing...
		String resolvedName;
		do {
			resolvedName = aliasMap.get(canonicalName);
			if (resolvedName != null) {
				canonicalName = resolvedName;
			}
		}
		while (resolvedName != null);
		return canonicalName;
	}
}
