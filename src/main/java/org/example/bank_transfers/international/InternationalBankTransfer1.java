package org.example.bank_transfers.international;

import org.example.bank_transfers.BankTransfer;
import org.example.constants.BankTransferTypes;

public class InternationalBankTransfer1 extends BankTransfer {


    public InternationalBankTransfer1() {
        super(BankTransferTypes.INTERNATIONAL1);
    }

    private void doB1() {
        log("do1");
    }

    private void doB2() {
        log("do2");
    }

    @Override
    protected void transfer() {
        doB1();
        doB2();
    }
}
