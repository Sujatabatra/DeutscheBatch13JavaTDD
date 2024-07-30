package com.sujata.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadTask implements Runnable {

	private String taskName;

	public ThreadTask(String taskName) {
		super();
		this.taskName = taskName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing " + taskName);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" after waking up executing "+taskName);

	}

}

public class FirstDemoClass {

	public static void main(String[] args) {
//		Executor executor = Executors.newFixedThreadPool(3);

		ExecutorService executorService=Executors.newFixedThreadPool(3);
		for(int taskNo=1;taskNo<=8;taskNo++) {
			executorService.execute(new ThreadTask("task "+taskNo));
			
		}
		executorService.execute(new ThreadTask("task"+9));
		executorService.execute(new ThreadTask("task"+10));
		
		executorService.shutdown();  //what ever tasks are already submitted execute that and don't accept any new task beyond it
		
		executorService.execute(new ThreadTask("task"+11));
	}

}
