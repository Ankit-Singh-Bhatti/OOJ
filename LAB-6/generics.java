class Stack<A,U>{
    A a,b,c,d,e;
    U f,g,h,i,j;
    void setA(A a,A b,A c, A d,A e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
    }
     void setU(U a,U b,U c, U d,U e){
        this.f=a;
        this.g=b;
        this.h=c;
        this.i=d;
        this.j=e;
    }
}
class generics{
    public static void main(String args[]){
        Stack<Integer,Double> obj1=new Stack<Integer,Double>();
        obj1.setA(1,1,1,1,1);
        obj1.setU(1.6789,1.636,1.365223,1.34523,1.879);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);
        System.out.println(obj1.d);
        System.out.println(obj1.e); 

        System.out.println(obj1.f);
        System.out.println(obj1.g);
        System.out.println(obj1.h);
        System.out.println(obj1.i);
        System.out.println(obj1.j);

    }
}
