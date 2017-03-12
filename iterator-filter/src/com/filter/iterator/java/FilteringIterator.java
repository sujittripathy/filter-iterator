package com.filter.iterator.java;

import java.util.ListIterator;

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
