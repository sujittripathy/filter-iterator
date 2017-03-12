package com.filter.iterator.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.filter.iterator.java.FilteringIterator;
import com.filter.iterator.java.IIntegerTest;
import com.filter.iterator.java.IStringTest;

/**
 * Unit testing classes for Iterator Filtering Framework for Integer and String
 * 
 * @author sujittripathy
 *
 */
public class FilterItearorTest {
	@Test
	public void testFilterIntegerLessThanZero(){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(-2);
		list.add(50);
		
		list.iterator();
		new FilteringIterator<Integer>(list.listIterator(), new IIntegerTest()).filteredIterator();
		
		assertThat(Arrays.asList(10,50), is(list));
	}
	
	@Test
	public void testFilterStringEmpty(){
		List<String> list = new ArrayList<>();
		list.add("Chicago");
		list.add("Los Angels");
		list.add("");
		list.add("New York");
		
		list.iterator();
		new FilteringIterator<String>(list.listIterator(), new IStringTest()).filteredIterator();
		
		assertThat(Arrays.asList("Chicago","Los Angels","New York"), is(list));
	}
}
