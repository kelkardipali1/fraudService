package com.thoughtworks.fraudService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkFraud")
public class FraudManagementController {
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    void checkFraud(@RequestBody Object payment) {

    }
}
