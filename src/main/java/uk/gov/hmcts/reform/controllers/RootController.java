package uk.gov.hmcts.reform.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Default endpoints per application.
 */
@RestController
public class RootController {

    @ApiOperation(value = "Get welcome api",
        notes = "This is a welcome endpoint",
        response = String.class
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "A welcome message"),
        @ApiResponse(code = 404, message = "No welcome could be found")
    })
    @RequestMapping(value = "/", method = GET, produces = TEXT_PLAIN_VALUE)
    public ResponseEntity<String> welcome() {
        return ok("Welcome to jack-lab-test2-jackmaloney application");
    }
}
