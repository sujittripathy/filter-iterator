package com.filter.iterator.java;

/**
 * Filter class filtering Integers which is less than 0
 * 
 * @author sujittripathy
 *
 */
public class IIntegerTest implements IObjectTest {

	/**
	 * Filter out the numbers which is less than 0
	 */
	@Override
	public boolean test(Object a) {
		return (Integer)a<0;
	}

}
