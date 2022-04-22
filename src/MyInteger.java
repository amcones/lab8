public class MyInteger{
    int value;
    MyInteger(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isEven(int i) {
        return i%2==0;
    }
    public static boolean isOdd(int i){
        return i%2==1;
    }
    public static boolean isPrime(int i){
        for(int m=2;m<=Math.sqrt(i);m++){
            if(i%m==0)return false;
        }
        return true;
    }
    public boolean isEven(MyInteger i){
        return isEven(i.getValue());
    }
    public boolean isOdd(MyInteger i){
        return isOdd(i.getValue());
    }
    public boolean isPrime(MyInteger i){
        return isPrime(i.getValue());
    }
    public boolean equals(int i){
        return value==i;
    }
    public boolean equals(MyInteger i){
        return equals(i.getValue());
    }
    public static int parseInt(char[] chars)
    {
        int res=0;
        for (char aChar : chars) {
            res *= 10;
            res += aChar - '0';
        }
        return res;
    }
    public static int parseInt(String s)
    {
        char[] chars=s.toCharArray();
        return parseInt(chars);
    }
}
class TestMyInteger {
    public static void main(String[] args) {
        MyInteger a=new MyInteger(2);
        MyInteger b=new MyInteger(9);
        MyInteger c=new MyInteger(11);
        System.out.println(c.getValue());
        System.out.println(MyInteger.isEven(2));
        System.out.println(MyInteger.isOdd(3));
        System.out.println(MyInteger.isPrime(5));
        System.out.println(a.isEven(a));
        System.out.println(b.isPrime(b));
        System.out.println(c.isOdd(c));
        System.out.println(a.equals(b));
        System.out.println(a.equals(2));
        char[] chars={'1','2','3'};
        System.out.println(MyInteger.parseInt(chars));
        System.out.println(MyInteger.parseInt("456"));
    }
}
