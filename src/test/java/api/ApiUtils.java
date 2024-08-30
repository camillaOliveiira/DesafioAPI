package api;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class ApiUtils  {
    protected Response response;
    protected String url;
    protected Map<String, String> headers = new HashMap<>();
    protected Map<String, String> params = new HashMap<>();
    protected Map<String, String> queryParams = new HashMap<>();

}
