package model;

public class User {
    private int id;
    private String username;
    private String password;
    private String full_name;
    private int level;

    public User() {
    }

    public User(String username, String password, String full_name) {
        this.username = username;
        this.password = password;
        this.full_name = full_name;
    }

    public User(int id, String username, String password, String full_name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.full_name = full_name;
    }

    public User(int id, String username, String password, String full_name, int level) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.full_name = full_name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
