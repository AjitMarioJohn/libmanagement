package com.lib.management.core.db.queries;

public final class DBQueries {
    public final String VALIDATE_USER = "SELECT * FROM user WHERE USERNAME=? AND PASSWORD=?";
    private DBQueries(){}
    private static class DbQueriesInitiator{
        private static final DBQueries INSTANCE = new DBQueries();
    }
    public static DBQueries getInstance(){
        return DbQueriesInitiator.INSTANCE;
    }
}
