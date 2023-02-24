package ClassesandObjects;

public class AccountHolderObjects {
	
	public static void main(String[] args) {
		
	
	AccountHolder tom = new AccountHolder();
	AccountHolder henry = new AccountHolder();
	AccountHolder sarah = new AccountHolder();
	
	tom.firstName= "Tom";
	tom.lastName = "Smith";
	tom.age = 21;
	tom.accountBalance = 10000;
	tom.testEligibilityForCreditCard();
	System.out.println("Is Tom eligible for CC: " +tom.eligibilityForCreditCard);

	henry.firstName= "Henry";
	henry.lastName = "Hill";
	henry.age = 30;
	henry.accountBalance = 20000;
	henry.testEligibilityForCreditCard();
	System.out.println("Is Henry eligible for CC: " +henry.eligibilityForCreditCard);

	sarah.firstName= "Sarah";
	sarah.lastName = "Bill";
	sarah.age = 35;
	sarah.accountBalance = 30000;
	sarah.testEligibilityForCreditCard();
	System.out.println("Is Sarah eligible for CC: " +sarah.eligibilityForCreditCard);

	}
}
