package com.example.demo.mybatis.mapper;

import com.example.demo.mybatis.domain.Actor;
import com.example.demo.mybatis.domain.ActorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface ActorMapper {
    List<Actor> selectAll();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    long countByExample(ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int deleteByExample(ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int deleteByPrimaryKey(Integer actor_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int insert(Actor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int insertSelective(Actor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    List<Actor> selectByExample(ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    Actor selectByPrimaryKey(Integer actor_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int updateByPrimaryKeySelective(Actor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat May 20 21:54:25 JST 2023
     */
    int updateByPrimaryKey(Actor record);
}