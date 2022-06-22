public class Time {
    public static void main(String[] args) throws Exception {

        String chat = "huy";
        
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i) {
            System.out.println(chat);
        }

        // Get elapsed time in milliseconds
        long elapsedTimeMillis = System.currentTimeMillis()-start;
    
        System.out.println("Average Time: "+ elapsedTimeMillis/1000000.0);

    }
}



