package de.kj187.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ApiRequestHandler implements RequestHandler<String, String> {

    public String handleRequest(String request, Context context) {
        context.getLogger().log("Request is");
        context.getLogger().log(request);
        return "Your input as output: " + request;
    }

}
