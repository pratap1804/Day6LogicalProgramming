public class Watch {

    public static void main(String[] args){
        final long start = System.currentTimeMillis();

           final long stop = System.currentTimeMillis();
           final double Time_Passed =(stop - start) / 1000;

        System.out.println("Start Time: "+start);
        System.out.println("Stop Time: "+stop);
        System.out.println("Time Passed: "+Time_Passed);
    }
}