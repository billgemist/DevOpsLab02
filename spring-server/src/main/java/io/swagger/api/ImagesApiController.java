package io.swagger.api;

import io.swagger.model.ERRORUNKNOWN;
import io.swagger.model.Error;
import org.springframework.core.io.Resource;
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
public class ImagesApiController implements ImagesApi {

    private static final Logger log = LoggerFactory.getLogger(ImagesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ImagesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> imagesImageIdGet(@ApiParam(value = "" ,required=true) @RequestHeader(value="User-Agent", required=true) String userAgent,@ApiParam(value = "",required=true) @PathVariable("imageId") String imageId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ERRORUNKNOWN> imagesPost(@ApiParam(value = "" ,required=true) @RequestHeader(value="User-Agent", required=true) String userAgent,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile image) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ERRORUNKNOWN>(objectMapper.readValue("\"\"", ERRORUNKNOWN.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ERRORUNKNOWN>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ERRORUNKNOWN>(HttpStatus.NOT_IMPLEMENTED);
    }

}
