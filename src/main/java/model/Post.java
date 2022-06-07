package model;


import java.sql.Date;

public class Post {
    private int id;
    private String title;
    private int view;
    private String image;
    private String content;
    private int userId;
    private int categoryId;
    private Date date;

    public Post() {
    }

    public Post(int id, String title, int view, String image, String content, int userId, int categoryId, Date date) {
        this.id = id;
        this.title = title;
        this.view = view;
        this.image = image;
        this.content = content;
        this.userId = userId;
        this.categoryId = categoryId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
