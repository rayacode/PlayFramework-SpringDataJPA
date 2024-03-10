package modules;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextLoader {

    private static ApplicationContext ctx;

    public static void initialize() {
        ctx = new AnnotationConfigApplicationContext(PersistenceJPAConfig.class);
    }

    public static void shutdown() {
        ((AnnotationConfigApplicationContext) ctx).close();
    }

    public static ApplicationContext getApplicationContext() {
        return ctx;
    }
}

