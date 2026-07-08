package org.openmrs.calculation.result;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListResultTest {
	
	/**
	 * @see ListResult#getValues()
	 * @verifies return list of underlying values
	 */
	@Test
	public void getValues_shouldReturnListOfUnderlyingValues() throws Exception {
		Date date = new Date();
		
		ListResult lr = new ListResult();
		lr.add(new SimpleResult("A string", null));
		lr.add(new SimpleResult(Double.valueOf(2), null));
		lr.add(new SimpleResult(date, null));
		
		List<Object> values = lr.getValues();
		Assertions.assertEquals(lr.size(), values.size());
		Assertions.assertEquals("A string", values.get(0));
		Assertions.assertEquals(Double.valueOf(2), values.get(1));
		Assertions.assertEquals(date, values.get(2));
	}
}