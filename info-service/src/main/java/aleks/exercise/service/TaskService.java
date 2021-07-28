package aleks.exercise.service;

import aleks.exercise.dao.TaskRepository;
import aleks.exercise.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepo;

    @Autowired
    public TaskService(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task addTask(Task task) {
        return taskRepo.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    public Task updateTask(Task task) {
        return taskRepo.save(task);
    }

    public Task findTaskById(Long id) {
        return taskRepo.findTaskById(id).orElseThrow(() -> new ItemNotFoundException("Task by id:" + id + ", does not exist"));
    }

    public void deleteTask(Long id){
        taskRepo.deleteTaskById(id);
    }
}