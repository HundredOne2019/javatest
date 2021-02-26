package com.hundred.Thread.food;

public class Desk {
    private final Object lock = new Object();
    private Integer count;
    private boolean flag;

    public Desk() {
        this.count = 10;
        this.flag = false;
    }

    public Desk(Integer count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    public Object getLock() {
        return lock;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
