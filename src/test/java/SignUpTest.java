import base.BaseTest;
import org.testng.annotations.Test;
import task.tasking.SingUp;

public class SignUpTest extends BaseTest {

    @Test
    public void authentication() {
        SingUp.as(webDriver, "Juan Olivera", "asdf1234", "juan+1@genso.com.bo");
    }

}
