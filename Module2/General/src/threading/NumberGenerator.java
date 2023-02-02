package threading;

public class NumberGenerator implements Runnable{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the number1 " + i );
                Thread.sleep(500);
            }

        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread is over");
    }


}
