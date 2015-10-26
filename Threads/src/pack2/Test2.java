package pack2;

public class Test2 {
	public static Thread thread1;
	public static Thread thread2;

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		System.out.println("Threads have been signalled to start...");
	}

	public Test2() {
		thread1 = new Thread(new Task1());
		thread2 = new Thread(new Task2());																																																																																																																																																																																								
		thread1.start();
		thread2.start();
	}

	public static class Task1 implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread 1 started.");
			try {
				System.out.println("Thread 1 sleeping for 1 second.");
				Thread.sleep(1000);
				System.out.println("Thread 1 waiting for thread 2 to finish.");
				thread2.join();
				System.out.println("Thread 1 resuming.");
				System.out.println("Thread 1 done.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static class Task2 implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread 2 started.");
			try {
				System.out.println("Thread 2 sleeping for 10 seconds.");
				Thread.sleep(10000);
				System.out.println("Thread 2 done.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}