class MyThread extends Thread{

    public void run(){

        while(true){
            System.out.println(getName());
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){

            }
        }
    }
}

public class DaemonThread{
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        t1.start();

        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        }
    }
}
