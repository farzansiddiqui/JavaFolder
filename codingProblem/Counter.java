public class Counter {
    public int count = 0;
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();

        
        thread1.join();
        thread2.join();
        System.out.println("Final Count: " + counter.getCount()); // Output may vary
    }
    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

}
class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            counter.increment(); // Incrementing the count
        }
    }
}
