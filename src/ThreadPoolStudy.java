import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolStudy {

	public static void main(String[] args) {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 10; i++) {
			final int index = i;
			
			try {
				Thread.sleep(index*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			cachedThreadPool.execute(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(index);  
				}
				
			});
			
		}
	}
}
