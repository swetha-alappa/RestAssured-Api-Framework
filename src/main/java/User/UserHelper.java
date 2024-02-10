package User;

import com.google.protobuf.InvalidProtocolBufferException;
import com.protos.CreateUserRequest;
import com.protos.CreateUserResponse;
import io.restassured.http.Method;
import utils.HttpRequestUtils;
import com.google.protobuf.util.JsonFormat;

import java.io.IOException;

public class UserHelper {

    HttpRequestUtils httpRequestUtil = new HttpRequestUtils();

   CreateUserResponse createUser(CreateUserRequest createUserRequest) throws IOException {
       String request = JsonFormat.printer().print(createUserRequest);
       String responseString = HttpRequestUtils.makeRequest(ServiceName.USER_SERVICE.value+UserEndpoints.CREATE_USER, Method.POST,request);
       System.out.println(" response "+ responseString);
       CreateUserResponse.Builder createUserResponse = CreateUserResponse.newBuilder();
       JsonFormat.parser().ignoringUnknownFields().merge(responseString, createUserResponse);
       return  createUserResponse.build();
   }
}
