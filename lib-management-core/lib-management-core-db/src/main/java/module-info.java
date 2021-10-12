module lib.management.core.db {
    requires java.sql;
    requires lib.management.common;

    exports com.lib.management.core.db.service to lib.management.core.domain;
    exports com.lib.management.core.db.factory to lib.management.core.domain;
}