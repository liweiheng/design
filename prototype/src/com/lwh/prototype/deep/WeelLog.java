package com.lwh.prototype.deep;

public class WeelLog extends Prototype {
    private String title;
    private String time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "WeelLog{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
