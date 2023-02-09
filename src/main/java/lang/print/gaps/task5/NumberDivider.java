package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        int a = 5;
        int dev = toBeDivided / a ;
        System.out.println(dev);
    }
    
    public static void main(String[] args) {

        NumberDivider main = new NumberDivider();
        main.divide(550);
        
    }
}
