public class Person {

    private String firstName;
    private String lastName;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = (age<0 || age>100) ? 0 : age;
    }
    public boolean isTeen() {
        return (age < 20 && age > 12);
    }
    public String getFullName() {
        return (firstName.isEmpty() && lastName.isEmpty()) ? "" : (firstName.isEmpty()) ? lastName : (lastName.isEmpty()) ? firstName : firstName + " " + lastName;
    }
}
