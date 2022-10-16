import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Build class Quadratic Equation");
            System.out.println("2.Build class Stop Watch");
            System.out.println("3.Build class Fan");
            System.out.println("4.Exit the system");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Solution();
                    break;
                case 2:
                    Watch();

                    break;
//                case 3:
//                    Fan();
//                    break;
                case 4:
                    System.exit(4);
            }
        } while (true);
    }

    static class QuadraticEquation {
        double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double delta() {
            return (this.b * this.b) - (4 * this.a * this.c);
        }
        public double getSol(){
            return (-1 * b) / (2 * a);
        }
        public double getRoot1(){
            return ((-1 * b) + Math.sqrt(this.delta())) / (2 * a);
        }
        public double getRoot2(){
            return ((-1 * b) - Math.sqrt(this.delta())) / (2 * a);
        }
    }

    public static void Solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the number b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the number c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        double delta = quadratic.delta();
        if (delta < 0) {
            System.out.println("No solution");
        } else {
            if (delta == 0) {
                System.out.println("The equation with one solution is: " + quadratic.getSol());
            }else{
                System.out.println("The equation with two solutions is: "+ quadratic.getRoot1() + " and " + quadratic.getRoot2());

            }
        }
    }

    public static class  StopWatch{
        private long startTime;
        private long endTime;
        public static final double miliSec = 1000.0;
        public StopWatch(long startTime, long endTime){
            this.endTime = endTime;
            this.startTime = startTime;
        }
        public StopWatch(){

        }


        public long getStartTime() {
            return startTime;
        }
        public long getEndTime() {
            return endTime;
        }
        public void start(){
            startTime = System.nanoTime();
        }
        public void end(){
            endTime = System.nanoTime();
        }
        public double getElapsedTime(){
            return (endTime-startTime)/miliSec;
        }
    }
    public static void Watch(){
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.println("Start time is:" + watch.getStartTime());
        watch.end();
        System.out.println("End time is:" + watch.getEndTime());
        System.out.println("Elapsed time is:" + watch.getElapsedTime());

    }

}
