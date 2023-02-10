package kofthe.salesmanProject.core.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSalesmanRequest {

    private String email;
    private String password;
    private String firsName;
    private String lastName;
    private String phoneNumber;

}
