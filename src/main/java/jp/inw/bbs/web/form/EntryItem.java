package jp.inw.bbs.web.form;

import java.util.Date;

public class EntryItem {

	private String displayNm;
	private String userId;
	private Date updDt;
	private String Comment;
	/**
	 * @return the displayNm
	 */
	public String getDisplayNm() {
		return displayNm;
	}
	/**
	 * @param displayNm the displayNm to set
	 */
	public void setDisplayNm(String displayNm) {
		this.displayNm = displayNm;
	}
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
	 * @return the updDt
	 */
	public Date getUpdDt() {
		return updDt;
	}
	/**
	 * @param updDt the updDt to set
	 */
	public void setUpdDt(Date updDt) {
		this.updDt = updDt;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return Comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		Comment = comment;
	}
	
	
	
}
