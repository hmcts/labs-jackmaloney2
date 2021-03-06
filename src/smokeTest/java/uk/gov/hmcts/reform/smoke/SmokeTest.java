package uk.gov.hmcts.reform.smoke;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

@RunWith(SpringRunner.class)
public class SmokeTest {
    @Value("${TEST_URL:http://localhost:8080}")
    private String testUrl;

    @Before
    public void setUp() {
        RestAssured.baseURI = testUrl;
    }

    @Test
    public void healthCheck() {
        given()
            .relaxedHTTPSValidation()
            .header(CONTENT_TYPE, "application/json")
            .when()
            .get("/health")
            .then()
            .statusCode(200)
            .body(
                "status",
                equalTo("UP"));
        assertFalse("passed",testUrl.isEmpty());
    }
}
