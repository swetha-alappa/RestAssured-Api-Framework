package User;

import com.protos.CreateUserRequest;
import com.protos.CreateUserResponse;

import java.io.IOException;

public class UserFactory {

    private static final UserFactory instance = new UserFactory();

    private UserFactory(){}
    public static UserFactory getInstance() {
        return instance;
    }

    UserHelper userHelper = new UserHelper();

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) throws IOException {
        return userHelper.createUser(createUserRequest);
    }
}
