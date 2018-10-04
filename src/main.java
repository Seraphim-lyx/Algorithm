import tool.Clone;

/**
 * 
 */

/**
 * @author searphimlyx
 *
 */
public class main{
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException{
		new main().runThread();
		new main().runThread();
	}
	public void runThread() throws InterruptedException   {
		// TODO Auto-generated method stub
				Thread t = 
				new Thread() {
					
					@Override
					public void run() {
						while (true) {
							try {
								
								System.out.println(new String());
								Thread.currentThread().sleep(3000);
								System.gc();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				};
				
				t.start();
	}

}
