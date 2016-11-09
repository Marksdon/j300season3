package priv.xzc.j300season3.pattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下，5种单例模式的效率
 * @author randall
 * 
 */
public class Client3 {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = 
				new CountDownLatch(threadNum);//监控线程，就相当于个计数器，线程死一条就减一
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i = 0; i < 100000; i ++){
						Object o = SigletonDomo1.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();;
		}
		try {
			countDownLatch.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//main线程阻塞，直到计数器变为0，才会继续往下执行
		long end = System.currentTimeMillis();
		System.out.println("耗时：" +(end-start));
	}

}
