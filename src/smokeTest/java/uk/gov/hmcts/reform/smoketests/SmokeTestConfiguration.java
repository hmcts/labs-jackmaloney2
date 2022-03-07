package uk.gov.hmcts.reform.smoketests;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@RunWith(SpringRunner.class)
@Slf4j
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
                equalTo("UP")
            );
        assertFalse("passed", testUrl.isEmpty());
    }
}
