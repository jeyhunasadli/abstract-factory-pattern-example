package org.example;

import org.example.bank_transfer_factory.BankFactoryProvider;
import org.example.constants.BankTransferFactoryTypes;
import org.example.constants.BankTransferTypes;

public class Main {
    public static void main(String[] args) {

        //get factories
        var localBankTransfer = BankFactoryProvider.getFactory(BankTransferFactoryTypes.LOCAL);
        var internationalBankTransfer = BankFactoryProvider.getFactory(BankTransferFactoryTypes.INTERNATIONAL);

        //get transfers
        var localBankTransfer1 = localBankTransfer.create(BankTransferTypes.LOCAL1);
        var localBankTransfer2 = localBankTransfer.create(BankTransferTypes.LOCAL2);
        var internationalBankTransfer1 = internationalBankTransfer.create(BankTransferTypes.INTERNATIONAL1);


        localBankTransfer1.transferMoney();
        localBankTransfer2.transferMoney();
        internationalBankTransfer1.transferMoney();
    }
}