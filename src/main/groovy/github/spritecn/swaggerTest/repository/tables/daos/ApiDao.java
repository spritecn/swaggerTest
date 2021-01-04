/*
 * This file is generated by jOOQ.
 */
package github.spritecn.swaggerTest.repository.tables.daos;


import github.spritecn.swaggerTest.repository.tables.Api;
import github.spritecn.swaggerTest.repository.tables.pojos.ApiEntity;
import github.spritecn.swaggerTest.repository.tables.records.ApiRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApiDao extends DAOImpl<ApiRecord, ApiEntity, Integer> {

    /**
     * Create a new ApiDao without any configuration
     */
    public ApiDao() {
        super(Api.API, ApiEntity.class);
    }

    /**
     * Create a new ApiDao with an attached configuration
     */
    public ApiDao(Configuration configuration) {
        super(Api.API, ApiEntity.class, configuration);
    }

    @Override
    public Integer getId(ApiEntity object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Api.API.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<ApiEntity> fetchById(Integer... values) {
        return fetch(Api.API.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public ApiEntity fetchOneById(Integer value) {
        return fetchOne(Api.API.ID, value);
    }

    /**
     * Fetch records that have <code>last_update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfLastUpdateTime(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Api.API.LAST_UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update_time IN (values)</code>
     */
    public List<ApiEntity> fetchByLastUpdateTime(Long... values) {
        return fetch(Api.API.LAST_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>source_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfSourceId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Api.API.SOURCE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>source_id IN (values)</code>
     */
    public List<ApiEntity> fetchBySourceId(Integer... values) {
        return fetch(Api.API.SOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>url BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfUrl(String lowerInclusive, String upperInclusive) {
        return fetchRange(Api.API.URL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<ApiEntity> fetchByUrl(String... values) {
        return fetch(Api.API.URL, values);
    }

    /**
     * Fetch records that have <code>tags BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfTags(String lowerInclusive, String upperInclusive) {
        return fetchRange(Api.API.TAGS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tags IN (values)</code>
     */
    public List<ApiEntity> fetchByTags(String... values) {
        return fetch(Api.API.TAGS, values);
    }

    /**
     * Fetch records that have <code>method BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfMethod(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(Api.API.METHOD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>method IN (values)</code>
     */
    public List<ApiEntity> fetchByMethod(Short... values) {
        return fetch(Api.API.METHOD, values);
    }

    /**
     * Fetch records that have <code>request_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfRequestType(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(Api.API.REQUEST_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>request_type IN (values)</code>
     */
    public List<ApiEntity> fetchByRequestType(Short... values) {
        return fetch(Api.API.REQUEST_TYPE, values);
    }

    /**
     * Fetch records that have <code>response_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfResponseType(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(Api.API.RESPONSE_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>response_type IN (values)</code>
     */
    public List<ApiEntity> fetchByResponseType(Short... values) {
        return fetch(Api.API.RESPONSE_TYPE, values);
    }

    /**
     * Fetch records that have <code>request_template BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ApiEntity> fetchRangeOfRequestTemplate(String lowerInclusive, String upperInclusive) {
        return fetchRange(Api.API.REQUEST_TEMPLATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>request_template IN (values)</code>
     */
    public List<ApiEntity> fetchByRequestTemplate(String... values) {
        return fetch(Api.API.REQUEST_TEMPLATE, values);
    }
}