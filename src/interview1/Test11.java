package interview1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test11 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("1", "val1");
		map.put("2", "val2");
		map.put("3", "val2");
		map.put("4", "val3");
		System.out.println(map);
		deleteFromMap(map, "val2");
		System.out.println(map);
	}

	public static Map<String, String> deleteFromMap(Map<String, String> cache, String val) {

		List<String> keyList = new ArrayList();

		Set<Map.Entry<String, String>> entrySet = cache.entrySet();
		Iterator<Map.Entry<String, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry en = itr.next();
			if (en.getValue() == val) {
				keyList.add((String)en.getKey());
				itr.remove();
			}
		}
		System.out.println(keyList);
//		for (String k : keyList) {
//			cache.remove(k);
//		}

		return cache;

	}

}
