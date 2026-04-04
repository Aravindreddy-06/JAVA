class CookingJob implements Runnable{
    private String item;

    CookingJob(String item){
        this.item = item;
    }

    public void run(){
        System.out.println(item+ " is being prepared by " + Thread.currentThread().getName());
    }
}

public class ImplementsThread{
    public static void main(String args[]){
        Thread t1 = new Thread(new CookingJob("Soup"));
        Thread t2 = new Thread(new CookingJob("Pizza"));
        Thread t3 = new Thread(new CookingJob("Burger"));

        t1.start();
        t2.start();
        t3.start();
    }
}