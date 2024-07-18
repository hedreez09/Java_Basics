package Arrays;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer("Hello! ");
       // buffer.append("world");
        //System.out.println(buffer);
        for (int i = 0; i < 10000; i++){
            buffer.append("world");
        }
        System.out.println("Time Taken by StringBuffer: " + (System.currentTimeMillis()- startTime ));


        StringBuilder builder = new StringBuilder("hello ");
        //,.[,mgnhpogkjnjnrftnh-k -System.out.println(builder.capacity());
        //builder.append("world");
        //System.out.println(builder );
        for (int i = 0; i < 10000; i++){
            builder.append("world");
        }
        System.out.println("Time Taken by StringBuilder: " + (System.currentTimeMillis()- startTime ));

    }
}
