package cn.lingnan.bean;

/**
 *
 */
public class User {
    private String userid;

    private String username;

    private String password;

    private String sex;

    private Integer superuser;

    private String rol;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getSuperuser() {
        return superuser;
    }

    public void setSuperuser(Integer superuser) {
        this.superuser = superuser;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol == null ? null : rol.trim();
    }
}