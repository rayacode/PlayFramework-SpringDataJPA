package controllers;



import com.google.inject.Inject;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import play.mvc.*;
import repositories.UserRepository;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Autowired
    UserRepository repository;
    @Inject
    public HomeController(ApplicationContext ctx) {
        this.repository = ctx.getBean(UserRepository.class);
    }
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        repository.save(new User());
        return ok(views.html.index.render());
    }

}
