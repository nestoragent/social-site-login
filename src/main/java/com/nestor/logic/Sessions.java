package com.nestor.logic;

/**
 * Created by sbt-velichko-aa on 17.03.17.
 */
public class Sessions {

    private int session_id;
    private String timeStart;
    private String timeEnd;

    public Sessions(){}

    public int getId() {
        return session_id;
    }

    public void setId(int id) {
        this.session_id = id;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
}
