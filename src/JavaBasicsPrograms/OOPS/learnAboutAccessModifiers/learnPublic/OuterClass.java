package JavaBasicsPrograms.OOPS.learnAboutAccessModifiers.learnPublic;

import JavaBasicsPrograms.OOPS.learnAboutAccessModifiers.learnPrivate.LearnPrivateAccess;

public class OuterClass {
    public static void main(String[] args) {
        LearnPrivateAccess obj = new LearnPrivateAccess();
        obj.setAge(10);
        System.out.println("The age is " + obj.getAge());
    }
}
