package com.javawings.objectarray;

public class ArrayObject {

	public static void main(String[] args) {
		
		Student s1 = new Student(12, "John Bosco");
		Student s2 = new Student(13, "Michel");
		
		Teacher t1 = new Teacher(23, "Jenelia");
		Teacher t2 = new Teacher(24, "Jelly ket");
		
		Object[] obArray = {s1, s2, t1, t2};
		System.out.println("Show only student data");
		
		for (Object object123 : obArray) {
			
			if(object123 instanceof Student)
			//if(object123.getClass().getName()== "com.javawings.objectarray.Student") {
				
				 System.out.println(object123);
			 }
		}
		
	}
	class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id +"  "+  name ;
	}
	
	
	
}
class Teacher{
	
	int teacher_id;
	String name;
	public Teacher(int teacher_id, String name) {
		super();
		this.teacher_id = teacher_id;
		this.name = name;
	}

}
