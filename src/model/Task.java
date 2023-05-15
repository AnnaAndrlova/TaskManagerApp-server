package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * A class representing a task
 * @author Anna Andrlova, Alex Bolfa, Cosmin Demian, Jan Metela, Arturs Ricards Rijnieks
 * @version 1.0 - May 2023
 */
public class Task implements Serializable {
    /**
     * The id of the task.
     */
    private Long id;
    /**
     * The name of the task.
     */
    private String name;
    /**
     * The description of the task.
     */
    private String description;
    /**
     * The deadline of the task.
     */
    private LocalDate deadline;
    /**
     * The estimated time of the task.
     */
    private Integer estimatedTime;
    /**
     * The priority of the task.
     */
    private String priority;
    /**
     * The status of the task.
     */
    private String status;
    /**
     * The id of the project the task belongs to.
     */
    private Long projectId;
    /**
     * The starting date of the task.
     */
    private LocalDate startingDate;
    /**
     * The list of employees working on the task.
     */

    private EmployeeList workers;

    /**
     * The list of tags of the task.
     */
    private TagList tags;

    /**
     * 10-argument constructor for the class Task.
     * @param id
     * @param name
     * @param description
     * @param deadline
     * @param estimatedTime
     * @param priority
     * @param status
     * @param projectId
     * @param startingDate
     * @param workers
     */
    public Task(Long id, String name, String description, LocalDate deadline, int estimatedTime, String priority, String status, Long projectId, LocalDate startingDate, EmployeeList workers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.estimatedTime = estimatedTime;
        this.priority = priority;
        this.status = status;
        this.projectId = projectId;
        this.startingDate = startingDate;
        this.workers = workers;
        this.tags = new TagList();
    }

    /**
     * 8-argument constructor for the class Task, does not set the id and workers are set to new EmployeeList.
     * @param name
     * @param description
     * @param deadline
     * @param estimatedTime
     * @param priority
     * @param status
     * @param projectId
     * @param startingDate
     */
    public Task(String name, String description, LocalDate deadline, Integer estimatedTime, String priority, String status, Long projectId, LocalDate startingDate) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.estimatedTime = estimatedTime;
        this.priority = priority;
        this.status = status;
        this.projectId = projectId;
        this.startingDate = startingDate;
        workers = new EmployeeList();
        this.tags = new TagList();
    }

    /**
     * 9-argument constructor for the class Task, workers are set to new EmployeeList.
     * @param id
     * @param name
     * @param description
     * @param deadline
     * @param estimatedTime
     * @param priority
     * @param status
     * @param projectId
     * @param startingDate
     */
    public Task(Long id, String name, String description, LocalDate deadline, int estimatedTime, String priority, String status, Long projectId, LocalDate startingDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.estimatedTime = estimatedTime;
        this.priority = priority;
        this.status = status;
        this.projectId = projectId;
        this.startingDate = startingDate;
        workers = new EmployeeList();
        this.tags = new TagList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long serverId) {
        this.projectId = serverId;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public EmployeeList getWorkers() {
        return workers;
    }

    public void setWorkers(EmployeeList workers) {
        this.workers = workers;
    }

    public boolean equals(Object object){
        if (object instanceof Task){
            Task task = (Task) object;
            return task.getId().equals(this.getId()) &&
                    task.getStatus().equals(this.getStatus()) &&
                    task.getPriority().equals(this.getPriority()) &&
                    task.getEstimatedTime() == this.getEstimatedTime() &&
                    task.getDeadline().equals(this.getDeadline()) &&
                    task.getStartingDate().equals(this.getStartingDate()) &&
                    task.getDescription().equals(this.getDescription()) &&
                    task.getName().equals(this.getName()) &&
                    task.getProjectId().equals(this.getProjectId());
        }
        return false;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public TagList getTags() {
        return tags;
    }

    public void setTags(TagList tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", estimatedTime=" + estimatedTime +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", projectId=" + projectId +
                ", startingDate=" + startingDate +
                ", workers=" + workers +
                ", tags=" + tags +
                '}';
    }
}
