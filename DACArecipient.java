/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
DACArecipient
-----------------------------------------
- surname: String
- givenName: String
- uscisNumber: String
- countryOfOrigin: String
- birthday: int
- validFromDate: int
- expirationDate: int
- Sex: char
-----------------------------------------
+ getSurname(): String
+ getGivenName(): String
+ getUscisNumber(): String
+ getCountryOfOrigin(): String
+ getBirthday(): int
+ getValidFromDate(): int
+ getExpirationDate(): int
+ getSex(): char

+ setSurname(newSurname: String): void
+ setAll(newSurname: String, newGiven: String, newUscis: String, newCountry: String, newBirthday: int, newValid: int, newExpiration: int, newSex: char): void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	String surname;
	String givenName;
	String uscisNumber;
	String countryOfOrigin;
	int birthday;
	int validFromDate;
	int expirationDate;
	char sex;

	/***** ACCESSORS *****/
	/**
	 * Returns the surname of the DACA recipient.
	 * @return the surname of the DACA recipient.
	 */
	public String getSurname()
	{
		return surname;
	}

	/**
	 * Returns the given name of the DACA recipient.
	 * @return the given name of the DACA recipient.
	 */
	public String getGivenName()
	{
		return givenName;
	}

	/**
	 * Returns the USCIS number of the DACA recipient.
	 * @return the USCIS number of the DACA recipient.
	 */
	public String getUscisNumber()
	{
		return uscisNumber;
	}

	/**
	 * Returns the country of origin of the DACA recipient.
	 * @return the country of origin of the DACA recipient.
	 */
	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	/**
	 * Returns the birthday of the DACA recipient.
	 * @return the birthday of the DACA recipient.
	 */
	public int getBirthday()
	{
		return birthday;
	}

	/**
	 * Returns the valid from date of the DACA recipient.
	 * @return the valid from date of the DACA recipient.
	 */
	public int getValidFromDate()
	{
		return validFromDate;
	}

	/**
	 * Returns the expiration date of the DACA recipient.
	 * @return the expiration date of the DACA recipient.
	 */
	public int getExpirationDate()
	{
		return expirationDate;
	}

	/**
	 * Returns the sex of the DACA recipient.
	 * @return the sex of the DACA recipient.
	 */
	public char getSex()
	{
		return sex;
	}
	
	/***** MUTATORS *****/
	/**
	 * Sets the surname of the DACA recipient.
	 * @param surname the new surname of the DACA recipient.
	 */
	public void setSurname(String newSurname)
	{
		surname = newSurname;
	}

	/**
	 * Sets the given name of the DACA recipient.
	 * @param givenName the new given name of the DACA recipient.
	 */
	public void setGivenName(String newGivenName)
	{
		givenName = newGivenName;
	}

	/**
	 * Sets the USCIS number of the DACA recipient.
	 * @param uscisNumber the new USCIS number of the DACA recipient.
	 */
	public void setUscisNumber(String newUscisNumber)
	{
		uscisNumber = newUscisNumber;
	}

	/**
	 * Sets the country of origin of the DACA recipient.
	 * @param countryOfOrigin the new country of origin of the DACA recipient.
	 */
	public void setCountryOfOrigin(String newCountryOfOrigin)
	{
		countryOfOrigin = newCountryOfOrigin;
	}

	/**
	 * Sets the birthday of the DACA recipient.
	 * @param birthday the new birthday of the DACA recipient.
	 */
	public void setBirthday(int newBirthday)
	{
		birthday = newBirthday;
	}

	/**
	 * Sets the valid from date of the DACA recipient.
	 * @param validFromDate the new valid from date of the DACA recipient.
	 */
	public void setValidFromDate(int newValidFromDate)
	{
		validFromDate = newValidFromDate;
	}

	/**
	 * Sets the expiration date of the DACA recipient.
	 * @param expirationDate the new expiration date of the DACA recipient.
	 */
	public void setExpirationDate(int newExpirationDate)
	{
		expirationDate = newExpirationDate;
	}

	/**
	 * Sets the sex of the DACA recipient
	 * @param newSex
	 */
	public void setSex(char newSex)
	{
		sex = newSex;
	}

	/**
	 * Sets all attributes of the DACA recipient.
	 * @param newSurname the new surname of the DACA recipient.
	 * @param newGiven the new given name of the DACA recipient.
	 * @param newUscis the new USCIS number of the DACA recipient.
	 * @param newCountry the new country of origin of the DACA recipient.
	 * @param newBirthday the new birthday of the DACA recipient.
	 * @param newValid the new valid from date of the DACA recipient.
	 * @param newExpiration the new expiration date of the DACA recipient.
	 * @param newSex the new sex of the DACA recipient.
	 */

	public void setAll(String newSurname, String newGiven, String newUscis, String newCountry, int newBirthday, int newValid, int newExpiration, char newSex)
	{
		surname = newSurname;
		givenName = newGiven;
		uscisNumber = newUscis;
		countryOfOrigin = newCountry;
		birthday = newBirthday;
		validFromDate = newValid;
		expirationDate = newExpiration;
		sex = newSex;
	}
}