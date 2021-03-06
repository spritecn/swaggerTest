/*
 * This file is generated by jOOQ.
 */
package github.spritecn.swaggerTest.repository.tables.records;


import github.spritecn.swaggerTest.repository.tables.Running;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RunningRecord extends UpdatableRecordImpl<RunningRecord> implements Record7<Integer, Long, Integer, Integer, Integer, Long, Long> {

    private static final long serialVersionUID = 510023264;

    /**
     * Setter for <code>running.id</code>.
     */
    public RunningRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>running.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>running.last_update_time</code>.
     */
    public RunningRecord setLastUpdateTime(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>running.last_update_time</code>.
     */
    public Long getLastUpdateTime() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>running.group_id</code>.
     */
    public RunningRecord setGroupId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>running.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>running.fail_count</code>.
     */
    public RunningRecord setFailCount(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>running.fail_count</code>.
     */
    public Integer getFailCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>running.pass_count</code>.
     */
    public RunningRecord setPassCount(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>running.pass_count</code>.
     */
    public Integer getPassCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>running.start_time</code>.
     */
    public RunningRecord setStartTime(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>running.start_time</code>.
     */
    public Long getStartTime() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>running.end_time</code>.
     */
    public RunningRecord setEndTime(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>running.end_time</code>.
     */
    public Long getEndTime() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Long, Integer, Integer, Integer, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Long, Integer, Integer, Integer, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Running.RUNNING.ID;
    }

    @Override
    public Field<Long> field2() {
        return Running.RUNNING.LAST_UPDATE_TIME;
    }

    @Override
    public Field<Integer> field3() {
        return Running.RUNNING.GROUP_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Running.RUNNING.FAIL_COUNT;
    }

    @Override
    public Field<Integer> field5() {
        return Running.RUNNING.PASS_COUNT;
    }

    @Override
    public Field<Long> field6() {
        return Running.RUNNING.START_TIME;
    }

    @Override
    public Field<Long> field7() {
        return Running.RUNNING.END_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getLastUpdateTime();
    }

    @Override
    public Integer component3() {
        return getGroupId();
    }

    @Override
    public Integer component4() {
        return getFailCount();
    }

    @Override
    public Integer component5() {
        return getPassCount();
    }

    @Override
    public Long component6() {
        return getStartTime();
    }

    @Override
    public Long component7() {
        return getEndTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getLastUpdateTime();
    }

    @Override
    public Integer value3() {
        return getGroupId();
    }

    @Override
    public Integer value4() {
        return getFailCount();
    }

    @Override
    public Integer value5() {
        return getPassCount();
    }

    @Override
    public Long value6() {
        return getStartTime();
    }

    @Override
    public Long value7() {
        return getEndTime();
    }

    @Override
    public RunningRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RunningRecord value2(Long value) {
        setLastUpdateTime(value);
        return this;
    }

    @Override
    public RunningRecord value3(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public RunningRecord value4(Integer value) {
        setFailCount(value);
        return this;
    }

    @Override
    public RunningRecord value5(Integer value) {
        setPassCount(value);
        return this;
    }

    @Override
    public RunningRecord value6(Long value) {
        setStartTime(value);
        return this;
    }

    @Override
    public RunningRecord value7(Long value) {
        setEndTime(value);
        return this;
    }

    @Override
    public RunningRecord values(Integer value1, Long value2, Integer value3, Integer value4, Integer value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RunningRecord
     */
    public RunningRecord() {
        super(Running.RUNNING);
    }

    /**
     * Create a detached, initialised RunningRecord
     */
    public RunningRecord(Integer id, Long lastUpdateTime, Integer groupId, Integer failCount, Integer passCount, Long startTime, Long endTime) {
        super(Running.RUNNING);

        set(0, id);
        set(1, lastUpdateTime);
        set(2, groupId);
        set(3, failCount);
        set(4, passCount);
        set(5, startTime);
        set(6, endTime);
    }
}
