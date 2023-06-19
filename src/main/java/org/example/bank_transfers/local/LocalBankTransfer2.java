package org.example.bank_transfers.local;

import org.example.bank_transfers.BankTransfer;
import org.example.constants.BankTransferTypes;

public class LocalBankTransfer2 extends BankTransfer {


    public LocalBankTransfer2() {
        super(BankTransferTypes.LOCAL2);
    }

    private void operation2() {
        log("operation");
    }

    @Override
    protected void transfer() {
        operation2();
    }
}
