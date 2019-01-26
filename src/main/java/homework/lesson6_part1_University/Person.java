package homework.lesson6_part1_University;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;

    public Person(String firstName, String secondName, String patronymic,
                  LocalDate dateOfBirth, String address, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    protected LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + patronymic +
                "\nDate of Birth: " + dateOfBirth.toString() +
                "\nAddress: " + address +
                "\nPhone number: " + phoneNumber + "\n";
    }
}
