package pack2;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;


public class Elevator {
	public Thread main;
	public Thread thread2;
	LinkedBlockingQueue<Integer> lb = new LinkedBlockingQueue<Integer>();
	public int num1;

	public static void main(String[] args) {
		Elevator ele = new Elevator();
	}

	public Elevator() {
		main = new Thread(new Task1());
		thread2 = new Thread(new Task2());
		main.start();
		thread2.start();
	}

	public class Task1 implements Runnable {

		@Override
		public void run() {

			// create loop with whcih the program asks for floors
			// add the scanner int to the arraylist queue

			if (!thread2.isAlive())
			{
				try {
					thread2.wait();
					System.out.println("Waiting...");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			while (thread2.isAlive()) {
				System.out.println("Choose a Floor: 1-10");
				Scanner s = new Scanner(System.in);
				int floorInput = s.nextInt();

				if (floorInput > 10 || floorInput < 0) {
					System.out.println("Floor does not exist.");
				} else if (floorInput == 0) {
					System.out.println("You have exitted the elevator.");
					System.exit(0);
				} else {
					lb.add(floorInput);
					//System.out.println("floor inputed into the queue.");
					// System.out.println(lb);
					// j++;
				}
			}
		}
	}

	public class Task2 implements Runnable {

		@Override
		public synchronized void run() {

			// motor class
			// looks in the queue and goes to the floors

			// while (!lb.isEmpty())
			int i = 0;
			int s = 0;
			int currentFloor = 0;
			while (i < 5) {
				
				//---------------------------------------------------------------------------------------------------//
				if (lb.contains(2)) {
					if (currentFloor != 2)
					{
						try {
							System.out.println("Travelling to 2nd Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 2nd Floor.");
						System.out.println("removed: " + s);
						currentFloor = 2;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				} 
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(1)) {
					
					if (currentFloor != 1)
					{
						try {
							System.out.println("Travelling to 1st Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 1st Floor.");
						System.out.println("removed: " + s);
						currentFloor = 1;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				} 
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(3)) {
					if (currentFloor != 3)
					{
						try {
							System.out.println("Travelling to 3rd Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 3rd Floor.");
						System.out.println("removed: " + s);
						currentFloor = 3;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				}	
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//	
				else if (lb.contains(4)) {
					if (currentFloor != 4)
					{
						try {
							System.out.println("Travelling to 4th Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 4th Floor.");
						System.out.println("removed: " + s);
						currentFloor = 4;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				} 
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(5)) {
					if (currentFloor != 5)
					{
						try {
							System.out.println("Travelling to 5th Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 5th Floor.");
						System.out.println("removed: " + s);
						currentFloor = 5;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				}
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(6)) {
					if (currentFloor != 6)
					{
						try {
							System.out.println("Travelling to 6th Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 6th Floor.");
						System.out.println("removed: " + s);
						currentFloor = 6;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				} 
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(7)) {
					if (currentFloor != 7)
					{
						try {
							System.out.println("Travelling to 7th Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 7th Floor.");
						System.out.println("removed: " + s);
						currentFloor = 7;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				}
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(8)) {
					if (currentFloor != 8)
					{
						try {
							System.out.println("Travelling to 8th Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 8th Floor.");
						System.out.println("removed: " + s);
						currentFloor = 8;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				}
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(9)) {
					if (currentFloor != 9)
					{
						try {
							System.out.println("Travelling to 9th Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 9th Floor.");
						System.out.println("removed: " + s);
						currentFloor = 9;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
				} 
				//---------------------------------------------------------------------------------------------------//
				//---------------------------------------------------------------------------------------------------//
				else if (lb.contains(10)) {
					if (currentFloor != 10)
					{
						try {
							System.out.println("Travelling to 10th Floor...");
							Thread.sleep(3000);
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Arrived on 10th Floor.");
						System.out.println("removed: " + s);
						currentFloor = 10;
					}
					
					else
					{
						System.out.println("You are already on this floor.");
						try {
							s = lb.take();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						//System.out.println("removed: " + s);
					}	
			}
		}
	}
}
	}