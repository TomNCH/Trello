package com.manager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long boardId;
    private String boardName;
    private String time;

//    @ManyToMany
//    @JoinTable(
//            name = "user_board",
//            joinColumns = @JoinColumn(name = "boardID"),
//            inverseJoinColumns = @JoinColumn(name = "userID")
//    )
//    private Set<User> users;

//    @ManyToMany(mappedBy = "boards")
//    private Set<User> users;

    @OneToMany(targetEntity = List.class)
    private java.util.List<List> lists;

    public Board() {
    }

    public Board(String boardName, String time) {
        this.boardName = boardName;
        this.time = time;
    }

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public java.util.List<List> getLists() {
        return lists;
    }

    public void setLists(java.util.List<List> lists) {
        this.lists = lists;
    }

//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
}
