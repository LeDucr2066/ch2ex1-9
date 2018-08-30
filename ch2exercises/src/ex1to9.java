public class ex1to9 {
    public static void main(String[] args) {
        ex1(); ex2(); ex3(); ex4(); ex5(); ex6();
    }

    public static void ex1(){
        double s;
        double s0 = 2.5;
        double v0t = 25.0;
        double a = 1.8;
        double half = 0.5;
        s =  (half)*a + s0 + v0t;
        System.out.println(s);
    }

    public static void ex2(){
        for(int num =1;num <= 10;num += 1) {
            int newnum = num * num;
            System.out.println(newnum);
        }
    }

    public static void ex3(){
        int num1 = 0;
        int num2 = 1;
        for(int i= 1;i <= 13;++i){
            System.out.println(num1);
            int num1and2 = num1 + num2;
            num1 = num2;
            num2 = num1and2;
        }
    }

    public static void ex4(){
        for(int i = 1;i <= 4;i++){
            String Stars = "****";
            System.out.println(Stars);
        }
    }

    public static void ex5(){
        String star = "*";
        String addstar = "*";
        for(int i = 1;i <= 4;i++){
            System.out.println(star);
            star = star + addstar;

        }
    }

    public static void ex6(){
        int i = 1;
        String stringint = Integer.toString(i);
        for(i = 1;i <= 7;i++){

        }
    }
}
