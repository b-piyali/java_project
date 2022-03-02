public class Solution {
    public static void main(String[] args) {

    }
}
class A{
    public void method1(){
        System.out.println("class A: 1");
    }
}
class B extends Solution{
    public void method2(){
        System.out.println("B:2");
    }
}
class C extends B{
    public void method2(){
        System.out.println("C:2");
    }
    public void method3(){
        System.out.println("C:3");
    }
}

