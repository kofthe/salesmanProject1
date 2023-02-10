package kofthe.salesmanProject.core.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SalesmanUtils {

    public SalesmanUtils() {
    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus) {
        return new ResponseEntity<String>("{\"message\" : \""+responseMessage+"\"}", httpStatus);
    }
}
