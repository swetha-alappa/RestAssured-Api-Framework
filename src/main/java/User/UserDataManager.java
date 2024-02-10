package User;

import com.protos.CreateUserRequest;

public class UserDataManager {
    private static final UserDataManager instance = new UserDataManager();

    // private constructor to avoid client applications using the constructor
    private UserDataManager(){}

    public static UserDataManager getInstance() {
        return instance;
    }

    private UserEntity entity = new UserEntity();

    public CreateUserRequest createUserRequest(String name, String job){
        return entity.createUserRequest(name,job);
    }
}
