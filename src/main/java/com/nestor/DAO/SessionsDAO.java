package com.nestor.DAO;

import com.nestor.logic.Sessions;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by sbt-velichko-aa on 17.03.17.
 */
public interface SessionsDAO {

    public void addSession(Sessions sessions) throws SQLException;
    public void updateSession(Long sessions_id, Sessions sessions) throws SQLException;
    public Sessions getSessionsById(Long sessions_id) throws SQLException;
    public Collection getAllSessions() throws SQLException;
    public void deleteSession(Sessions sessions) throws SQLException;
}
