package Methods;
class sum{
    void sum(int a , int b){
        System.out.println(a+b);
    }
}
public class sumclass {

    public static void main(String args[]){
        int a=5;
        int b=6;
        sum calc = new sum();
        calc.sum(a,b);
    }
}

