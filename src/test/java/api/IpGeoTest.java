package api;

import api.pojo.Root;
import api.utils.ConfigManager;
import api.utils.SpecBuilder;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class IpGeoTest {

    private static final String URL = ConfigManager.getConfigManager().getString("api_host");

    @Test
    public void verify_status_code_is_200() {
        int statusCode = given(SpecBuilder.getRequestSpec(URL))
                .get().getStatusCode();
        Assertions.assertEquals(200, statusCode);
    }

    @Test
    public void parse_data() {
        SpecBuilder.installSpecification(SpecBuilder.getRequestSpec(URL), SpecBuilder.getResponseSpec(200));
        List<Root> ipData = given()
                .when()
                .get()
                .then()
                .log().all()
                .extract().jsonPath().getList("ipData", Root.class);
        assertThat(ipData).extracting(Root::getRegion_name).contains("data.Ternopil");
    }
}
