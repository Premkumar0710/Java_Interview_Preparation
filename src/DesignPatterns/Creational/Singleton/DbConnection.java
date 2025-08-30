package DesignPatterns.Creational.Singleton;

public class DbConnection {
    private static DbConnection instance = null;

    private DbConnection(){
    }

    // single lock technique ; still not feasible, so we should use dual lock
   /* public static synchronized DbConnection getInstance(){
        if(instance==null){
            instance = new DbConnection();
        }
        return instance;
    } */

    // dual locking technique
    public static DbConnection getInstance(){
        if(instance==null){
            synchronized (DbConnection.class){
                if(instance==null){
                    instance = new DbConnection();
                }
            }
        }
        return instance;
    }
}
