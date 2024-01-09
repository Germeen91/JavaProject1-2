package JavaProject2;
/* Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName*/
public class Registration {
    private String email;
    private String userName;
    private String password;

    Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public void mail() {
        if (email.equalsIgnoreCase("yahoo")) {
            System.out.println(email);
        }
    }

    public void Name() {
        if (!userName.isEmpty() && userName.length() > 6) {
            System.out.println(userName);
        }
    }

    public void pass() {
        if (!password.contains(userName)) {
            System.out.println(password);
        }
    }
}
class TesterRegistration {
    public static void main(String[] args) {

        Registration obj=new Registration("Yahoo","Germeen","12345");
        obj.mail();
        obj.Name();
        obj.pass();
    }
}