import java.util.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Assignment {
    public static void main(String[] args) {
        // intializing variables
        String id = "ID1234";
        String firstName = "test";
        String lastName = "user";
        String ph = "+91-(123)456789";
        String email = "testuser@gmail.com";

        // initializing an array and adding the employee details to the array
        String[] employee = { id, firstName, lastName, ph, email };

        // initializing an arrayList and adding the employee details to the arrayList
        List<String> employeeList = new ArrayList<String>();
        employeeList.add(id);
        employeeList.add(firstName);
        employeeList.add(lastName);
        employeeList.add(ph);
        employeeList.add(email);

        // initializing a HashMap and adding the employee details to the HashMap
        HashMap<String, String> employeeMap = new HashMap<String, String>();
        employeeMap.put("ID", id);
        employeeMap.put("First Name", firstName);
        employeeMap.put("Last Name", lastName);
        employeeMap.put("Phone", ph);
        employeeMap.put("Email", email);

        // printing the Array
        System.out.println("Employee Details in array");
        System.out.println("---------------------------");
        System.out.println("Id : " + employee[0]);
        System.out.println("First Name : " + employee[1]);
        System.out.println("Last Name : " + employee[2]);
        System.out.println("Phone : " + employee[3]);
        System.out.println("Email : " + employee[4]);
        System.out.println("---------------------------");
        System.out.println(" ");

        // printing the arrayList
        System.out.println("Employee Details in ArrayList");
        System.out.println("---------------------------");
        System.out.println("Id : " + employeeList.get(0));
        System.out.println("First Name : " + employeeList.get(1));
        System.out.println("Last Name : " + employeeList.get(2));
        System.out.println("Phone : " + employeeList.get(3));
        System.out.println("Email : " + employeeList.get(4));
        System.out.println("---------------------------");
        System.out.println(" ");

        // printing the HashMap
        System.out.println("Employee Details in HashMap");
        System.out.println("---------------------------");
        System.out.println("Id : " + employeeMap.get("ID"));
        System.out.println("First Name : " + employeeMap.get("First Name"));
        System.out.println("Last Name : " + employeeMap.get("Last Name"));
        System.out.println("Phone : " + employeeMap.get("Phone"));
        System.out.println("Email : " + employeeMap.get("Email"));
        System.out.println("---------------------------");
        System.out.println(" ");

        // Fetch first name and last name of employees
        System.out.println("Fetch first name and second name");
        System.out.println("---------------------------");
        System.out.println(" ");
        System.out.println("Array");
        System.out.println("---------------------------");
        System.out.println("First Name : " + employee[1]); // fetching from Array
        System.out.println("Last Name : " + employee[2]); // fetching from Array
        System.out.println(" ");
        System.out.println("ArrayList");
        System.out.println("---------------------------");
        System.out.println("First Name : " + employeeList.get(1)); // fetching from Arraylist
        System.out.println("Last Name : " + employeeList.get(2)); // fetching from Arraylist
        System.out.println(" ");
        System.out.println("HashMap");
        System.out.println("---------------------------");
        System.out.println("First Name : " + employeeMap.get("First Name")); // fetching from HashMap
        System.out.println("Last Name : " + employeeMap.get("Last Name")); // fetching from HashMap
        System.out.println("---------------------------");
        System.out.println(" ");

        // Print name of the employee by appending first name and last name
        System.out.println("Appending first name and last name");
        System.out.println("---------------------------");
        System.out.println((firstName + " ").concat(lastName)); // from variables
        System.out.println((employee[1] + " ").concat(employee[2])); // from array
        System.out.println((employeeList.get(1) + " ").concat(employeeList.get(2))); // from ArrayList
        System.out.println((employeeMap.get("First Name") + " ").concat(employeeMap.get("Last Name"))); // from HashMap

        // Regular expression to extract only numbers from Phone number
        String ph2 = "";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(ph);
        while (matcher.find()) {
            ph2 += matcher.group();
        }
        // or using split
        /*
         * for (String ret : ph.split("[^0-9]")) {
         * ph2 += ret;
         * }
         */

        System.out.println(" ");
        System.out.println("Phone Number with only numbers");
        System.out.println("---------------------------");
        System.out.println(ph2);
        System.out.println(" ");

        // perform split, substring and print the prefix of Email id
        String emailSplit = "";
        for (String ret : email.split("@")) {
            emailSplit += ret;
        }
        System.out.println("Email Prefix");
        System.out.println("---------------------------");
        System.out.println(emailSplit.substring(0, 8)); // using substring
        System.out.println(" ");

        // Replace email id domain as email.org
        String replacedEmail = email.replace("gmail.com", "email.org");
        System.out.println("Replaced Email");
        System.out.println("---------------------------");
        System.out.println(replacedEmail);
        System.out.println(" ");

        // Write any example for switch case
        System.out.println("Switch Case Example");
        System.out.println("---------------------------");
        // to check the country code of the phone number
        System.out.println("Phone number belongs to");
        switch (ph2.substring(0, 2)) {
            case "91":
                System.out.println("India");
                break;
            case "44":
                System.out.println("United Kingdom");
                break;
            case "1":
                System.out.println("United States");
                break;
            default:
                System.out.println("Invalid Country Code");
        }
    }
}
