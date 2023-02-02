package threading;

public class NumberGenerator1 implements Runnable{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the number2 " + i );
                Thread.sleep(200);
            }

        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread is over");
    }

}
