package ks.arlind.ginRummyManager.model;

public class Match {
    private int id;
    private long startTime;
    private long endTime;

    public Match() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getElapsedTime() {
        setEndTime(System.currentTimeMillis());
        return getEndTime() - getStartTime();
    }
}
