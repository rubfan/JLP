public class Calc {
    public long add(Integer a, Integer b){
        if(a==null && b==null){
            return 404;
        }
        return a+b;}
    public long sub(int a, int b){return a-b;}
    public long div(int a, int b){return a/b;}
    public long mil(int a, int b){return a*b;}
}
