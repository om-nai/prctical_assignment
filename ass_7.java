import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class ass_7 {
    File readInFile = new File("file.txt");

    int readFileme(String line, File file) {
        if (readInFile.exists()) {
            return line.length();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        String str = "I Am Computer Engineer " +
                " And I am Studying CSPIT ";
        FileWriter writeInFile = new FileWriter("ABCD.txt");
       
        for (int i = 0; i < str.length(); i++)
            writeInFile.write(str.charAt(i));

        System.out.println("Writting mode open Successfully");
        writeInFile.close();

        
        int ch;
        FileReader readInFile = new FileReader("ABCD.txt");
        
        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);
        readInFile.close();
    }
}
