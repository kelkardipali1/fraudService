package com.thoughtworks.fraudService;

import org.springframework.stereotype.Service;

@Service
public class FraudManagementService {
    void checkFraud(Payment payment) throws FraudHappenedException {
        if (payment.getBeneficiaryAccountNumber() == payment.getPayeeAccountNumber()) {
            throw new FraudHappenedException();
        }
    }

}
