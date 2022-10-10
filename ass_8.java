import java.util.Scanner;
import java.io.File;

public class ass_8{
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("You Have not Given Path for File, Please specify the path");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File Does not exist!!");
            System.exit(2);
        }
        Scanner in = new Scanner(file);
        long charCount = 0L;
        int lines = 0;
        int words = 0;

        while(in.hasNext()) {
            String line = in.nextLine();
            String[] wordArray = line.split(" ");         

            charCount += line.length();
            lines += 1;
            words += wordArray.length;
        }
        System.out.println("File "+args[0]+" has "+ charCount +" characters " + words + " words " + lines + " lines");
    }
}


