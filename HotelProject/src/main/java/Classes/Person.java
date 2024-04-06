package Classes;


public class Person  {
// Declare instance variables to store information about a person
private int cin; // National ID number
private String FN; // First name
private String LN; // Last name
private String email; // Email address
private int phone; // Phone number

// Default constructor with no arguments
public Person() {
}

// Parameterized constructor to initialize the instance variables
public Person(int cin, String FN, String LN, String email, int phone) {
    this.cin = cin;
    this.FN = FN;
    this.LN = LN;
    this.email = email;
    this.phone = phone;
}

// Getters and setters for the instance variables
public int getCin() {
    return cin;
}

public void setCin(int cin) {
    this.cin = cin;
}

public String getFN() {
    return FN;
}

public void setFN(String FN) {
    this.FN = FN;
}

public String getLN() {
    return LN;
}

public void setLN(String LN) {
    this.LN = LN;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public int getPhone() {
    return phone;
}

public void setPhone(int phone) {
    this.phone = phone;
}

// Override the toString() method to return a string representation of the object
@Override
public String toString() {
    return "Person{" +
            "cin=" + cin +
            ", FN='" + FN + '\'' +
            ", LN='" + LN + '\'' +
            ", email='" + email + '\'' +
            ", phone=" + phone +
            '}';
}

    
}