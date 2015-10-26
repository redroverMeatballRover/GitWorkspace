package pack;

public class ThreadTest2 {
	public Thread thread1;
	public Thread thread2;

	public static String sharedData = "Executions: ";

	public static void main(String[] args) {
		new ThreadTest2();
	}

	public ThreadTest2() {
		thread1 = new Thread(new Task1());
		thread2 = new Thread(new Task2());
		thread1.start();
		thread2.start();
	}

	public synchronized void execute() {
		System.out.println("A thread is executing the synchronized method...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void execute2() {
		System.out.println("Accessing synchronized data...");
		synchronized (sharedData) {
			try {
				sharedData += "One ";
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(sharedData);
	}

	public class Task1 implements Runnable {
		@Override
		public void run() {
			System.out.println("Thread 1 is attempting to execute a synchronized method...");
			execute();
			System.out.println("Thread 1 finished executing a synchronized method.");
			System.out.println("Thread 1 is attempting to access synchronized data...");
			execute2();
			System.out.println("Thread 1 has completed access to synchronized data...");
		}
	}

	public class Task2 implements Runnable {
		@Override
		public void run() {
			System.out
					.println("Thread 2 is attempting to execute a synchronized method...");
			execute();
			System.out
					.println("Thread 2 finished executing a synchronized method.");
			System.out
					.println("Thread 2 is attempting to access synchronized data...");
			execute2();
			System.out
					.println("Thread 2 has completed access to synchronized data...");
		}
	}

	// public static class Task1 implements Runnable
	// {
	//
	// @Override
	// public void run()
	// {
	// System.out.println("Thread 1 started.");
	// try
	// {
	// System.out.println("Thread 1 sleeping for 1 second.");
	// Thread.sleep(1000);
	// System.out.println("Thread 1 waiting for thread 2 to die!!!");
	// thread2.join();
	// System.out.println("Thread 1 resuming.");
	// System.out.println("Thread 1 done.");
	// }
	// catch (InterruptedException e)
	// {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	// public static class Task2 implements Runnable
	// {
	//
	// @Override
	// public void run()
	// {
	// System.out.println("Thread 2 started.");
	// try
	// {
	// System.out.println("Thread 2 sleeping for 10 seconds.");
	// Thread.sleep(10000);
	// System.out.println("Thread 2 done.");
	// }
	// catch (InterruptedException e)
	// {
	// e.printStackTrace();
	// }
	// }
	// }
}