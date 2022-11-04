package Threading;

public class RunnableThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread from runnable" + i);

			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		RunnableThread rn = new RunnableThread();
		Thread t1 = new Thread(rn);
		MyThreadWithoutMain mt = new MyThreadWithoutMain();
		Thread t2 = new Thread(mt);
		t1.start();
		t2.start();
	}

}
