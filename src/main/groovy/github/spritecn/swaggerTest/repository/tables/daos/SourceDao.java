/*
 * This file is generated by jOOQ.
 */
package github.spritecn.swaggerTest.repository.tables.daos;


import github.spritecn.swaggerTest.repository.tables.Source;
import github.spritecn.swaggerTest.repository.tables.pojos.SourceEntity;
import github.spritecn.swaggerTest.repository.tables.records.SourceRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SourceDao extends DAOImpl<SourceRecord, SourceEntity, Integer> {

    /**
     * Create a new SourceDao without any configuration
     */
    public SourceDao() {
        super(Source.SOURCE, SourceEntity.class);
    }

    /**
     * Create a new SourceDao with an attached configuration
     */
    public SourceDao(Configuration configuration) {
        super(Source.SOURCE, SourceEntity.class, configuration);
    }

    @Override
    public Integer getId(SourceEntity object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Source.SOURCE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<SourceEntity> fetchById(Integer... values) {
        return fetch(Source.SOURCE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public SourceEntity fetchOneById(Integer value) {
        return fetchOne(Source.SOURCE.ID, value);
    }

    /**
     * Fetch records that have <code>url BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfUrl(String lowerInclusive, String upperInclusive) {
        return fetchRange(Source.SOURCE.URL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<SourceEntity> fetchByUrl(String... values) {
        return fetch(Source.SOURCE.URL, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Source.SOURCE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<SourceEntity> fetchByName(String... values) {
        return fetch(Source.SOURCE.NAME, values);
    }

    /**
     * Fetch records that have <code>invalid BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfInvalid(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(Source.SOURCE.INVALID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>invalid IN (values)</code>
     */
    public List<SourceEntity> fetchByInvalid(Short... values) {
        return fetch(Source.SOURCE.INVALID, values);
    }

    /**
     * Fetch records that have <code>last_update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfLastUpdateTime(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Source.SOURCE.LAST_UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update_time IN (values)</code>
     */
    public List<SourceEntity> fetchByLastUpdateTime(Long... values) {
        return fetch(Source.SOURCE.LAST_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>last_fetch_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfLastFetchTime(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Source.SOURCE.LAST_FETCH_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_fetch_time IN (values)</code>
     */
    public List<SourceEntity> fetchByLastFetchTime(Long... values) {
        return fetch(Source.SOURCE.LAST_FETCH_TIME, values);
    }

    /**
     * Fetch records that have <code>auto_fetch_interval BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfAutoFetchInterval(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(Source.SOURCE.AUTO_FETCH_INTERVAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>auto_fetch_interval IN (values)</code>
     */
    public List<SourceEntity> fetchByAutoFetchInterval(Short... values) {
        return fetch(Source.SOURCE.AUTO_FETCH_INTERVAL, values);
    }

    /**
     * Fetch records that have <code>base_path BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<SourceEntity> fetchRangeOfBasePath(String lowerInclusive, String upperInclusive) {
        return fetchRange(Source.SOURCE.BASE_PATH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>base_path IN (values)</code>
     */
    public List<SourceEntity> fetchByBasePath(String... values) {
        return fetch(Source.SOURCE.BASE_PATH, values);
    }
}
