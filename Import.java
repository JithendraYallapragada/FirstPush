
import bank.*;

class Import{
	public static void main(String[] args){

		Account a=new Account();
		Account.Debit ba=a.new Debit();
		ba.accountNumber=123;
		ba.holderName="jithendra";
		ba.transAmount=1000;

		ba.printAccNum();


	}
}