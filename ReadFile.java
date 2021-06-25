import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        FileWriterCustom fwc = new FileWriterCustom();
        fwc.fileWriter();
        fwc.armstrong();
    }
}

class FileWriterCustom {
    void fileWriter() throws Exception {
        int i;
        PrintWriter out = new PrintWriter(new FileWriter("one.txt"));
        // loop to write 1 to thousand to a file
        for (i = 100; i < 550; i++) {
            out.println(i);
            out.flush();
        }
    }

    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    void armstrong() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("one.txt"));
        PrintWriter out1 = new PrintWriter(new FileWriter("two.txt"));
        String line = reader.readLine();
        out1.println("Printing Armstrong ");
        while (line != null) {
            if (isArmstrong(Integer.parseInt(line))) {

                out1.println(line);

                out1.flush();
            }

            line = reader.readLine();
        }
        reader.close();
    }
}