
class MyThread extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(i + " executed by " + Thread.currentThread().getName());
            //here the currentthread() func is heling us determine which thread is being executed
            try{
                Thread.sleep(5000);
                //delay will happen in the iteration of the loop
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}

public class MultiThreadEX {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        //This will begin the execution of thread
        //It will execute the run method of each thread
        thread1.start();
        thread2.start();
    }
}
