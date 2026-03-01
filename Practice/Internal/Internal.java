class MyThread extends Thread {
    public void run(){

        try {
            for(int i=0; i<50; i++){
                Thread.sleep(5000);
                System.out.println(getName());
            }
        }catch(InterruptedException ie){

        }
    }
}
class Client {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();

        for(int i=0; i<50; i++){
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName());
        }
    }
}