package jp.inw.bbs.web.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserForm {

	@NotBlank
	@Size(max=10)
	private String userId;
	@NotBlank
	@Size(max=20)
	private String displayNm;
	@NotBlank
	@Size(max=10)
	private String password;
	@NotBlank
	@Size(max=10)
	private String rePassword;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the displayNm
	 */
	public String getDisplayNm() {
		return displayNm;
	}
	/**
	 * @param displaynm the displayNm to set
	 */
	public void setDisplayNm(String displayNm) {
		this.displayNm = displayNm;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the rePassword
	 */
	public String getRePassword() {
		return rePassword;
	}
	/**
	 * @param rePassword the rePassword to set
	 */
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	
	
	
}
