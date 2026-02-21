package JavaBasicsPrograms.OOPS.learnAboutPolymorphism;

public class MethodOverloading {
    /* also called as compile time polymorphism or static
       polymorphism
       Same name but different no or types of arguments

       run time or dynamic polymorphism
       achieved my method overriding

       */
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.sum(10,20));
        System.out.println(obj.sum(23,45,6));
    }
}
