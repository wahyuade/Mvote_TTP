package mvote.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wahyuade on 20/07/17.
 */
@Entity
@Table(name = "dpt")
public class DptModel {
    @Id
    private String id;

    @Column(name = "nrp")
    private String nrp;

    @Column(name = "token")
    private String token;

    @Column(name = "verifikasi")
    private String verifikasi;

    @Column(name = "privat")
    private String privat;

    @Column(name = "n")
    private String n;

    @Column(name = "email")
    private String email;


    public DptModel() {
    }

    public String getId() {
        return id;
    }

    public String getNrp() {
        return nrp;
    }

    public String getToken() {
        return token;
    }

    public String getVerifikasi() {
        return verifikasi;
    }

    public String getPrivat() {
        return privat;
    }

    public String getN() {
        return n;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setVerifikasi(String verifikasi) {
        this.verifikasi = verifikasi;
    }

    public void setPrivat(String privat) {
        this.privat = privat;
    }

    public void setN(String n) {
        this.n = n;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
