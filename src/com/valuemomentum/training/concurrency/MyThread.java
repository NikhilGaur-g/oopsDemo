package com.valuemomentum.training.concurrency;

public class MyThread extends Thread {

	public static void main(String[] args) {
		MyThread omt=new MyThread();
		omt.create();
	
		System.out.println("this is main thread");

	}

	private void create() {
		Thread objth=new Thread(this);
		objth.start();
		
		
	}
	public void run() {
		while(true)
		{
			try {
				System.out.println("this is child thread");
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	

		
	}


