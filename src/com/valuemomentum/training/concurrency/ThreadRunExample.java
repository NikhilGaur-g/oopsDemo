package com.valuemomentum.training.concurrency;
//main for mythread2 and heavyworkrunnable
public class ThreadRunExample {

	public static void main(String[] args) {
		Thread t1=new Thread(new HeavyWorkRunnable(),"t1");
		Thread t2=new Thread(new HeavyWorkRunnable(),"t2");
		System.out.println("start runnable thread");
		t1.start();
		t2.start();
		System.out.println("Runnable thread has started");
		Thread t3=new MyThread2("t3");
		Thread t4=new MyThread2("t4");
		System.out.println("starting mythread");
		t3.start();
		t4.start();
		System.out.println("my thread has started");

	}

}
