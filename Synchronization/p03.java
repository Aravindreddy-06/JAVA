//producer consumer using wait() and notify()

class SharedBuffer {
    private int data;
    private boolean hasValue = false;

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {
        while (hasValue) {
            wait(); // wait if buffer is full
        }

        data = value;
        hasValue = true;
        System.out.println("Produced: " + value);

        notify(); // notify consumer
    }

    // Consumer method
    public synchronized int consume() throws InterruptedException {
        while (!hasValue) {
            wait(); // wait if buffer is empty
        }

        int value = data;
        hasValue = false;
        System.out.println("Consumed: " + value);

        notify(); // notify producer
        return value;
    }
}

public class p03 {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        // Producer Thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}