
public class demo1 {
	public static void main(String[] args) {
		Thread t1=new Worker();
		t1.start();
		Thread t2=new Worker();
		t2.start();
		
		
		
		// for(;;){
//		System.out.println(thread.currentthread());
//	}

}
}
class Worker extends Thread{
	@Override
	public void run(){
		for(int i=0;i<10;i++) {
			try{
		Thread.sleep(2000);
			}catch(InterruptedExecption e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().toString()+1);
	}

}
}