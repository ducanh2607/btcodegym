package threading;

public class Main1 {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberGenerator1 numberGenerator1 = new NumberGenerator1();
        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator1);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();

    }
}
