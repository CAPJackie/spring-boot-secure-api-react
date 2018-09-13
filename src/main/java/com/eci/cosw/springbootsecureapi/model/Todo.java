package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Todo {
    private int priority;
    private String text;
    private Date dueDate;


    public Todo(){

    }

    public Todo (int priority, String text, Date dueDate){
        this.priority = priority;
        this.text = text;
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
