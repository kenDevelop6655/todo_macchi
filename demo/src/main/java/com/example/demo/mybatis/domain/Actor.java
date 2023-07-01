package com.example.demo.mybatis.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

public class Actor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.actor_id
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    private Integer actor_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.first_name
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    private String first_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.last_name
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    private String last_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column actor.last_update
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    private Date last_update;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.actor_id
     *
     * @return the value of actor.actor_id
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public Integer getActor_id() {
        return actor_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.actor_id
     *
     * @param actor_id the value for actor.actor_id
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.first_name
     *
     * @return the value of actor.first_name
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.first_name
     *
     * @param first_name the value for actor.first_name
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name == null ? null : first_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.last_name
     *
     * @return the value of actor.last_name
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.last_name
     *
     * @param last_name the value for actor.last_name
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name == null ? null : last_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column actor.last_update
     *
     * @return the value of actor.last_update
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column actor.last_update
     *
     * @param last_update the value for actor.last_update
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}