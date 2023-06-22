//define a class Badge with:
//a private static int variable called totalNumberOfEmployees (the value of this variable will be shared across multiple class instances)
//a private String variable called badgeIdCode
//a public Employee variable called employee
//a private static void method called keepTrackOfEmployeesNumber() that increments by 1 the totalNumberOfEmployees
//a private String method called generateBadgeIdCode() that returns a String containing name and surname of the employee between two random String codes (e.g. XYZNameSurnameZYX)
//a public void method called showBadgeDetails() that informs the user about:
//the total number of employee tracked by the badges
//the details of the employee
//the badgeIdCode
//a constructor method that takes an Employee param called employeeThatNeedsBadge and:
//call the static method for keeping track of the number of employees
//assign the value of employeeThatNeedsBadge to the object's employee property
//assign a generated id code to the object's badgeIdCode
import java.util.Random;
public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        String randomString1 = generateRandomString(3);
        String randomString2 = generateRandomString(3);
        return randomString1 + employee.getName() + employee.getSurname() + randomString2;

    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }

        return randomString.toString();
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees: " + totalNumberOfEmployees +
                "\nEmployee details:\n" + employee.getEmployeeDetails() + "\nBadge ID code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
