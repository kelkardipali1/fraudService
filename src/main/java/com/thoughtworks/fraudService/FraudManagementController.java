package com.thoughtworks.fraudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkFraud")
public class FraudManagementController {
    @Autowired
    FraudManagementService fraudManagementService;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    void checkFraud(@RequestBody Payment payment) throws FraudHappenedException {
        fraudManagementService.checkFraud(payment);
    }
}
