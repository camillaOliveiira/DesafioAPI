package api;

import static io.restassured.RestAssured.given;

public class ApiRequest extends ApiUtils implements ApiVerbos {


    /*
     relaxedHTTPSValidation() permite fazer a request mesmo não
     tendo o certificado da API instalado na máquina
     */

    @Override
    public void GET() {
        response = given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .get(url);

    }


}
