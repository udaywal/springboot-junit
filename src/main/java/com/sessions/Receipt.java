package com.sessions;

import java.time.LocalDate;

public class Receipt {

    LocalDate receipDate;
    String bookName;
    Double amountGiven;
    Double actualAmount;
    Double balanceToBeReturned;

    Receipt (Book book, Double amount) {
        this.receipDate = LocalDate.now();
        this.bookName = book.getName();
        this.amountGiven = amount;
        this.actualAmount = book.getPrice();
        this.balanceToBeReturned = amount - book.getPrice();
    }
    
}
