//package com.example.todo.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import com.example.todo.mybatis.mapper.TaskMapper;
//import com.example.todo.mybatis.mapper.TaskTypeMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.stereotype.Service;
//
//import com.example.todo.repository.TaskDao;
//import com.example.todo.entity.Task;
//
//@Service
//public class TaskServiceImpl implements TaskService {
//
//    @Autowired
//    private final TaskDao dao;
//    private final TaskMapper taskMapper;
//    private final TaskTypeMapper taskTypeMapper;
//
//
//    public TaskServiceImpl(TaskDao dao, TaskMapper taskMapper, TaskTypeMapper taskTypeMapper) {
//        this.dao = dao;
//        this.taskMapper=taskMapper;
//        this.taskTypeMapper=taskTypeMapper;
//    }
//
//    @Override
//    public List<Task> findAll() {
//        return dao.findAll();
//    }
//
//    @Override
//    public Optional<Task> getTask(int id) {
//
//        //Optional<Task>一件を取得 idが無ければ例外発生　
//        try {
//            return dao.findById(id);
//        } catch (EmptyResultDataAccessException e) {
//            throw new TaskNotFoundException("指定されたタスクが存在しません");
//        }
//    }
//
//    @Override
//    public void insert(Task task) {
//        dao.insert(task);
//    }
//
//    @Override
//    public void update(Task task) {
//        if(dao.update(task)==0) {
//            throw new TaskNotFoundException("更新するタスクが存在しません");
//        }
//    }
//
//    @Override
//    public void deleteById(int id) {
//        if(dao.deleteById(id)==0) {
//            throw new TaskNotFoundException("削除するタスクが存在しません");
//        }
//    }
//
//    @Override
//    public List<Task> findByType(int typeId) {
//        //2-3 typeIdを引数に指定してdaoのfindByType実行し、結果をreturnする
//        return dao.findByType(typeId);
//    }
//}
