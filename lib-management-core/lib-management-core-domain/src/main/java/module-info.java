module lib.management.core.domain {
    requires lib.management.common;
    requires lib.management.core.db;
    requires java.sql;

    exports com.lib.management.domain.factory to com.lib.management.ui;
    exports com.lib.management.domain.service to com.lib.management.ui;
}