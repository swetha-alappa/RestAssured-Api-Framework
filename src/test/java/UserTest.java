import User.Constants;
import User.UserDataManager;
import User.UserFactory;
import com.protos.CreateUserRequest;
import com.protos.CreateUserResponse;
import org.testng.annotations.Test;
import java.io.IOException;

public class UserTest {

    private final UserDataManager userDataManager = UserDataManager.getInstance();
    private final UserFactory userFactory = UserFactory.getInstance();



    @Test(groups = "smoke")
    public void verifyUserCreation() throws IOException {
        CreateUserRequest createUserRequest = userDataManager.createUserRequest(Constants.USER_NAME,Constants.JOB);
        CreateUserResponse createUserResponse = userFactory.createUser(createUserRequest);
    }
}
