class Login {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class LoginTest {
    public static void main(String[] args) {
        Login l = new Login();
        l.setUsername("admin");
        l.setPassword("admin123");

        System.out.println("Username: " + l.getUsername());
        System.out.println("Password: " + l.getPassword());
    }
}