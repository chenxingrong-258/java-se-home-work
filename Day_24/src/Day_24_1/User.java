package Day_24_1;

import java.io.*;

public class User implements Serializable  {

    @Serial
    private static final long serialVersionUID = -1569331119750778372L;
    private String user_name;
    private String password;

    public User() {
    }

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
