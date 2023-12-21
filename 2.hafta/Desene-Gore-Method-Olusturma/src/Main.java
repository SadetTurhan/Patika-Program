public class Main {
    public static void main(String[] args) {
    methodByPattern(16,16,true);
    }
    public static void methodByPattern(int a,int b,boolean isDecreasing){
        if(a > 0 && isDecreasing){
            System.out.println(a + " ");
            methodByPattern(a - 5,b,true);
        }else {
            if (a <= b) {
                System.out.println(a + " ");
                methodByPattern(a + 5, b, false);
            }
        }
    }
}