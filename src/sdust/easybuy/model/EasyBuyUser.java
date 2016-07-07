package sdust.easybuy.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EasybuyUser entity. @author MyEclipse Persistence Tools
 */

public class EasyBuyUser {

	// Fields

	private Integer euUserId;
	private String euUserName;
	private String euPassword;
	private Integer euSex;
	private Date euBirthday;
	private String euIdentityCode;
	private String euEmail;
	private String euMobile;
	private String euAddress;
	private Integer euStatus;
	private Set easybuyComments = new HashSet(0);
	private Set easybuyOrders = new HashSet(0);

	// Constructors

	/** default constructor */
	public EasyBuyUser() {
	}

	/** minimal constructor */
	public EasyBuyUser(String euUserName, String euPassword, Integer euSex,
			Date euBirthday, String euIdentityCode, String euEmail,
			String euMobile, String euAddress, Integer euStatus) {
		this.euUserName = euUserName;
		this.euPassword = euPassword;
		this.euSex = euSex;
		this.euBirthday = euBirthday;
		this.euIdentityCode = euIdentityCode;
		this.euEmail = euEmail;
		this.euMobile = euMobile;
		this.euAddress = euAddress;
		this.euStatus = euStatus;
	}

	public EasyBuyUser(String euUserName, String euPassword) {
		super();
		this.euUserName = euUserName;
		this.euPassword = euPassword;
	}

	/** full constructor */
	public EasyBuyUser(String euUserName, String euPassword, Integer euSex,
			Date euBirthday, String euIdentityCode, String euEmail,
			String euMobile, String euAddress, Integer euStatus,
			Set easybuyComments, Set easybuyOrders) {
		this.euUserName = euUserName;
		this.euPassword = euPassword;
		this.euSex = euSex;
		this.euBirthday = euBirthday;
		this.euIdentityCode = euIdentityCode;
		this.euEmail = euEmail;
		this.euMobile = euMobile;
		this.euAddress = euAddress;
		this.euStatus = euStatus;
		this.easybuyComments = easybuyComments;
		this.easybuyOrders = easybuyOrders;
	}

	// Property accessors

	public Integer getEuUserId() {
		return this.euUserId;
	}

	public void setEuUserId(Integer euUserId) {
		this.euUserId = euUserId;
	}

	public String getEuUserName() {
		return this.euUserName;
	}

	public void setEuUserName(String euUserName) {
		this.euUserName = euUserName;
	}

	public String getEuPassword() {
		return this.euPassword;
	}

	public void setEuPassword(String euPassword) {
		this.euPassword = euPassword;
	}

	public Integer getEuSex() {
		return this.euSex;
	}

	public void setEuSex(Integer euSex) {
		this.euSex = euSex;
	}

	public Date getEuBirthday() {
		return this.euBirthday;
	}

	public void setEuBirthday(Date euBirthday) {
		this.euBirthday = euBirthday;
	}

	public String getEuIdentityCode() {
		return this.euIdentityCode;
	}

	public void setEuIdentityCode(String euIdentityCode) {
		this.euIdentityCode = euIdentityCode;
	}

	public String getEuEmail() {
		return this.euEmail;
	}

	public void setEuEmail(String euEmail) {
		this.euEmail = euEmail;
	}

	public String getEuMobile() {
		return this.euMobile;
	}

	public void setEuMobile(String euMobile) {
		this.euMobile = euMobile;
	}

	public String getEuAddress() {
		return this.euAddress;
	}

	public void setEuAddress(String euAddress) {
		this.euAddress = euAddress;
	}

	public Integer getEuStatus() {
		return this.euStatus;
	}

	public void setEuStatus(Integer euStatus) {
		this.euStatus = euStatus;
	}

	public Set getEasybuyComments() {
		return this.easybuyComments;
	}

	public void setEasybuyComments(Set easybuyComments) {
		this.easybuyComments = easybuyComments;
	}

	public Set getEasybuyOrders() {
		return this.easybuyOrders;
	}

	public void setEasybuyOrders(Set easybuyOrders) {
		this.easybuyOrders = easybuyOrders;
	}

	@Override
	public String toString() {
		return "EasyBuyUser [euUserId=" + euUserId + ", euUserName="
				+ euUserName + ", euPassword=" + euPassword + ", euSex="
				+ euSex + ", euBirthday=" + euBirthday + ", euIdentityCode="
				+ euIdentityCode + ", euEmail=" + euEmail + ", euMobile="
				+ euMobile + ", euAddress=" + euAddress + ", euStatus="
				+ euStatus + ", easybuyComments=" + easybuyComments
				+ ", easybuyOrders=" + easybuyOrders + "]";
	}

}