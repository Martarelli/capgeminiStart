package Threads;

public class Threads {
	static int i = 0;
	public static void main(String[] args) {
		new Thread(t1).start();
		new Thread(t2).start();
	}
	
	private static void contador(String name) {
		i++;
		System.out.println("O valor do contador atual é: " + i + " Thread: " + name);
	}
	
	private static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {
			try {
				for(int i = 0 ; i < 20 ; i++) {
					contador("t1");
				}
			} catch (Exception e) {

			}
			
		}
	};
	
	private static Runnable t2 = new Runnable() {
		
		@Override
		public void run() {
			try {
				for(int i = 0 ; i < 20 ; i++) {
					contador("t2");
				}
			} catch (Exception e) {

			}
			
		}
	};
}
