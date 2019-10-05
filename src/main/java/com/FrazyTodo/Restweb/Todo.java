package com.FrazyTodo.Restweb;
import java.util.*;

public class Todo {

    private long id;
    private String username;
    private String description;

    public Todo(long id, String username, String description, Date targetDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    private Date targetDate;
    private boolean isDone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo)) return false;
        Todo todo = (Todo) o;
        return getId() == todo.getId();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) return false;
//        if(getClass() != o.getClass()) return  false;
//        Todo todo = (Todo) o;
//        if (id != todo.id) return false;
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((email == null) ? 0 : email.hashCode());
//        result = prime * result + (int) (id ^ (id >>> 32));
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        return result;
//    }


    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
