package com.filter.iterator.java;

/**
 * If the string is empty then that will be filtered out and wouldn't part
 * of filtered list
 * 
 * @author sujittripathy
 *
 */
public class IStringTest implements IObjectTest {

	@Override
	public boolean test(Object a) {
		return ((String)a).isEmpty();
	}

}
