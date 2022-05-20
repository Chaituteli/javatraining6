package com.vstl.loops;

public class Dowhileloop {
	
	public void collegesInThePunecity() {
		
		int intcolleges=1;
		do {
			System.out.println("show the total number of college in pune:"+intcolleges);
			intcolleges++;
		}
		while(intcolleges<=27);
	
	}
	//it executed at list after the exception

		public void hospitaltime() {
			
			int inthospitaltime=34;
			do {
				System.out.println("hospital time :"+inthospitaltime);
				inthospitaltime++;
			}
			while(inthospitaltime<=27);
		}
		
  //it is having the error 
	public void weeksInMonth() {
		String strArray[]= {"sun","mon","tuse","wed","thar","fri","sta"};
		int intcounter=1;
		do {
			System.out.println(intcounter);
			++intcounter;
		}
		while (strArray.length>intcounter);
			System.out.println("week day:"+strArray[intcounter]);
			if(strArray[intcounter].equals("sta")) {
				System.out.println(" good day");
				}
				
	
	}}
