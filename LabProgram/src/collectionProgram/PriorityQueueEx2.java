package collectionProgram;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> stuQ = new PriorityQueue<Student>();
		stuQ.add(new Student(201, "Sanjay","sanjay@gmail.com",90.00,23));
		stuQ.add(new Student(12, "Kajol","kajol@gmail.com",78.90,22));
		stuQ.add(new Student(500, "Koushik","koushik@gmail.com",67.90,34));
		stuQ.add(new Student(423, "Shanthraj","shanthraj@gmail.com",56.78,23));
		stuQ.add(new Student(8, "Gaurav","gaurav@gmail.com",78.66,24));
		
		System.out.println(stuQ);
	}

}
