package com.example.todo.entity;

import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class MergedTask {

    private int id;
    private int user_id;
    private int type_id;
    private String title;
    private String detail;
    private Timestamp deadline;
    private TaskType taskType;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return user_id;
    }
    public void setUserId(int userId) {
        this.user_id = userId;
    }
    public int getTypeId() {
        return type_id;
    }
    public void setTypeId(int typeId) {
        this.type_id = typeId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public Timestamp getDeadline() {
        return deadline;
    }
    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }
    public TaskType getTaskType() {
        return taskType;
    }
    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

}

