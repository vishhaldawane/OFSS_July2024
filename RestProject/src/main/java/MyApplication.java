
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
// http://localhost:8080/RestProject/resources
@ApplicationPath("resources")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("com.oracle");
        System.out.println("MyApplication ctor..");
    }
}
