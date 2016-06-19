package awslambdapkg;

/**
 * Created by townsley on 6/19/16.
 */
import com.amazonaws.services.lambda.runtime.Context;

public class awslambda {
    public String myHandler(int myCount) {
        System.out.println("received : " + myCount);
        return String.valueOf(myCount);
    }
}

