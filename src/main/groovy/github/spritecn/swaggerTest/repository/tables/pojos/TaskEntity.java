/*
 * This file is generated by jOOQ.
 */
package github.spritecn.swaggerTest.repository.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskEntity implements Serializable {

    private static final long serialVersionUID = 521894158;

    private Integer id;
    private Long    lastUpdateTime;
    private String  requestBody;
    private Integer failCount;
    private Integer passCount;
    private Long    startTime;
    private Long    endTime;

    public TaskEntity() {}

    public TaskEntity(TaskEntity value) {
        this.id = value.id;
        this.lastUpdateTime = value.lastUpdateTime;
        this.requestBody = value.requestBody;
        this.failCount = value.failCount;
        this.passCount = value.passCount;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
    }

    public TaskEntity(
        Integer id,
        Long    lastUpdateTime,
        String  requestBody,
        Integer failCount,
        Integer passCount,
        Long    startTime,
        Long    endTime
    ) {
        this.id = id;
        this.lastUpdateTime = lastUpdateTime;
        this.requestBody = requestBody;
        this.failCount = failCount;
        this.passCount = passCount;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getId() {
        return this.id;
    }

    public TaskEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public TaskEntity setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public String getRequestBody() {
        return this.requestBody;
    }

    public TaskEntity setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    public Integer getFailCount() {
        return this.failCount;
    }

    public TaskEntity setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }

    public Integer getPassCount() {
        return this.passCount;
    }

    public TaskEntity setPassCount(Integer passCount) {
        this.passCount = passCount;
        return this;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public TaskEntity setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public TaskEntity setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskEntity (");

        sb.append(id);
        sb.append(", ").append(lastUpdateTime);
        sb.append(", ").append(requestBody);
        sb.append(", ").append(failCount);
        sb.append(", ").append(passCount);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);

        sb.append(")");
        return sb.toString();
    }
}