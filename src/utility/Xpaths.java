package utility;

public class Xpaths {
	// Xpaths for HomePage
	private static final String WOMEN_DROPPING_MENU = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	private static final String WM_DM_SUMMER_DRESSES = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
	private static final String DRESSES_DROPPING_MENU = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
	private static final String SUMMER_DRESSES_DRESSES_DM = "//li[@class='sfHover']//ul[@class='submenu-container clearfix first-in-line-xs']//li//a[contains(text(),'Summer Dresses')]";
	// Xpaths for SummerDressesPage
	private static final String FIRST_DRESS = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//img[@class='replace-2x img-responsive']";
	private static final String QUANTITY = "//input[@id='quantity_wanted']";
	private static final String SIZE_DROPPING_MENU = "//select[@id='group_1']";
	private static final String SIZE_DROPPING_MENU_SIZE_M = "//option[contains(text(),'M')]";
	private static final String COLOR_PICKER_BLUE = "//a[@id='color_14']";
	private static final String ADD_TO_CART = "//button[@name='Submit']";
	private static final String CONTINUE_SHOPPING = "//span[@class='continue btn btn-default button exclusive-medium']//span[1]";
	private static final String CART = "//body[@id='product']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@class='col-sm-4 clearfix']/div[@class='shopping_cart']/a[1]";
	private static final String CHECKOUT = "//span[contains(text(),'Check out')]";
	private static final String DRESS_IN_CART = "//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]";
	private static final String DRESS_CART_QUANTITY = "//input[@name='quantity_5_24_0_0']";
	// Xpaths for RegistrationPage
	private static final String BLANK = "//div[@class='form-group form-ok']";
	private static final String PROCEED = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
	private static final String CREATE_AN_ACCOUNT = "//form[@id='create-account_form']//span[1]";
	private static final String EMAIL = "//input[@id='email_create']";
	private static final String MR = "//input[@id='id_gender1']";
	private static final String MRS = "//input[@id='id_gender2']";
	private static final String FIRST_NAME = "//input[@id='customer_firstname']";
	private static final String LAST_NAME = "//input[@id='customer_lastname']";
	private static final String PASSWORD = "//input[@id='passwd']";
	private static final String DATE_BIRTH_DAYS = "//select[@id='days']";
	private static final String DATE_B_DAYS_4 = "//div[@id='uniform-days']//option[4]";
	private static final String DATE_BIRTH_MONTHS = "//select[@id='months']";
	private static final String DATE_B_MONTHS_1 = "//option[contains(text(),'January')]";
	private static final String DATE_B_MONTHS_2 = "//option[contains(text(),'February')]";
	private static final String DATE_B_MONTHS_3 = "//option[contains(text(),'March')]";
	private static final String DATE_B_MONTHS_4 = "//option[contains(text(),'April')]";
	private static final String DATE_B_MONTHS_5 = "//option[contains(text(),'May')]";
	private static final String DATE_B_MONTHS_6 = "//option[contains(text(),'June')]";
	private static final String DATE_B_MONTHS_7 = "//option[contains(text(),'July')]";
	private static final String DATE_B_MONTHS_8 = "//option[contains(text(),'August')]";
	private static final String DATE_B_MONTHS_9 = "//option[contains(text(),'September')]";
	private static final String DATE_B_MONTHS_10 = "//option[contains(text(),'October')]";
	private static final String DATE_B_MONTHS_11 = "//option[contains(text(),'November')]";
	private static final String DATE_B_MONTHS_12 = "//option[contains(text(),'December')]";
	private static final String DATE_BIRTH_YEAR = "//select[@id='years']";
	private static final String DATE_B_YEAR_1990 = "//option[contains(text(),'1990')]";
	private static final String SPECIAL_OFFER = "//input[@id='optin']";
	private static final String NEWSLETTER = "//input[@id='newsletter']";
	private static final String COMPANY = "//input[@id='company']";
	private static final String ADDRESS = "//input[@id='address1']";
	private static final String ADDRESS_2 = "//input[@id='address2']";
	private static final String CITY = "//input[@id='city']";
	private static final String STATE_MENU = "//select[@id='id_state']";
	private static final String STATE_INDIANA = "//option[contains(text(),'Indiana')]";
	private static final String POSTAL_CODE = "//input[@id='postcode']";
	private static final String ADDITIONAL_INFO = "//textarea[@id='other']";
	private static final String HOME_PHONE = "//input[@id='phone']";
	private static final String MOBILE_PHONE = "//input[@id='phone_mobile']";
	private static final String REGISTER_BUTTON = "//span[contains(text(),'Register')]";
	// Xpaths for Signout buttons
	private static final String NEW_ACCOUNT = "//a[@class='account']";
	private static final String SIGN_OUT_BUTTON = "//a[@class='logout']";
	// Xpaths for Signin buttonS
	private static final String SIGN_IN = "//a[@class='login']";
	private static final String SIGN_IN_EMAIL = "//input[@id='email']";
	private static final String SIGN_IN_PASSWORD = "//input[@id='passwd']";
	private static final String SIGN_IN_BUTTON = "//p[@class='submit']//span[1]";
	// Xpaths for DataPage
	private static final String GN_NAME = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/p[1]/b[1]";
	private static final String GN_EMAIL = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[2]/div[2]/input[1]";
	private static final String GN_PASSWORD = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[9]/div[4]/p[1]";
	private static final String GN_DATE_OF_BIRTH = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/p[3]/b[1]";
	private static final String GN_GENDER = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/p[1]/b[1]";
	private static final String GN_ADDRESS1 = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/p[4]/b[1]";
	private static final String GN_ADDRESS2 = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/p[4]/b[1]";
	private static final String GN_CITY = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/p[5]/b[1]";
	private static final String GN_PHONE = "/html[1]/body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/p[6]/b[1]";
	private static final String NEXT_PROFILE = "//input[@id='generate']";

	public static String getWomenDroppingMenu() {
		return WOMEN_DROPPING_MENU;
	}

	public static String getWmDmSummerDresses() {
		return WM_DM_SUMMER_DRESSES;
	}

	public static String getDressesDroppingMenu() {
		return DRESSES_DROPPING_MENU;
	}

	public static String getSummerDressesDressesDm() {
		return SUMMER_DRESSES_DRESSES_DM;
	}

	public static String getFirstDress() {
		return FIRST_DRESS;
	}

	public static String getQuantity() {
		return QUANTITY;
	}

	public static String getSizeDroppingMenu() {
		return SIZE_DROPPING_MENU;
	}

	public static String getSizeDroppingMenuSizeM() {
		return SIZE_DROPPING_MENU_SIZE_M;
	}

	public static String getColorPickerBlue() {
		return COLOR_PICKER_BLUE;
	}

	public static String getAddToCart() {
		return ADD_TO_CART;
	}

	public static String getContinueShopping() {
		return CONTINUE_SHOPPING;
	}

	public static String getCart() {
		return CART;
	}

	public static String getCheckout() {
		return CHECKOUT;
	}

	public static String getProceed() {
		return PROCEED;
	}

	public static String getCreateAnAccount() {
		return CREATE_AN_ACCOUNT;
	}

	public static String getEmail() {
		return EMAIL;
	}

	public static String getMr() {
		return MR;
	}

	public static String getMrs() {
		return MRS;
	}

	public static String getFirstName() {
		return FIRST_NAME;
	}

	public static String getLastName() {
		return LAST_NAME;
	}

	public static String getPassword() {
		return PASSWORD;
	}

	public static String getDateBirthDays() {
		return DATE_BIRTH_DAYS;
	}

	public static String getDateBDays4() {
		return DATE_B_DAYS_4;
	}

	public static String getDateBirthMonths() {
		return DATE_BIRTH_MONTHS;
	}

	public static String getDateBMonths3() {
		return DATE_B_MONTHS_3;
	}

	public static String getDateBirthYear() {
		return DATE_BIRTH_YEAR;
	}

	public static String getDateBYear1990() {
		return DATE_B_YEAR_1990;
	}

	public static String getSpecialOffer() {
		return SPECIAL_OFFER;
	}

	public static String getNewsletter() {
		return NEWSLETTER;
	}

	public static String getCompany() {
		return COMPANY;
	}

	public static String getAddress() {
		return ADDRESS;
	}

	public static String getAddress2() {
		return ADDRESS_2;
	}

	public static String getCity() {
		return CITY;
	}

	public static String getStateMenu() {
		return STATE_MENU;
	}

	public static String getStateIndiana() {
		return STATE_INDIANA;
	}

	public static String getPostalCode() {
		return POSTAL_CODE;
	}

	public static String getAdditionalInfo() {
		return ADDITIONAL_INFO;
	}

	public static String getHomePhone() {
		return HOME_PHONE;
	}

	public static String getMobilePhone() {
		return MOBILE_PHONE;
	}

	public static String getRegisterButton() {
		return REGISTER_BUTTON;
	}

	public static String getDressInCart() {
		return DRESS_IN_CART;
	}

	public static String getDressCartQuantity() {
		return DRESS_CART_QUANTITY;
	}

	public static String getBlank() {
		return BLANK;
	}

	public static String getNewAccount() {
		return NEW_ACCOUNT;
	}

	public static String getGnName() {
		return GN_NAME;
	}

	public static String getGnEmail() {
		return GN_EMAIL;
	}

	public static String getGnPassword() {
		return GN_PASSWORD;
	}

	public static String getGnDateOfBirth() {
		return GN_DATE_OF_BIRTH;
	}

	public static String getGnGender() {
		return GN_GENDER;
	}

	public static String getGnAddress1() {
		return GN_ADDRESS1;
	}

	public static String getGnAddress2() {
		return GN_ADDRESS2;
	}

	public static String getGnCity() {
		return GN_CITY;
	}

	public static String getGnPhone() {
		return GN_PHONE;
	}

	public static String getNextProfile() {
		return NEXT_PROFILE;
	}

	public static String getDateBMonths1() {
		return DATE_B_MONTHS_1;
	}

	public static String getDateBMonths2() {
		return DATE_B_MONTHS_2;
	}

	public static String getDateBMonths4() {
		return DATE_B_MONTHS_4;
	}

	public static String getDateBMonths5() {
		return DATE_B_MONTHS_5;
	}

	public static String getDateBMonths6() {
		return DATE_B_MONTHS_6;
	}

	public static String getDateBMonths7() {
		return DATE_B_MONTHS_7;
	}

	public static String getDateBMonths8() {
		return DATE_B_MONTHS_8;
	}

	public static String getDateBMonths9() {
		return DATE_B_MONTHS_9;
	}

	public static String getDateBMonths10() {
		return DATE_B_MONTHS_10;
	}

	public static String getDateBMonths11() {
		return DATE_B_MONTHS_11;
	}

	public static String getDateBMonths12() {
		return DATE_B_MONTHS_12;
	}

	public static String getSignIn() {
		return SIGN_IN;
	}

	public static String getSignInEmail() {
		return SIGN_IN_EMAIL;
	}

	public static String getSignInPassword() {
		return SIGN_IN_PASSWORD;
	}

	public static String getSignInButton() {
		return SIGN_IN_BUTTON;
	}

	public static String getSignOutButton() {
		return SIGN_OUT_BUTTON;
	}

}
