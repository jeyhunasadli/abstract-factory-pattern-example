package org.example.bank_transfer_factory;

import org.example.bank_transfers.BankTransfer;
import org.example.bank_transfers.local.LocalBankTransfer1;
import org.example.bank_transfers.local.LocalBankTransfer2;
import org.example.constants.BankTransferTypes;

class LocalBankTransferFactory extends BankTransferAbstractFactory {

    @Override
    public BankTransfer create(BankTransferTypes type) {
        switch (type) {
            case LOCAL1: return new LocalBankTransfer1();
            case LOCAL2: return new LocalBankTransfer2();
            default: return null;
        }
    }
}
