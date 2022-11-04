package Threading;

public class MyThreadWithoutMain extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread from Thread" + i);

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}

}
