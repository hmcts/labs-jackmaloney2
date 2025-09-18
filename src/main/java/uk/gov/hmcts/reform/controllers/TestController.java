package uk.gov.hmcts.reform.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Test endpoint.
 */
@RestController
public class TestController {

    @Operation(summary = "Test api",
        description = "This is a test endpoint updated"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "A test message updated"),
        @ApiResponse(responseCode = "404", description = "No welcome could be found")
    })
    @RequestMapping(value = "/testing", method = GET, produces = TEXT_PLAIN_VALUE)
    public ResponseEntity<String> welcome() {
        return ok("Hello and welcome to the test");
    }

    @Operation(summary = "Another api updated",
        description = "This is another endpoint updated"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Another message"),
        @ApiResponse(responseCode = "404", description = "No another could be found")
    })
    @RequestMapping(value = "/another", method = GET, produces = TEXT_PLAIN_VALUE)
    public ResponseEntity<String> another() {
        return ok("Hello and welcome to another test");
    }

    @Operation(summary = "This is a test for Demo purposes",
        description = "This is another endpoint updated"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Demo endpoint"),
        @ApiResponse(responseCode = "404", description = "No another could be found")
    })
    @RequestMapping(value = "/demo", method = GET, produces = TEXT_PLAIN_VALUE)
    public ResponseEntity<String> demoTest() {
        return ok("Hello and welcome to a demo");
    }
}
