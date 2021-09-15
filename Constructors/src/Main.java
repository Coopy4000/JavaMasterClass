public class Main {
    public static void main(String[] args) {

       /* Account bobsAccount = new Account("12345", 0.0, "Bob Brown", "myemail@bobbrown.com", "(087) 123-4567");
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
        Account timsAccount = new Account("Tim", "tim@email.com", "123456789");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());*/

        vipPerson person1 = new vipPerson();
        System.out.println(person1.getName());

        vipPerson person2 = new vipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        vipPerson person3 = new vipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
    }
}