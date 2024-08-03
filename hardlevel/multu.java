MultiplicationTableWithoutThreads {
    public static void main(String[] args) {
        printMultiplicationTable(5);
        printMultiplicationTable(10);
    }
    public static void printMultiplicationTable(int number) {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
            simulateThreadLifecycle();
        }
    }
    public static void simulateThreadLifecycle() {
        System.out.println("Thread is in NEW state");
        System.out.println("Thread is in RUNNABLE state");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is in TERMINATED state");
    }
}