package mathOperations;

public class MathOperation {

    public MathOperation() {
    }

    public  int add(int a, int b){
        return a + b;
    }
    public  int add (int a,int b, int c){
        return add(add(a,b),c);
    }
    public  int add (int a, int b, int c, int d){
        return add(add(a,b,c),d);
    }
}
