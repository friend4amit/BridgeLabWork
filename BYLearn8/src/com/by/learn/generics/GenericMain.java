package com.by.learn.generics;



public  class  GenericMain {
	
	/**
	 * Max Number - TC1  
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public Integer getMaxNumber(Integer a,Integer b ,Integer c) {
		if(a.compareTo(b)==-1) {
			if(b.compareTo(c)==-1){
				System.out.println(" C is the maximum number ->"+c);
				return c;
			}else {
				System.out.println(" B is the maximu number -> "+b);
				return b;
			}
		}
		else if(a.compareTo(b)==0) {
			if(b.compareTo(c)==-1){
				System.out.println(" C is the maximum number -->"+c);
				return c;
			}else if(b.compareTo(c)==0) {
				System.out.println(" All number are equal -->" + a);
				return a;
			}else {
				System.out.println(" A and B are maximum number -> "+a);
				return a;
			}
			
		}
		else {
			
			if(b.compareTo(c)==-1) {
				
				if(c.compareTo(a)==-1) {
					System.out.println(" A is the maximum number -> "+a);
					return a;
				}else {
					System.out.println(" C is the maximum number -> "+c);
					return c;
				}
				
			}else {
				System.out.println(" A is the maximum number-> "+a);
				return a;
			}
		}
	
}

/**
 * Maxnumber - UC2  
 * @param a
 * @param b
 * @param c
 * @return
 */
public Double getMaxFloatNumber(Double a,Double b ,Double c) {
		if(a.compareTo(b)==-1) {
			if(b.compareTo(c)==-1){
				System.out.println(" C is the maximum double number ->"+c);
				return c;
			}else {
				System.out.println(" B is the maximu double number -> "+b);
				return b;
			}
		}
		else if(a.compareTo(b)==0) {
			if(b.compareTo(c)==-1){
				System.out.println(" C is the maximum double number -->"+c);
				return c;
			}else if(b.compareTo(c)==0) {
				System.out.println(" All number are equal -->" + a);
				return a;
			}else {
				System.out.println(" A and B are maximum double number -> "+a);
				return a;
			}
			
		}
		else {
			
			if(b.compareTo(c)==-1) {
				
				if(c.compareTo(a)==-1) {
					System.out.println(" A is the maximum double number -> "+a);
					return a;
				}else {
					System.out.println(" C is the maximum double number -> "+c);
					return c;
				}
				
			}else {
				System.out.println(" A is the maximum double number-> "+a);
				return a;
			}
		}
}

/**
 * Maxnumber - UC3  
 * @param a
 * @param b
 * @param c
 * @return
 */
public String getMaxString(String a,String b ,String c) {
	if(a.compareTo(b)==-1) {
		if(b.compareTo(c)==-1){
			System.out.println(" C is the maximum String ->"+c);
			return c;
		}else {
			System.out.println(" B is the maximu String -> "+b);
			return b;
		}
	}
	else if(a.compareTo(b)==0) {
		if(b.compareTo(c)==-1){
			System.out.println(" C is the maximum String -->"+c);
			return c;
		}else if(b.compareTo(c)==0) {
			System.out.println(" All number are equal -->" + a);
			return a;
		}else {
			System.out.println(" A and B are maximum String -> "+a);
			return a;
		}
		
	}
	else {
		
		if(b.compareTo(c)==-1) {
			
			if(c.compareTo(a)==-1) {
				System.out.println(" A is the maximum String -> "+a);
				return a;
			}else {
				System.out.println(" C is the maximum String -> "+c);
				return c;
			}
			
		}else {
			System.out.println(" A is the maximum String-> "+a);
			return a;
		}
	}
}

/**
 * Refactor 1
 * This method defines the generic method to get Maximum 
 * @param <T>
 * @param a
 * @param b
 * @param c
 * @return
 */
public <T extends Comparable<T>> T getMaxGeneric(T a,T b,T c) {
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
	public static void main(String[] args) {
		GenericMain gm1=new GenericMain();
		gm1.getMaxNumber(1, 2,1);
		gm1.getMaxFloatNumber(8.0, 2.5,2.9);
		gm1.getMaxString("Banana", "Peach", "Apple");
		// gm1.printNumber(5,"Amit");
		
		gm1.getMaxGeneric(1, 2,5);
		gm1.getMaxGeneric(8.0, 2.5,2.9);
		gm1.getMaxGeneric("Banana", "Peach", "Apple");
		
		
		// Refactor 2
		System.out.println("Parametrized Generics  ---> ");
		MaxGeneric<Integer> mg1=new MaxGeneric(1, 3, 5);
		mg1.testMaximum();
		
		MaxGeneric<Double> mg2=new MaxGeneric(2.3, 3.6, 0.4);
		mg2.testMaximum();
		
		MaxGeneric<String> mg3=new MaxGeneric("Apple","Peach","Bannana");
		mg3.testMaximum();
		
		System.out.println("Generics not parametrized ************");
		MaxGeneric mg11=new MaxGeneric(1, 3, 5);
		mg11.testMaximum();
		
		mg11=new MaxGeneric(2.3, 3.6, 0.4);
		mg11.testMaximum();
		
		mg11=new MaxGeneric("Apple","Peach","Bannana");
		mg11.testMaximum();
	}
}
