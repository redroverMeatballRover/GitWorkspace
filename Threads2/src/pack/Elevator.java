package pack;


import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

class Elevator extends Thread {
	
	public static void main(String[] args)
	{
	Elevator e = new Elevator();
    e.start();
    e.call(2);
    e.call(4);
	}
	
    NavigableSet<Integer> calls = new ConcurrentSkipListSet<>();
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