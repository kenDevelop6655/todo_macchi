package com.example.todo.mybatis.domain;

public class TaskType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_type.id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private Short id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_type.type
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_type.comment
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_type.id
     *
     * @return the value of task_type.id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_type.id
     *
     * @param id the value for task_type.id
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_type.type
     *
     * @return the value of task_type.type
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_type.type
     *
     * @param type the value for task_type.type
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_type.comment
     *
     * @return the value of task_type.comment
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_type.comment
     *
     * @param comment the value for task_type.comment
     *
     * @mbg.generated Mon May 22 20:41:44 JST 2023
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}