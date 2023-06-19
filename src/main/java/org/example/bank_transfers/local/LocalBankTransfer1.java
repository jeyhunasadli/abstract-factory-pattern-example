package org.example.bank_transfers.local;

import org.example.bank_transfers.BankTransfer;
import org.example.constants.BankTransferTypes;

public class LocalBankTransfer1 extends BankTransfer {


    public LocalBankTransfer1() {
        super(BankTransferTypes.LOCAL1);
    }

    private void operation1() {
        log("operation");
    }

    @Override
    protected void transfer() {
        operation1();
    }
}
