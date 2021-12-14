import java.util.*;
public class Main {
    public static void main(String[] args){
        new Calc().done();
    }
    static class Calc{
        Scanner s=new Scanner(System.in);
        long st=System.currentTimeMillis();
        long nl(){return s.nextLong();}
        int ni(){return s.nextInt();}
        double nd(){return s.nextDouble();}
        String ns(){return s.next();}
        String nli(){return s.nextLine();}
        void a(Object o){System.out.print(o);}
        void as(Object o){System.out.print(o+" ");}
        void ab(Object o){System.out.println(o);}
        void ab(){System.out.println();}
        void aba(Object... o){String s="";for(Object j:o)s=s+j+" ";System.out.println(s.replaceFirst(".$",""));}
        long t(){return System.currentTimeMillis()-st;}
        int sum(int... i){return Arrays.stream(i).sum();}
        double sum(double... d){return Arrays.stream(d).sum();}
        long sum(long... l){return Arrays.stream(l).sum();}
        int[] ascending(int... i){Arrays.sort(i);return i;}
        Integer[] ascending(List<Integer> i){Integer[] k= i.toArray(new Integer[0]);Arrays.sort(k);return k;}
        int[] descending(int... i){i=ascending(i);for(int f=0,l=i.length-1;f<l;f++,l--){int t=i[f];i[f]=i[l];i[l]=t;}return i;}
        Integer[] descending(List<Integer> i){Integer[] k=ascending(i);for(int f=0,l=k.length-1;f<l;f++,l--){int t=k[f];k[f]=k[l];k[l]=t;}return k;}
        boolean match(int... i){for(int k:i)if(i[0]!=k)return false;return true;}
        long cc(String s,char a){long i=0;char t;for(int j=0;j<s.length();j++){if(s.charAt(j)==a)i++;}return i;}
        int[] shift(int[] a,int n){if(n-1>=0)System.arraycopy(a,1,a,0,n-1);return a;}
        int[] rotate(int[] a,int n){int f=a[0];a=shift(a,n);a[n-1]=f;return a;}
        Calc(){}
        void done() {
            int N = ni();
            int a = ni();
            int t = Math.min(a,10-a);
            for (int i = 0; i < N-1; i++) {
                int a2 = ni();
                t += Math.min(Math.abs(a-a2), 10-Math.abs(a-a2));
                a=a2;
            }
            ab(t);
        }
    }
}
