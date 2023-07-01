package com.example.todo.app.task;


import java.sql.Timestamp;
import java.time.LocalDateTime;


import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

public class TaskForm {

    @Digits(integer = 1, fraction = 0)
    private int typeId;

    @NotNull (message = "タイトルを入力してください。")
    @Size(min = 1, max = 20, message = "20文字以内で入力してください。")
    private String title;

    @NotNull (message = "内容を入力してください。")
    private String detail;

    @NotNull(message = "期限を設定してください。")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @Future(message = "期限が過去に設定されています。")
    private LocalDateTime deadline;

    private boolean newTask;

    public TaskForm() {}

    public TaskForm(int typeId,
                    String title,
                    String detail,
                    LocalDateTime deadline,
                    boolean newTask) {
        this.typeId = typeId;
        this.title = title;
        this.detail = detail;
        this.deadline = deadline;
        this.newTask = newTask;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public boolean isNewTask() {
        return newTask;
    }

    public void setNewTask(boolean newTask) {
        this.newTask = newTask;
    }
}