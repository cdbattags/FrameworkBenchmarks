/*
 * This file is generated by jOOQ.
*/
package models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import models.tables.Fortune;
import models.tables.World;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelloWorld extends SchemaImpl {

    private static final long serialVersionUID = -1521404055;

    /**
     * The reference instance of <code>hello_world</code>
     */
    public static final HelloWorld HELLO_WORLD = new HelloWorld();

    /**
     * The table <code>hello_world.fortune</code>.
     */
    public final Fortune FORTUNE = models.tables.Fortune.FORTUNE;

    /**
     * The table <code>hello_world.world</code>.
     */
    public final World WORLD = models.tables.World.WORLD;

    /**
     * No further instances allowed
     */
    private HelloWorld() {
        super("hello_world", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Fortune.FORTUNE,
            World.WORLD);
    }
}