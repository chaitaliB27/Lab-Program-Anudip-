package jdk8910Features;

public class LambdaExpressionforThreadCreating {

	public static void main(String[] args)throws InterruptedException {
		Thread mylambdathread=new Thread(()->System.out.println("This is mylambda thread"));
		 mylambdathread.run();
		 mylambdathread.join();
		 
		 Thread mylambdathread2=new Thread(()->System.out.println("This is mylambda thread2"));
		 mylambdathread2.run();
		 
		 mylambdathread2.join();
		 
		 Thread mylambdathread3=new Thread(()->System.out.println("This is mylambda thread3"));
		 mylambdathread3.run();
		 

	}

}
