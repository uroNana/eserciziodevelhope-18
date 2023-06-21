//define a tester class where you:
//create 2 new Employee objects
//create their new 2 Badge
//show to the user the 2 employees' badge details

public class Tester {
    public static void main(String[] args) {
        Employee miriana = new Employee("Miriana", "Martinelli", "Via Rossi 11");
        Employee mario = new Employee("Mario", "Rossi", "Via Verdi 22");

        Badge badge1 = new Badge(miriana);
        Badge badge2 = new Badge(mario);

        badge1.showBadgeDetails();
        System.out.println();
        badge2.showBadgeDetails();
    }
}
