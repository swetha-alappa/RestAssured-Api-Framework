package User;

import com.protos.CreateUserRequest;

public class UserEntity {

    CreateUserRequest createUserRequest(String name, String job){
        return CreateUserRequest.newBuilder().setName(name).setJob(job).build();
    }
}
