class ApiFetch{
  public static void main(String[] args) {
    A b = new M();
    b.b();
    b.c();
    b.d();
  }  
}

interface A{
    void c();
    void b();
    void d();
}
abstract class B implements A {
    public void c(){
        System.out.println("I am C");
    }
}
class M extends B{

    public void d(){
System.out.println("d");
    }
    public void b(){
System.out.println("b");
    }
}

