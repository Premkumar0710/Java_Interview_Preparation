package InterviewPrep.LearnJavaByImplementing.Reflections;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public void meow(){
        System.out.println("Meow");
    }

    private void privateMethod(){
        System.out.println("Private method");
    }

    private static void privateStatic(){
        System.out.println("Private static");
    }


}
