import java.util.*;
public class Main {
    public static void main(String[] args){
        // write your code here
        Calc calc=new Calc();
        calc.done();
    }
    static class Calc{
        Scanner scanner=new Scanner(System.in);
        long start=System.currentTimeMillis();
        long nlong(){return scanner.nextLong();}
        int nint(){return scanner.nextInt();}
        double ndouble(){return scanner.nextDouble();}
        String nstr(){return scanner.next();}
        String nline(){return scanner.nextLine();}
        void pt(Object obj){System.out.print(obj);}
        void ptl(Object obj){System.out.println(obj);}
        void ptl(){System.out.println();}
        long time(){return System.currentTimeMillis()-start;}
        Calc(){}
        void done() {
            System.out.println((int) Math.pow(nint(), 3));
        }
    }
}
