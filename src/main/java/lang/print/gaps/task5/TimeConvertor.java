package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        
        float second;
        second = minutes * 60;
        System.out.println(minutes + " " + "minutes" + " = " + second + " " + "seconds");

    }


    public static void main(String[] args) {
        TimeConvertor main = new TimeConvertor();
   main.convert(55);

  
    }
}
