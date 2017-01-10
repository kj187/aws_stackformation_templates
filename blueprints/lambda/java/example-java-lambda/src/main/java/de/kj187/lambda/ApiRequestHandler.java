package de.kj187.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ApiRequestHandler implements RequestHandler<String, String> {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Request is: " + input);
        context.getLogger().log("EnvironmentName is: " + System.getenv("EnvironmentName"));
        return "Your input as output: " + input + "\nEnvVar: " + System.getenv("EnvironmentName");
    }
}
