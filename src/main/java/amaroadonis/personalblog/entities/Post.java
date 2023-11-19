package amaroadonis.personalblog.entities;

import java.util.Date;

public class Post {
    private Integer id;
    private String title;
    private String text;
    private Date createdOn;
    private String author;

    public Post() {
    }

    public Post(Integer id, String title, String text, Date createdOn, String author) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.createdOn = createdOn;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

