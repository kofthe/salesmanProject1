package kofthe.salesmanProject.service.concretes;

import kofthe.salesmanProject.model.Salesman;
import kofthe.salesmanProject.repository.SalesmanRepository;
import kofthe.salesmanProject.service.abstracts.SalesmanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class SalesmanManager implements SalesmanService {

    private final SalesmanRepository salesmanRepository;

    public SalesmanManager(SalesmanRepository salesmanRepository) {
        this.salesmanRepository = salesmanRepository;
    }

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        log.info("inside signup salesman", requestMap);
        if (validateSignUp(requestMap)) {

        }


        return null;
    }

    private boolean validateSignUp(Map<String, String> requestMap) {
        if (requestMap.containsKey("email") && requestMap.containsKey("password") && requestMap.containsKey("firsName")
        && requestMap.containsKey("lastName") && requestMap.containsKey("phoneNumber")) {
            return true;
        }
        return false;

    }

    private Salesman getSalesmanFromMap(Map<String, String> requestMap) {
        Salesman salesman = new Salesman();
        salesman.setEmail(requestMap.get("email"));
        salesman.setPassword(requestMap.get("password"));
        salesman.setFirsName(requestMap.get("firstName"));
        salesman.setLastName(requestMap.get("lastName"));
        salesman.setPhoneNumber(requestMap.get("phoneNumber"));
        return salesman;
    }

}
