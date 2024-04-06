package Classes;

// Employee class extends Person class
public class Employee extends Person {

    // private static variable manager
    private static Employee manager;

    // private instance variables
    private String username;
    private String password;
    private String securityquestion;
    private String answer;
    private String status;

    // constructors

    // default constructor
    public Employee() {
    }

    // parameterized constructor
    public Employee(int cin, String FN, String LN, String email, int phone, String username, String password,
            String securityquestion, String answer, String status) {
        // calling superclass constructor
        super(cin, FN, LN, email, phone);
        // initializing instance variables
        this.username = username;
        this.password = password;
        this.securityquestion = securityquestion;
        this.answer = answer;
        this.status = status;
    }

    // getters and setters

    // getter for manager
    public static Employee getManager() {
        return manager;
    }

    // setter for manager
    public static void setManager(Employee manager) {
        Employee.manager = manager;
    }

    // getter for username
    public String getUsername() {
        return username;
    }

    // setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // getter for password
    public String getPassword() {
        return password;
    }

    // setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // getter for security question
    public String getSecurityquestion() {
        return securityquestion;
    }

    // setter for security question
    public void setSecurityquestion(String securityquestion) {
        this.securityquestion = securityquestion;
    }

    // getter for answer
    public String getAnswer() {
        return answer;
    }

    // setter for answer
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // getter for status
    public String getStatus() {
        return status;
    }

    // setter for status
    public void setStatus(String status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "Personnel{" + "username='" + username + '\'' + ", password='" + password + '\''
                + ", securityquestion='" + securityquestion + '\'' + ", answer='" + answer + '\'' + ", status='"
                + status + '\'' + '}';
    }

    // method to check if employee is manager
    public boolean isManager() {
        return this.equals(manager);
    }

    // static initialization block to create a default manager
    static {
        manager = new Employee(999, "MANAGERFN", "MANAGERLN", "managername@admin.com", 21600000, "hms", "admin",
                "What is the name of the town where you were born?", "tunis", "true");
    }
}
