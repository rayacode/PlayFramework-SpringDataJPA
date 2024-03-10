package modules;

import com.google.inject.AbstractModule;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import play.libs.pekko.PekkoGuiceSupport;

public class SpringModule extends AbstractModule implements PekkoGuiceSupport {
    private static ApplicationContext ctx;

    static {
        ctx = new AnnotationConfigApplicationContext(PersistenceJPAConfig.class);
    }

    @Override
    protected void configure() {
        bind(ApplicationContext.class).toInstance(ctx);
        bind(PersistenceJPAConfig.class).asEagerSingleton();
    }
}