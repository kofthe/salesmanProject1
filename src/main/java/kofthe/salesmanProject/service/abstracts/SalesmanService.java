package kofthe.salesmanProject.service.abstracts;

import kofthe.salesmanProject.model.Salesman;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface SalesmanService {

    ResponseEntity<String> signUp(Map<String, String> requestMap);

}
