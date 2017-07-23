package mvote.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wahyuade on 22/07/17.
 */
@Entity
@Table(name = "admin")
public class AdminModel {
    @Id
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public AdminModel() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AdminModel(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
