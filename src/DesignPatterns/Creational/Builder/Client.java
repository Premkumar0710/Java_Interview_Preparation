package DesignPatterns.Creational.Builder;

public class Client {

    public static void main(String[] args) {

        User u1 = new User.Builder("Prem",25).build();
        System.out.println(u1);

        User u2 = new User.Builder("Sam",35)
                .city("Pallavaram")
                .phone("1231231231")
                .email("samStrong@gmail.com")
                .build();
        System.out.println(u2);
    }
}
