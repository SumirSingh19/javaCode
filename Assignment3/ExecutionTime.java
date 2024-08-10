package Assignment3;

public class ExecutionTime {
    public static void main(String[] args)
    {
        int iterations = Integer.parseInt(args[0]);

        //for String
        long startTime = System.currentTimeMillis();
        String str = "";
        for(int i=0;i<iterations;i++)
        {
            str+="a";
        }
        long stringTime = System.currentTimeMillis()-startTime;

        //for StringBuffer
        StringBuffer strBuffer = new StringBuffer();
        startTime = System.currentTimeMillis();

        for(int i=0;i<iterations;i++)
        {
            strBuffer.append("a");
        }

        long stringBufferTime = System.currentTimeMillis()-startTime;

        //for StringBuilder
        startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<iterations;i++)
        {
            stringBuilder.append("a");
        }

        long stringBuilderTime = System.currentTimeMillis()-startTime;

        System.out.println(stringTime+" "+stringBufferTime+" "+stringBuilderTime);
    }   
}
