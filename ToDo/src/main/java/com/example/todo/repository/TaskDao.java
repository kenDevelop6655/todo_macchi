package com.example.todo.repository;


import java.util.List;
import java.util.Optional;

import com.example.todo.entity.MergedTask;

public interface TaskDao{

    List<MergedTask> findAll();

    Optional<MergedTask> findById(int id);

    void insert(MergedTask task);

    int update(MergedTask task);

    int deleteById(int id);

    List<MergedTask> findByType(int typeId);

}
