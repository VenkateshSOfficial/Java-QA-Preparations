package JavaBasicsPrograms.OOPS.learnAboutAccessModifiers.learnPrivate;

public class LearnPrivateAccess {
    /* when variable or method declared as private it can be accessed from within
    the class only. can't be accessed outside the class
   If we want to access those private variables , we need to create getters and setters
   */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    // crated getters and setters and accessing those in the Outerclass (inside learnPublic package)
}
