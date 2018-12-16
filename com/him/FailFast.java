package com.him;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFast {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		Map m = Collections.synchronizedMap(map);
		Iterator<String> iterator = m.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(m.get(iterator.next()));
			m.put("key4", "value4");
		}
	}
}