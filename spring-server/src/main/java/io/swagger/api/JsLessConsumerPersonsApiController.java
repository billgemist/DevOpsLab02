package io.swagger.api;

import org.threeten.bp.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-14T13:12:07.606Z")

@Controller
public class JsLessConsumerPersonsApiController implements JsLessConsumerPersonsApi {

    private static final Logger log = LoggerFactory.getLogger(JsLessConsumerPersonsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public JsLessConsumerPersonsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> jsLessConsumerPersonsPost(@ApiParam(value = "" ,required=true) @RequestHeader(value="User-Agent", required=true) String userAgent,@ApiParam(value = "", required=true) @RequestParam(value="username", required=true)  String username,@ApiParam(value = "") @RequestParam(value="firstname", required=false)  String firstname,@ApiParam(value = "") @RequestParam(value="lastname", required=false)  String lastname,@ApiParam(value = "") @RequestParam(value="dateOfBirth", required=false)  LocalDate dateOfBirth) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
