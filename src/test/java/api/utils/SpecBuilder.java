package api.utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {

    private static final String key = ConfigManager.getConfigManager().getString("api_key");
    private static final String param = ConfigManager.getConfigManager().getString("param");

    public static RequestSpecification getRequestSpec(String url){
        return new RequestSpecBuilder().setBaseUri(url)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build()
                .queryParam(param, key);
    }

    public static ResponseSpecification getResponseSpec(int status){
        return new ResponseSpecBuilder()
                .expectStatusCode(status)
                .build();
    }

    public static void installSpecification(RequestSpecification getRequestSpec, ResponseSpecification getResponseSpec){
        RestAssured.requestSpecification = getRequestSpec;
        RestAssured.responseSpecification = getResponseSpec;
    }

    public static void installSpecification(RequestSpecification getRequestSpec){
        RestAssured.requestSpecification = getRequestSpec;
    }
    public static void installSpecification(ResponseSpecification getResponseSpec){
        RestAssured.responseSpecification = getResponseSpec;
    }
}
