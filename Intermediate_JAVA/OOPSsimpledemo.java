package Intermediate_JAVA;

class demosimple {
    public int add(int n1 , int n2){
        int r = n1 + n2;
        return r;
    }
}
class OOPSsimpledemo{
    public static void main(String args[]) {
        demosimple ob = new demosimple();
        int res = ob.add(10, 15);// Call by value example
        int no1=10;
        int no2=12;
        int re=ob.add(no1, no2);// Call by reference example
        System.out.println(res+" BY value.");
        System.out.println(re+" BY reference.");
    }
}
