package org.example.bank_transfer_factory;

import org.example.bank_transfers.BankTransfer;
import org.example.bank_transfers.international.InternationalBankTransfer1;
import org.example.constants.BankTransferTypes;

class InternationalBankTransferFactory extends BankTransferAbstractFactory {

    @Override
    public BankTransfer create(BankTransferTypes type) {
        switch (type) {
            case INTERNATIONAL1: return new InternationalBankTransfer1();
            default: return null;
        }
    }
}
