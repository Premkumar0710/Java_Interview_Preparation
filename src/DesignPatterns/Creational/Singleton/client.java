package DesignPatterns.Creational.Singleton;

public class client {
    public static void main(String[] args) {

        DbConnection dbConnection1 = DbConnection.getInstance();
        System.out.println(dbConnection1.hashCode());

        DbConnection dbConnection2 = DbConnection.getInstance();
        System.out.println(dbConnection2.hashCode() + " -> Here We can see that the same hascode is being printed here");
    }
}

