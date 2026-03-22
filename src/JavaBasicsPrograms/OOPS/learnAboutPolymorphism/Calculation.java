package JavaBasicsPrograms.OOPS.learnAboutPolymorphism;

public class Calculation {

    // method overriding
    // same method name and args but implementation is different

    public void calculate(){
        System.out.println("This is from calculation class");
    }
}
class Sum extends Calculation{
    int a=12,b=14,c;
    @Override
    public void calculate(){
        c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Calculation obj=new Sum();
        obj.calculate();
    }
}

