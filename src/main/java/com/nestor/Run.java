package com.nestor;

import com.nestor.logic.Sessions;
import com.nestor.util.Factory;

import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * Created by sbt-velichko-aa on 20.03.17.
 */
public class Run {

    public static void main(String[] args) {
        Sessions sessions = new Sessions();
        sessions.setTimeStart(LocalDateTime.now().toString());
        sessions.setTimeEnd(LocalDateTime.now().toString());
        try {
            Factory.getInstance().getSessionsDAO().addSession(sessions);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
