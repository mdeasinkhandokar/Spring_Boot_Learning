public class Main {

    public static void main(String [] args){
        sum(1,2);
        sum(2.0,3.0);
        sum(5,2.3);
        sum(4.0, 1);

    }

    public static void sum(int a, int b){
        System.out.println("Sum is 2 int =" + (a+b));
    }
    public static void sum(double a, double b){
        System.out.println("Sum is 2 double ="+ (a+b) );
    }
    public static void sum (int a, double b){
        System.out.println("sum is 1 int 1 double =" + (a+b));
    }
    public static void sum(double a, int b){
        System.out.println("Sum is 1 double 1 int=" + (a+b));
    }




}
