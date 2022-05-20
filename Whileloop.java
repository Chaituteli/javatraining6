package com.vstl.loops;

public class Whileloop {

	public  void studenrollnowhileloop() {
	String strArray[]= {"chaitali","rohini","prachi","jyoti","aditi ","nikita","ankita","kirti"};
	
	int intcounter=0;
	
	
	while (strArray.length>intcounter) {
		System.out.println("student name:"+strArray[intcounter]);
		if(strArray[intcounter].equals("kirti")) {
			System.out.println(" is presented");
			break;
		}
		intcounter++;
	}
	}
	
	
	public void numbercount() {
		int intnumber[]= {45,78,56,17,90,34,56,78,89};
	
	int intCounter=5;
	while(intnumber.length>intCounter) {
		System.out.println("copy number:"+intnumber[intCounter]);
		break;
		}
		intCounter++;
	
	}	
	
}
