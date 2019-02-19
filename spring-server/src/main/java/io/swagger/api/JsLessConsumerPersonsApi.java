/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import org.threeten.bp.LocalDate;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-14T13:12:07.606Z")

@Api(value = "js-less-consumer-persons", description = "the js-less-consumer-persons API")
public interface JsLessConsumerPersonsApi {

    @ApiOperation(value = "Creates a person", nickname = "jsLessConsumerPersonsPost", notes = "For JS-less partners", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Person succesfully created."),
        @ApiResponse(code = 400, message = "Person couldn't have been created."),
        @ApiResponse(code = 500, message = "An error occured."),
        @ApiResponse(code = 200, message = "A totally unexpected response") })
    @RequestMapping(value = "/js-less-consumer-persons",
        produces = { "text/html" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> jsLessConsumerPersonsPost(@ApiParam(value = "" ,required=true) @RequestHeader(value="User-Agent", required=true) String userAgent,@ApiParam(value = "", required=true) @RequestParam(value="username", required=true)  String username,@ApiParam(value = "") @RequestParam(value="firstname", required=false)  String firstname,@ApiParam(value = "") @RequestParam(value="lastname", required=false)  String lastname,@ApiParam(value = "") @RequestParam(value="dateOfBirth", required=false)  LocalDate dateOfBirth);

}