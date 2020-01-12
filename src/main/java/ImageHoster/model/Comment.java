package ImageHoster.model;

import javax.persistence.*;
import java.util.Date;

//@Entity annotation; class is JPA entity
@Entity
//@Table annotation; table name mapped in database is 'comments'
@Table(name = "comments")
public class Comment {
    //@Id annotation specifies attribute specified is primary key
    //@Column indicates that column mapped with database is id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    //comments data longer than 256 using TEXT columnDefination
    @Column(columnDefinition = "TEXT")
    private String text;

    //date when comment is added
    @Column(name = "created_date")
    private Date createdDate;

    //each comment connected with user; and used can have multiple comments on specific image
    //comment is mapped with user with Many:One mapping
    //Fetch type is EAGER
    @ManyToOne(fetch = FetchType.EAGER)
    //used_id is primary key from users table mapped with comments table
    @JoinColumn(name = "user_id")
    private User user;

    //Each comment belongs to specific image and each image can be having more than one comment
    //Comment is mapped with Many:one mapping with image
    @ManyToOne(fetch = FetchType.EAGER)
    //image_id is images tables primary key mapped with comments table
    @JoinColumn(name = "image_id")
    private Image image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
