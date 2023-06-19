package org.example.bank_transfers;

import org.example.constants.BankTransferTypes;

public abstract class BankTransfer {

    protected BankTransfer(BankTransferTypes type) {
        this.type = type;
    }

    protected abstract void transfer();

    protected final BankTransferTypes type;


    public void transferMoney() {
        transfer();
        log("transfer");
    }

    protected void log(String msg) {
        System.out.println("Type " + type + ": " + msg);
    }
}
