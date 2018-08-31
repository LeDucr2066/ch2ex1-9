public class ex1to9 {
    public static void main(String[] args) {
        ex1(); ex2(); ex3(); ex4(); ex5(); ex6(); ex7(); ex9();
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
        for(int i = 1; i <= 7; i++){
            for(int v = 1; v <= i; v++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public static void ex7(){
        String v = "     ";
        for(int i = 1; i <= 5; i++){
            for(int c = 5;c <= 0;c--){
                System.out.print("\n");

            }
            System.out.println(i);
        }
    }

    public static void ex8() {
        for(int i =1;;){

        }
    }

    public static void ex9() {
        String e;
        for(int v = 1;v <= 40;v++){
            System.out.print("-");
        }
        System.out.println("\n");
        for(int z = 1;z <= 40;z++){
            System.out.print("_-^");
        }
        System.out.println("\n");
        for(int c = 1;c <= 2;c++) {
            for (int o = 1; o <= 9; o++) {
                e = Integer.toString(o);
                System.out.print(o + e);
            }
        }
        System.out.println("\n");
        for(int q = 1;q <= 40;q++){
            System.out.print("-");
        }
    }
}

