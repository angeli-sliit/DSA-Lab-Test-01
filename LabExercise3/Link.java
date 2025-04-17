package LabExercise3;

//a. i
public class Link {
	public String name;
	public double average;
	public Link next;
	
	public Link(String name,double average) {
		this.name = name;
		this.average = average;
		next = null;
	}
	
	public void displayDetails() {
		System.out.println(" name : " + name + ",   Average : " + average);
	}
}
