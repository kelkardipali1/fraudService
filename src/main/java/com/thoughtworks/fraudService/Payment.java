package com.thoughtworks.fraudService;

public class Payment {

    private int amount;
    private String beneficiaryName;
    private long beneficiaryAccountNumber;
    private String beneficiaryIfscCode;
    private String payeeName;
    private long payeeAccountNumber;
    private String payeeIfscCode;
    private String status;

    public Payment() {
    }

    public Payment(int amount, BankDetails beneficiary, BankDetails payee) {
        this.amount = amount;
        this.beneficiaryName = beneficiary.getName();
        this.beneficiaryAccountNumber = beneficiary.getAccountNumber();
        this.beneficiaryIfscCode = beneficiary.getIfscCode();
        this.payeeName = payee.getName();
        this.payeeAccountNumber = payee.getAccountNumber();
        this.payeeIfscCode = payee.getIfscCode();
        this.status = "success";

    }

    public int getAmount() {
        return amount;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public long getBeneficiaryAccountNumber() {
        return beneficiaryAccountNumber;
    }

    public String getBeneficiaryIfscCode() {
        return beneficiaryIfscCode;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public long getPayeeAccountNumber() {
        return payeeAccountNumber;
    }

    public String getPayeeIfscCode() {
        return payeeIfscCode;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", beneficiaryName='" + beneficiaryName + '\'' +
                ", beneficiaryAccountNumber=" + beneficiaryAccountNumber +
                ", beneficiaryIfscCode='" + beneficiaryIfscCode + '\'' +
                ", payeeName='" + payeeName + '\'' +
                ", payeeAccountNumber=" + payeeAccountNumber +
                ", payeeIfscCode='" + payeeIfscCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
