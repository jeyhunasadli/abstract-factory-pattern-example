package org.example.bank_transfer_factory;

import org.example.bank_transfers.BankTransfer;
import org.example.constants.BankTransferTypes;

public abstract class BankTransferAbstractFactory {
    public abstract BankTransfer create(BankTransferTypes type);
}
