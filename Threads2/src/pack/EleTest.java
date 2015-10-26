package pack;


import java.util.NavigableSet;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.LinkedBlockingQueue;

class EleTest extends Thread {
	
	public static void main(String[] args)
	{
	EleTest e = new EleTest();
    e.start();
    
    int i = 0;
    while (i < 5)
    {
    	System.out.println("What floor?");
    	Scanner scan = new Scanner(System.in);
    	int x = scan.nextInt();
    	e.call(x);
    }
    
//    e.call(2);
//    e.call(8);
//    e.call(6);
//    e.call(10);
	}
	
    NavigableSet<Integer> calls = new ConcurrentSkipListSet<>();
	  @SuppressWarnings("unchecked")
	//NavigableSet<Integer> calls = (NavigableSet<Integer>) new LinkedBlockingQueue<Integer>();
    int floor = 1;

    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(100);
                while (calls.higher(floor) != null) {
                    move(+1);
                }
                while (calls.lower(floor) != null) {
                    move(-1);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    void move(int n) throws InterruptedException {
        floor += n;
        System.out.println("Moving to " + floor);
        Thread.sleep(3000);
        if (calls.remove(floor)) {
            System.out.println("Stopped");
            Thread.sleep(3000);
        }
    }

    void call(int floor) {
        calls.add(floor);
    }
}