import java.io.*;
import java.util.Scanner;

public class AssignmentDay2_3 {
    public static void main(String[] args) {
        Scanner reader = null;
        FileWriter writer = null;
        try {
            File file1 = new File("File1.txt");
            writer = new FileWriter("File2.txt");
            reader = new Scanner(file1);
            // reader.useDelimiter(",");
            while (reader.hasNextLine()) {
                int y = 0;
                String userData = reader.nextLine();
                for (String i : userData.split("[^0-9]")) {
                    if (i.isEmpty()) {
                        continue;
                    } else {
                        int x = Integer.parseInt(i);
                        y += x;
                    }

                }
                if (y != 0) {
                    writer.write(userData + ", Sum = " + y + "\n");

                }
                y = 0;
            }
            System.out.println("File Write Successfull");

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
            reader.close();
        }
    }
}
