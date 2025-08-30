package InterviewPrep.LearnJavaByImplementing.OOPS.AccessModifiers.dummy;

import InterviewPrep.LearnJavaByImplementing.OOPS.AccessModifiers.demo.AccessModifiers;

public class dummyAccessModifier extends AccessModifiers {

    public static void main(String[] args) {
        dummyAccessModifier dm = new dummyAccessModifier();
        dm.name1 = "changing public name"; // public
        dm.name3 = "changing protected name"; // protected
    }

}
