package aleks.exercise.model;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private int timeSpent;
    private boolean taskDone;
    private String assignee;
    private String taskGroup;

    protected Task() {}

    public Task(String name, int timeSpent, boolean taskDone, String assignee, String taskGroup) {
        this.name = name;
        this.timeSpent = timeSpent;
        this.taskDone = taskDone;
        this.assignee = assignee;
        this.taskGroup = taskGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(int timeSpent){
        this.timeSpent = timeSpent;
    }

    public boolean getTaskDone() {
        return taskDone;
    }

    public void setTaskDone(boolean taskDone){
        this.taskDone = taskDone;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee){
        this.assignee = assignee;
    }

    public String getTaskGroup() {
        return taskGroup;
    }

    public void setTaskGroup(String taskGroup){
        this.taskGroup = taskGroup;
    }

    @Override
    public String toString(){
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timeSpent='" + timeSpent + '\'' +
                ", taskDone='" + taskDone + '\'' +
                //", assignee='" + assignee.getFirstName() + ' ' + assignee.getLastName() + '\'' +
                //", taskGroup='" + taskGroup.getName() + '\'' +
                ", assignee='" + assignee + '\'' +
                ", taskGroup='" + taskGroup + '\'' +
                '}';
    }
}