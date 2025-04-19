/********************************************
*	DEVELOPER:	<name>
* COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient setterRecipient = new DACArecipient();
    setterRecipient.setSurname("Mendez");
    setterRecipient.setGivenName("Javier");
    setterRecipient.setUscisNumber("56-3-445");
    setterRecipient.setCountryOfOrigin("Venezuela");
    setterRecipient.setBirthday(2451564);
    setterRecipient.setValidFromDate(3956753);
    setterRecipient.setExpirationDate(3956840);
    setterRecipient.setSex('M');

    DACArecipient setAllRecipient = new DACArecipient();
    setAllRecipient.setAll("Doe", "John", "67-4-475", "Mexico", 2451553, 3956733, 3956820, 'M');

    //OUTPUT//
    System.out.println("Person 1:");
    System.out.println("------------------");
    System.out.println("Surname: " + setterRecipient.getSurname());
    System.out.println("Given Name: " + setterRecipient.getGivenName());
    System.out.println("USCIS Number: " + setterRecipient.getUscisNumber());
    System.out.println("Country of Origin: " + setterRecipient.getCountryOfOrigin());
    System.out.println("Birthday(JDN): " + setterRecipient.getBirthday());
    System.out.println("Valid From Date(JDN): " + setterRecipient.getValidFromDate());
    System.out.println("Expiration Date(JDN): " + setterRecipient.getExpirationDate());
    System.out.println("Sex: " + setterRecipient.getSex());

    System.out.println("\nPerson 2:");
    System.out.println("------------------");
    System.out.println("Surname: " + setAllRecipient.getSurname());
    System.out.println("Given Name: " + setAllRecipient.getGivenName());
    System.out.println("USCIS Number: " + setAllRecipient.getUscisNumber());
    System.out.println("Country of Origin: " + setAllRecipient.getCountryOfOrigin());
    System.out.println("Birthday(JDN): "+ setAllRecipient.getBirthday());
    System.out.println("Valid From Date(JDN): " + setAllRecipient.getValidFromDate());
    System.out.println("Expiration Date(JDN): " + setAllRecipient.getExpirationDate());
    System.out.println("Sex: " + setAllRecipient.getSex());
  
    
  }
}