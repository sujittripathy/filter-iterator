package com.filter.iterator.java;

import java.util.ListIterator;

/**
 * Base class for Filtering Iterator framework where caller will send a request
 * to filter the iterator objects which will be filtered based on a criteria.
 * The caller will receive filtered object list after applying the filtration.
 *
 * @author sujittripathy
 */
public class FilteringIterator<E> {
	ListIterator<E> iterator;
	IObjectTest iObject;
	
	public FilteringIterator(ListIterator<E> i, IObjectTest iobj){
		this.iterator = i;
		this.iObject = iobj;
	}	
	
	public ListIterator<E> filteredIterator(){
		while(iterator.hasNext()){
			Object a = iterator.next();
			if(iObject.test(a)){
				iterator.remove();
			}
		}
		return iterator;
	}

}
