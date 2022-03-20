package worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerErr = System.out::println;

        Worker worker = new Worker(listener, listenerErr);
        worker.start();
    }
}
