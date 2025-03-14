class A{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, double b){
        System.out.println((float)(a-b));
    }
    void sum(double a, double b){
        System.out.println(a*b);
    }
}
class B{
    void show() {
        System.out.println("Hello");
    }
}
class C extends B{
    @Override
    void show() {
        System.out.println("Atick");
    }
}

public class atick {
    public static void main(String[] args) {
        A a=new A();
        a.sum(2, 3);
        a.sum(5, 2.0);
        a.sum(2.0, 3.0);
        C c=new C();
        c.show();
    
    }
    
}
