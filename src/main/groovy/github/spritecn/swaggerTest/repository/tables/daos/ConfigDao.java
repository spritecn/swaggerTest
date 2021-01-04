/*
 * This file is generated by jOOQ.
 */
package github.spritecn.swaggerTest.repository.tables.daos;


import github.spritecn.swaggerTest.repository.tables.Config;
import github.spritecn.swaggerTest.repository.tables.pojos.ConfigEntity;
import github.spritecn.swaggerTest.repository.tables.records.ConfigRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigDao extends DAOImpl<ConfigRecord, ConfigEntity, Integer> {

    /**
     * Create a new ConfigDao without any configuration
     */
    public ConfigDao() {
        super(Config.CONFIG, ConfigEntity.class);
    }

    /**
     * Create a new ConfigDao with an attached configuration
     */
    public ConfigDao(Configuration configuration) {
        super(Config.CONFIG, ConfigEntity.class, configuration);
    }

    @Override
    public Integer getId(ConfigEntity object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ConfigEntity> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Config.CONFIG.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<ConfigEntity> fetchById(Integer... values) {
        return fetch(Config.CONFIG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public ConfigEntity fetchOneById(Integer value) {
        return fetchOne(Config.CONFIG.ID, value);
    }

    /**
     * Fetch records that have <code>last_update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ConfigEntity> fetchRangeOfLastUpdateTime(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Config.CONFIG.LAST_UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update_time IN (values)</code>
     */
    public List<ConfigEntity> fetchByLastUpdateTime(Long... values) {
        return fetch(Config.CONFIG.LAST_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ConfigEntity> fetchRangeOfType(Short lowerInclusive, Short upperInclusive) {
        return fetchRange(Config.CONFIG.TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<ConfigEntity> fetchByType(Short... values) {
        return fetch(Config.CONFIG.TYPE, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ConfigEntity> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Config.CONFIG.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<ConfigEntity> fetchByName(String... values) {
        return fetch(Config.CONFIG.NAME, values);
    }

    /**
     * Fetch records that have <code>value BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<ConfigEntity> fetchRangeOfValue(String lowerInclusive, String upperInclusive) {
        return fetchRange(Config.CONFIG.VALUE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<ConfigEntity> fetchByValue(String... values) {
        return fetch(Config.CONFIG.VALUE, values);
    }
}