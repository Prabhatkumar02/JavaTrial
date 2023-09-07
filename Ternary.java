public class Ternary {
    public static void main(String[] args) {
        int a=80;
        int b=70;
        int c=60;
        int result =(a<b)? a:b;
        System.out.println(result);
        String res=(a<b)?"a is less":"a is more";
        System.out.println(res);
         int num=(a<b)? (a<c? a:c) : (b<c? b:c) ;
        System.out.println(num);

    }
}
