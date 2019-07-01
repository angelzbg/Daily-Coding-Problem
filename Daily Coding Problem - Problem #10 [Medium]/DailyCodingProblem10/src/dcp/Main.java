package dcp;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		/*
		 * Good morning! Here's your coding interview problem for today.
		 * This problem was asked by Apple.
		 * Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
		 */
		// takes in a function f and an integer n? a function?!
		
		Thread jobThread = new Thread() {
			 @Override
	         public void run() {
				 System.out.println("I am working on something...");
	         }
		};
		
		scheduleSomething(jobThread, 5000); // 5 seconds
	}
	
	private static void scheduleSomething(Thread f, int n) {
		final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Job schedulet at: " + format.format(System.currentTimeMillis()) +
				" for: " + format.format(System.currentTimeMillis() + n));
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Job started at: " + format.format(System.currentTimeMillis()));
				f.start();
				t.cancel();
				}
			}, n);
	}

}