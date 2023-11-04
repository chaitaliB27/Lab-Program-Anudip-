package collectionProgram;

import java.util.Comparator;

public class CompareStudentsmark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getTotalmarks().compareTo(o2.getTotalmarks());
	}

}
