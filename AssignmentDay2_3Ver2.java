import java.io.*;
import java.util.Scanner;

public class AssignmentDay2_3Ver2 {
    public static void main(String[] args) {
        Scanner reader = null;
        FileWriter writer = null;
        try {
            File file1 = new File("File1.txt"); // file from which data is taken from
            writer = new FileWriter("File2.txt"); // file to which data is written
            reader = new Scanner(file1);
            // reader.useDelimiter(",");
            // read and write line by line
            while (reader.hasNextLine()) {
                int y = 0;
                String userData = reader.nextLine();
                // split string by comma
                for (String i : userData.split("[^0-9]")) {
                    // convert string to integer and calculate sum
                    y += Integer.parseInt(i);
                }
                writer.write(userData + ", Sum = " + y + "\n"); // write to the file
            }
            System.out.println("File Write Successful");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
