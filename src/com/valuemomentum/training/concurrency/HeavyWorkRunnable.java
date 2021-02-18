package com.valuemomentum.training.concurrency;

public class HeavyWorkRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("doing heavy processing-start"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("doing heavy processing-end"+Thread.currentThread().getName());
	}

	private void doDBProcessing()throws InterruptedException  {
		Thread.sleep(1000);
		
	}

}
