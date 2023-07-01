package com.example.todo.mybatis.mapper;

import com.example.todo.entity.MergedTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MergedTaskMapper {
    List<MergedTask> selectAll();

    MergedTask getTask(int id);

    void insert(MergedTask mergedTask);

    void update(MergedTask mergedTask);

    void deleteById(int id);

    List<MergedTask> findByType(int typeId);



}


