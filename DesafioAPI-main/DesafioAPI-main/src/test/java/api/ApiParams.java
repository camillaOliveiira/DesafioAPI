package api;

import java.util.HashMap;
import java.util.Map;

public class ApiParams {

        Map<String, String> queryParams = new HashMap<>();


    public Map<String, String> queryParams(String categoria, int quantidade) {
        queryParams.clear();
        queryParams.put("name", categoria);
        queryParams.put("quantityPerEachCategory", String.valueOf(quantidade));
        return queryParams;
    }
}
