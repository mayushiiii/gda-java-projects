class RabbitThread extends Thread {
    private int number;

    public RabbitThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + number + " is running");
    }
}

class RabbitRunnable implements Runnable {
    private int number;

    public RabbitRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + number + " is running");
    }
}

public class RabbitRace {
    public static void main(String[] args) {
        int numRabbits = 5;

        Thread[] threads = new Thread[numRabbits];
        Runnable[] runnables = new Runnable[numRabbits];

        for (int i = 0; i < numRabbits; i++) {
            threads[i] = new RabbitThread(i + 1);
            runnables[i] = new RabbitRunnable(i + 1);
        }

        for (int i = 0; i < numRabbits; i++) {
            if (i % 2 == 0) {
                threads[i].start();
            } else {
                new Thread(runnables[i]).start();
            }
        }
    }
}
