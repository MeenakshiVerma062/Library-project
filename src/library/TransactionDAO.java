package library;

import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {
    private List<Transaction> transactions = new ArrayList<>();
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }
    public List<Transaction> getTransactionsByMemberId(int memberId){
        List<Transaction> memberTransactions = new ArrayList<>();
        for(Transaction transaction : transactions){
            if(transaction.getMemberId() == memberId){
                memberTransactions.add(transaction);
            }
        }
        return memberTransactions;
    }
    public List<Transaction> getAllTransactions(){
        return transactions;
    }
}
