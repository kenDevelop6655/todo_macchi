package com.example.todo.mybatis.domain;

import java.util.Date;

public class Task {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private Short id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.user_id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private Short user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.type_id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private Short type_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.title
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.detail
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.deadline
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private Date deadline;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.id
     *
     * @return the value of task.id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.id
     *
     * @param id the value for task.id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.user_id
     *
     * @return the value of task.user_id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public Short getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.user_id
     *
     * @param user_id the value for task.user_id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setUser_id(Short user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.type_id
     *
     * @return the value of task.type_id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public Short getType_id() {
        return type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.type_id
     *
     * @param type_id the value for task.type_id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setType_id(Short type_id) {
        this.type_id = type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.title
     *
     * @return the value of task.title
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.title
     *
     * @param title the value for task.title
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.detail
     *
     * @return the value of task.detail
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.detail
     *
     * @param detail the value for task.detail
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.deadline
     *
     * @return the value of task.deadline
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.deadline
     *
     * @param deadline the value for task.deadline
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}