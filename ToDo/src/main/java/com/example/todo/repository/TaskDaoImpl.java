//package com.example.todo.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import com.example.todo.mybatis.mapper.MergedTaskMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.example.todo.entity.MergedTask;
//
//@Repository
//public class TaskDaoImpl implements TaskDao {
//
//    @Autowired
//    private final JdbcTemplate jdbcTemplate;
//    @Autowired
//    private final MergedTaskMapper findAllMapper;
//
//    public TaskDaoImpl(JdbcTemplate jdbcTemplate, MergedTaskMapper mergedTaskMapper) {
//        this.jdbcTemplate = jdbcTemplate;
//        this.findAllMapper= mergedTaskMapper;
//    }
//
//    @Override
//    public List<MergedTask> findAll() {
//
////        String sql = "SELECT task.id, user_id, type_id, title, detail, deadline, "
////                + "type, comment FROM task "
////                + "INNER JOIN task_type ON task.type_id = task_type.id";
////
////        //タスク一覧をMapのListで取得
////        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
////
////        //return用の空のListを用意
////        List<Task> list = new ArrayList<Task>();
////
////        //二つのテーブルのデータをTaskにまとめる
////        for(Map<String, Object> result : resultList) {
////
////            Task task = new Task();
////            task.setId((int)result.get("id"));
////            task.setUserId((int)result.get("user_id"));
////            task.setTypeId((int)result.get("type_id"));
////            task.setTitle((String)result.get("title"));
////            task.setDetail((String)result.get("detail"));
////            task.setDeadline(((Timestamp) result.get("deadline")).toLocalDateTime());
////
////            TaskType type = new TaskType();
////            type.setId((int)result.get("type_id"));
////            type.setType((String)result.get("type"));
////            type.setComment((String)result.get("comment"));
////
////            //TaskにTaskTypeをセット
////            task.setTaskType(type);
////
////            list.add(task);
////        }
////        return list;
//        return findAllMapper.findAll();
//    }
//
//    @Override
//    public Optional<MergedTask> findById(int id) {
////        String sql = "SELECT task.id, user_id, type_id, title, detail, deadline, "
////                + "type, comment FROM task "
////                + "INNER JOIN task_type ON task.type_id = task_type.id "
////                + "WHERE task.id = ?";
////
////        //タスクを一件取得
////        Map<String, Object> result = jdbcTemplate.queryForMap(sql, id);
////
////        Task task = new Task();
////        task.setId((int)result.get("id"));
////        task.setUserId((int)result.get("user_id"));
////        task.setTypeId((int)result.get("type_id"));
////        task.setTitle((String)result.get("title"));
////        task.setDetail((String)result.get("detail"));
////        task.setDeadline(((Timestamp) result.get("deadline")).toLocalDateTime());
////
////        TaskType type = new TaskType();
////        type.setId((int)result.get("type_id"));
////        type.setType((String)result.get("type"));
////        type.setComment((String)result.get("comment"));
////        task.setTaskType(type);
////
////
////        //taskをOptionalでラップする
////        Optional<Task> taskOpt = Optional.ofNullable(task);
////
////        return taskOpt;
//        Optional<MergedTask> taskOpt = Optional.ofNullable(null);
//
//        return taskOpt;
//    }
//
//    @Override
//    public void insert(MergedTask task) {
////        jdbcTemplate.update("INSERT INTO task(user_id, type_id, title, detail, deadline) VALUES(?, ?, ?, ?,?)",
////                task.getUserId(), task.getTypeId(), task.getTitle(), task.getDetail(), task.getDeadline() );
//    }
//
//    @Override
//    public int update(MergedTask task) {
////        return jdbcTemplate.update("UPDATE task SET type_id = ?, title = ?, detail = ?,deadline = ? WHERE id = ?",
////                task.getTypeId(), task.getTitle(), task.getDetail(), task.getDeadline(), task.getId() );
//        return 1;
//    }
//
//    @Override
//    public int deleteById(int id) {
//        return jdbcTemplate.update("DELETE FROM task WHERE id = ?", id);
//    }
//
//    @Override
//    public List<MergedTask> findByType(int typeId) {
//        //2-1 指定したtype_idと一致するタスクのリストを取得するためのSQLを記述する
////        String sql = "SELECT task.id, user_id, type_id, title, detail, deadline, "
////                + "type, comment FROM task "
////                + "INNER JOIN task_type ON task.type_id = task_type.id "
////                + "WHERE task_type.id = ?";
////
////        //2-2 SQLとtypeIdを渡し、タスク一覧をMapのListで取得する
////        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql,typeId);
////
////        //return用の空のListを用意
////        List<Task> list = new ArrayList<>();
////
////        //二つのテーブルのデータをTaskにまとめる
////        for(Map<String, Object> result : resultList) {
////
////            Task task = new Task();
////            task.setId((int)result.get("id"));
////            task.setUserId((int)result.get("user_id"));
////            task.setTypeId((int)result.get("type_id"));
////            task.setTitle((String)result.get("title"));
////            task.setDetail((String)result.get("detail"));
////            task.setDeadline(((Timestamp) result.get("deadline")).toLocalDateTime());
////
////            TaskType type = new TaskType();
////            type.setId((int)result.get("type_id"));
////            type.setType((String)result.get("type"));
////            type.setComment((String)result.get("comment"));
////            task.setTaskType(type);
////
////            list.add(task);
////        }
////        return list;
//        List<MergedTask> list = new ArrayList<>();
//        return list;
//    }
//
//}
//
