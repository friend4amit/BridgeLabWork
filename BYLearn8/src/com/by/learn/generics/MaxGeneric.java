package com.by.learn.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxGeneric <T extends Comparable<T>> {
	T a,b,c;
	
	MaxGeneric(T a,T b,T c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void testMaximum(){
		getMaxGeneric(a, b, c);
	}
	
	T getMaxGeneric(T a,T b,T c) {
		if(a.compareTo(b)==-1) {
			if(b.compareTo(c)==-1){
				System.out.println(" C is the generic maximum  ->"+c);
				return c;
			}else {
				System.out.println(" B is the generic maximum  -> "+b);
				return b;
			}
		}
		else if(a.compareTo(b)==0) {
			if(b.compareTo(c)==-1){
				System.out.println(" C is the generic maximum  -->"+c);
				return c;
			}else if(b.compareTo(c)==0) {
				System.out.println(" All number are equal -->" + a);
				return a;
			}else {
				System.out.println(" A and B are generic maximum  -> "+a);
				return a;
			}
			
		}
		else {
			
			if(b.compareTo(c)==-1) {
				
				if(c.compareTo(a)==-1) {
					System.out.println(" A is the generic maximum  -> "+a);
					return a;
				}else {
					System.out.println(" C is the generic maximum  -> "+c);
					return c;
				}
				
			}else {
				System.out.println(" A is the generic maximum -> "+a);
				return a;
			}
		}

	}
	
	T getMaxGenericOptional (Optional<T> a,Optional<T>  b,Optional<T>  c) {
		List<Optional<T>> l1=Arrays.asList(a,b,c);
			return a.get();
	}

	
}
