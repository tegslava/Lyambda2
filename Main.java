import lyambda.Worker;

/**
 * @author Tegneryadnov_VI
 * @version 21
 * @Java Работяга
 */

public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorCallback = System.out::println;
        Worker worker = new Worker(listener, errorCallback);
        worker.start();
    }
}
