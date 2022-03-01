package uk.gov.hmcts.reform.controllers;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test endpoint
 */
@RestController
public class TestController {

    @ApiOperation(value = "Test api",
        notes = "This is a test endpoint",
        response = String.class
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "A test message"),
        @ApiResponse(code = 404, message = "No welcome could be found")
    })
    @RequestMapping(value = "/testing", method = GET, produces = TEXT_PLAIN_VALUE)
    public ResponseEntity<String> welcome() {
        return ok("Hello and welcome to the test");
    }
}
