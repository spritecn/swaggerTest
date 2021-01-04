/*
 * This file is generated by jOOQ.
 */
package github.spritecn.swaggerTest.repository;


import github.spritecn.swaggerTest.repository.tables.Api;
import github.spritecn.swaggerTest.repository.tables.Config;
import github.spritecn.swaggerTest.repository.tables.Request;
import github.spritecn.swaggerTest.repository.tables.Running;
import github.spritecn.swaggerTest.repository.tables.Source;
import github.spritecn.swaggerTest.repository.tables.Task;
import github.spritecn.swaggerTest.repository.tables.TaskGroup;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 395907770;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>api</code>.
     */
    public final Api API = Api.API;

    /**
     * The table <code>config</code>.
     */
    public final Config CONFIG = Config.CONFIG;

    /**
     * The table <code>request</code>.
     */
    public final Request REQUEST = Request.REQUEST;

    /**
     * The table <code>running</code>.
     */
    public final Running RUNNING = Running.RUNNING;

    /**
     * The table <code>source</code>.
     */
    public final Source SOURCE = Source.SOURCE;

    /**
     * The table <code>task</code>.
     */
    public final Task TASK = Task.TASK;

    /**
     * The table <code>task_group</code>.
     */
    public final TaskGroup TASK_GROUP = TaskGroup.TASK_GROUP;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Api.API,
            Config.CONFIG,
            Request.REQUEST,
            Running.RUNNING,
            Source.SOURCE,
            Task.TASK,
            TaskGroup.TASK_GROUP);
    }
}
