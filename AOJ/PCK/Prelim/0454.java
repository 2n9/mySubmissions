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
        Calc(){}
        void done() {
            Set<Integer> s = new HashSet<>();
            for (int i = 0; i < 4; i++) s.add(ni());
            ab(s.size() == 2 ? 1 : 0);
        }
    }
}
