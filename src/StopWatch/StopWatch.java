package StopWatch;

public class StopWatch {
    private long starTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void star() {
        this.starTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - starTime)/1000);
        } else {
            elapsed = ((stopTime - starTime)/1000);
        }
        return elapsed;
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        long total = 0;
        for (int i = 0; i < 100000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }
}
