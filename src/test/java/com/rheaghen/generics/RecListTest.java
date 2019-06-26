package com.rheaghen.generics;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RecListTest {

	@Test
	public void test() {

		Map<String, RecList<?>> cache = new HashMap<>();
		RecList<Record> records = new RecList<>();
		RecList<RecordA> recordsA = new RecList<>();
		RecList<RecordB> recordsB = new RecList<>();
		cache.put("1",records);
		cache.put("2",recordsA);
		cache.put("3",recordsB);

	}

}
