package collectionProgram;

import java.util.Comparator;

public class CompareStudentage implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge().compareTo(o2.getAge());
	}

}
