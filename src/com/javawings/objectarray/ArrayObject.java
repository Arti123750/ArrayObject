package com.javawings.objectarray;
 
class Teacher 
{
int id;
String TeachName;
public Teacher(int id, String TeachName) {
	System.out.println("Teacher id: "+id+" Teacher Name: "+TeachName);
	System.out.println();
}
}

class Student
{
int rollNo;
String studName;
Student(int rollNo,String studName )
{
	this.rollNo=rollNo;
	this.studName=studName;
	System.out.println("Student Roll no: "+ rollNo+" studName: "+studName);	
	}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", studName=" + studName + "]";
}
}
public class ArrayObject {

	public static void main(String[] args) {
		Teacher [] t1=new Teacher[3];
		
		t1[0]=new Teacher(101,"Mr.Sharma");
		t1[1]=new Teacher(102,"Mr.Kulkarni");
		t1[2]=new Teacher(103,"Mr.Patil");
		
		Student [] s1=new Student[2];
		s1[0]=new Student(10,"Arti");
		s1[1]=new Student(20,"Pooja");
		
		Object obj[] = {t1,s1};//Object Array
		System.out.println("show only Student Data");
		
	if(obj instanceof Student[])
	{
		for (Object obj1 : obj) {
			
			System.out.println(obj);
			
		}
	}
	}
}
