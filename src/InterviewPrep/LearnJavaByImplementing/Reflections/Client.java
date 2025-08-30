package InterviewPrep.LearnJavaByImplementing.Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stella",6);
      //  myCat.name = "Fred"; not possible without reflection
       Field[] catField =  myCat.getClass().getDeclaredFields();

       for(Field field : catField){
           if(field.getName().equals("name")){
               field.setAccessible(true);
               field.set(myCat,"Fred");
           }
           System.out.println(field.getName()); // prints all the fields (variables)
       }

      Method[] catMethods =  myCat.getClass().getDeclaredMethods();
       for(Method method : catMethods){
           if(method.getName().equals("privateMethod")){
               method.setAccessible(true);
               method.invoke(myCat);
           }
           System.out.println(method.getName());
       }



    }
}
