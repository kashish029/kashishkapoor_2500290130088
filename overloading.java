public class Overloading{
    public static void main(String[] args){
        Addition obj=new Addition();
        obj.sum();
        obj.sum(a:10,b:20);
        obj.sum(a:10.1,b:10.2);
    }

}
class Addition{
    void sum()
    {System.out.println(x: "Addition");}
    void sum(int a,int b){
    System.out.println("Addition"+(a+b));
    }
    static void sum(double a,double b){
        System.out.println("Addition"+(a+b));
    }
}