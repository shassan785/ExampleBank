package ClassesandObjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibilityForCreditCard;

	private void testEligibilityForCreditCard() {
		if(age>25 && accountBalance>=20000) {
			eligibilityForCreditCard=true;
		}
		

	}
	
}
