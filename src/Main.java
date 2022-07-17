public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.addTwoNum(10.5,15.5);
        Main.multiplication(10,10);

    }
    public double addTwoNum(double a,double b){
        double c = a+b;
        System.out.println(c);
        return c;
    }
    public static int multiplication(int x, int y){
        int z = x*y;
        System.out.println(z);
        return z;
    }
}
