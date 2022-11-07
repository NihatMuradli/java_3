package main;

public class Homework_3_else_if {
	public static void main(String[] args) {
	 int bookPageCount = 250;
	 if(bookPageCount>600) {
		    System.out.println("Bu kitab 3 cildlidir.");
	 }else if (bookPageCount>500) {
		    System.out.println("Bu kitab 2 cildlidir.");
	 }else if (bookPageCount>400) {
		    System.out.println("Bu kitab çox qalındır.");
	 }else if (bookPageCount>300) {
			System.out.println("Bu kitab qalındır.");
	 }else{
			System.out.println("Bu kitab qalın deyil.");
	 }
	 
	 //and
     boolean b1 = true;
	 boolean b2 = true;
	 if (b1&&b2) {
		 System.out.println("Dogrudur");
	 }else {
		 System.out.println("Sehvdir");
	 }
	 //or
	 boolean b3 = true;
	 boolean b4 = false;
	 if (b3||b4) {
		 System.out.println("Dogrudur");
	 }else {
		 System.out.println("Sehvdir");
	 }
	 //and-or
	 if ((2 > 3 && 5 < 2) | (3 < 2)) {
		 System.out.println("Dogrudur");
	 }else {
		 System.out.println("Sehvdir");
	 }
	 
    //not
	 if ((2 > 3 && 5 < 2) | !(3 < 2)) {
		 System.out.println("Dogrudur");
	 }else {
		 System.out.println("Sehvdir");
	 }
	}
}
