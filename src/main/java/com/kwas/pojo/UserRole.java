package com.kwas.pojo;

/**
 * @Author LZX
 * @Date 2021/10/21 22:51
 * @Version 1.0
 */
public class UserRole {
    private Long id;
    private String username;
    private String roleDesc;
    private   String email;
    private String phoneNum;

    public UserRole() {
    }

    public UserRole(Long id, String username, String roleDesc, String email, String phoneNum) {
        this.id = id;
        this.username = username;
        this.roleDesc = roleDesc;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String roleName) {
        this.username = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
