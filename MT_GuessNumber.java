package main;

//Multithreading exercise: 1st thread set the random number, 2nd thread tries to guess. 
public class MT_GuessNumber {
	
	static boolean win = false;
	
	public static void main(String[] args) {
		int random = (int) (Math.random() * 1000000000);
		System.out.println(random);
		Thread timer = new Thread(new Runnable() { //anonymous class
			@Override
			public void run() {
				try {
					int i = 0;
					while (!win) { 
						System.out.println(i);
						i++;
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
		});
		Thread player = new Thread(new Runnable() { //anonymous class
			@Override
			public void run() {
				while (!win) { // repeat generating new number till it equals to 1st number
					int guessNumber = (int) (Math.random() * 1000000000);
					if (guessNumber == random) {
						win = true;
						System.out.println(guessNumber);
					}
				}
			}
		});
		
		timer.start();
		player.start();

	}

}