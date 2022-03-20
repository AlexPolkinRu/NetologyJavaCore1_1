package worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callbackErr) {
        this.callback = callback;
        this.errorCallback = callbackErr;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("!!! Task " + i + " is Error !!!");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
