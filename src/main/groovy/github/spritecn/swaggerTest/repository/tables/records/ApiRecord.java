/*
 * This file is generated by jOOQ.
 */
package github.spritecn.swaggerTest.repository.tables.records;


import github.spritecn.swaggerTest.repository.tables.Api;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApiRecord extends UpdatableRecordImpl<ApiRecord> implements Record9<Integer, Long, Integer, String, String, Short, Short, Short, String> {

    private static final long serialVersionUID = -1467830443;

    /**
     * Setter for <code>api.id</code>.
     */
    public ApiRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>api.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>api.last_update_time</code>.
     */
    public ApiRecord setLastUpdateTime(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>api.last_update_time</code>.
     */
    public Long getLastUpdateTime() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>api.source_id</code>.
     */
    public ApiRecord setSourceId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>api.source_id</code>.
     */
    public Integer getSourceId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>api.url</code>.
     */
    public ApiRecord setUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>api.url</code>.
     */
    public String getUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>api.tags</code>.
     */
    public ApiRecord setTags(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>api.tags</code>.
     */
    public String getTags() {
        return (String) get(4);
    }

    /**
     * Setter for <code>api.method</code>.
     */
    public ApiRecord setMethod(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>api.method</code>.
     */
    public Short getMethod() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>api.request_type</code>.
     */
    public ApiRecord setRequestType(Short value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>api.request_type</code>.
     */
    public Short getRequestType() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>api.response_type</code>.
     */
    public ApiRecord setResponseType(Short value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>api.response_type</code>.
     */
    public Short getResponseType() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>api.request_template</code>.
     */
    public ApiRecord setRequestTemplate(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>api.request_template</code>.
     */
    public String getRequestTemplate() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Long, Integer, String, String, Short, Short, Short, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Long, Integer, String, String, Short, Short, Short, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Api.API.ID;
    }

    @Override
    public Field<Long> field2() {
        return Api.API.LAST_UPDATE_TIME;
    }

    @Override
    public Field<Integer> field3() {
        return Api.API.SOURCE_ID;
    }

    @Override
    public Field<String> field4() {
        return Api.API.URL;
    }

    @Override
    public Field<String> field5() {
        return Api.API.TAGS;
    }

    @Override
    public Field<Short> field6() {
        return Api.API.METHOD;
    }

    @Override
    public Field<Short> field7() {
        return Api.API.REQUEST_TYPE;
    }

    @Override
    public Field<Short> field8() {
        return Api.API.RESPONSE_TYPE;
    }

    @Override
    public Field<String> field9() {
        return Api.API.REQUEST_TEMPLATE;
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
        return getSourceId();
    }

    @Override
    public String component4() {
        return getUrl();
    }

    @Override
    public String component5() {
        return getTags();
    }

    @Override
    public Short component6() {
        return getMethod();
    }

    @Override
    public Short component7() {
        return getRequestType();
    }

    @Override
    public Short component8() {
        return getResponseType();
    }

    @Override
    public String component9() {
        return getRequestTemplate();
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
        return getSourceId();
    }

    @Override
    public String value4() {
        return getUrl();
    }

    @Override
    public String value5() {
        return getTags();
    }

    @Override
    public Short value6() {
        return getMethod();
    }

    @Override
    public Short value7() {
        return getRequestType();
    }

    @Override
    public Short value8() {
        return getResponseType();
    }

    @Override
    public String value9() {
        return getRequestTemplate();
    }

    @Override
    public ApiRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ApiRecord value2(Long value) {
        setLastUpdateTime(value);
        return this;
    }

    @Override
    public ApiRecord value3(Integer value) {
        setSourceId(value);
        return this;
    }

    @Override
    public ApiRecord value4(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public ApiRecord value5(String value) {
        setTags(value);
        return this;
    }

    @Override
    public ApiRecord value6(Short value) {
        setMethod(value);
        return this;
    }

    @Override
    public ApiRecord value7(Short value) {
        setRequestType(value);
        return this;
    }

    @Override
    public ApiRecord value8(Short value) {
        setResponseType(value);
        return this;
    }

    @Override
    public ApiRecord value9(String value) {
        setRequestTemplate(value);
        return this;
    }

    @Override
    public ApiRecord values(Integer value1, Long value2, Integer value3, String value4, String value5, Short value6, Short value7, Short value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApiRecord
     */
    public ApiRecord() {
        super(Api.API);
    }

    /**
     * Create a detached, initialised ApiRecord
     */
    public ApiRecord(Integer id, Long lastUpdateTime, Integer sourceId, String url, String tags, Short method, Short requestType, Short responseType, String requestTemplate) {
        super(Api.API);

        set(0, id);
        set(1, lastUpdateTime);
        set(2, sourceId);
        set(3, url);
        set(4, tags);
        set(5, method);
        set(6, requestType);
        set(7, responseType);
        set(8, requestTemplate);
    }
}