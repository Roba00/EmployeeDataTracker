/* Pseudocode:
   Design a program to read 10 workers names, addresses,
   social security, they wage (per week and per hour), and their job function. Example: Type in name or ID to get information. (Suprisingly, my dad gave me this assignment, which was also quite the code challenge.)
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner employeeScanner = new Scanner(System.in);
        Employee bob = new Employee("Bob", 209, "1234 Hollywood Ave", 1234, 20.49f, "King");
        System.out.println("Enter employee name (Bob or Susie):");
        String employeeScan = employeeScanner.nextLine();

        switch (employeeScan)
        {
            case "Bob":
                System.out.println("Bob’s name: " + bob.getName());
                System.out.println("Bob’s employee id number: " + bob.getId());
                System.out.println("Bob’s address: " + bob.getAddress());
                System.out.println("Bob’s social security: " + bob.getSocialSecurity());
                System.out.println("Bob’s wage: " + bob.getWage());
                System.out.println("Bob’s job function: " + bob.getJobFunction());
                break;

            case "Susie":
                System.out.println("Susie is a new employee, data on her is not entered yet.");
                break;

            default:
                System.out.println("Employee not found.");
        }
    }
}