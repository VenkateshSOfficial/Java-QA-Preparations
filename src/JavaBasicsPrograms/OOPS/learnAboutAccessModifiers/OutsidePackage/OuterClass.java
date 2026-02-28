package JavaBasicsPrograms.OOPS.learnAboutAccessModifiers.OutsidePackage;

import JavaBasicsPrograms.OOPS.learnAboutAccessModifiers.learnProtected.LearnProtected;

public class OuterClass extends LearnProtected {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.num = 100;
        System.out.println(obj.num);
    }
}
