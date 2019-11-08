package com.manager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String userName;
    private String email;
    private String phoneNumber;
    private String password;

//    @ManyToMany(mappedBy = "users")
//    private Set<Board> boards;

//    @ManyToMany
//    @JoinTable(
//            name = "user_board",
//            joinColumns = @JoinColumn(name = "userID"),
//            inverseJoinColumns = @JoinColumn(name = "boardID")
//    )
//    private Set<Board> boards;

    public User() {
    }

    public User(String userName, String email, String phoneNumber, String password) {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Set<Board> getBoards() {
//        return boards;
//    }
//
//    public void setBoards(Set<Board> boards) {
//        this.boards = boards;
//    }
}
