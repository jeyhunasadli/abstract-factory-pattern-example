package org.example.bank_transfer_factory;

import org.example.constants.BankTransferFactoryTypes;

public class BankFactoryProvider {

    public static BankTransferAbstractFactory getFactory(BankTransferFactoryTypes type) {
        return switch (type) {
            case LOCAL -> new LocalBankTransferFactory();
            case INTERNATIONAL -> new InternationalBankTransferFactory();
        };
    }
}
