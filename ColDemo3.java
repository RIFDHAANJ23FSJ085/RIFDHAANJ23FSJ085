package zoho;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ColDemo3 {

	public static void main(String[] args) {
		List<Student> slist=new LinkedList<>();
		slist.add(new Student("Rifdhan"));
		slist.add(new Student("Sameer"));
		slist.add(new Student("Fuzail"));
		slist.add(new Student("Hamdhan"));
		slist.add(new Student("Arkham"));
		
		System.out.println(slist);
		System.out.println();
		Collections.shuffle(slist);
		System.out.println();
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println();
		System.out.println(slist);
		
		System.out.println();
		Iterator<Student> iter=slist.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		Collections.sort(slist, new Student());
		System.out.println(slist);
	}
}

class Student implements Comparable<Student>,Comparator<Student>{
	String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "My Name is : "+this.name;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.compareTo(o1);
	}
	
}