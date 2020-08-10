package jp.inw.bbs.domain.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private String userid;
	@Column
	private String displaynm;
	@Column
	private String password;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date entdt;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date upddt;
	
	@OneToMany(mappedBy = "user")
	private List<Entry> entryList;
	
	
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the displaynm
	 */
	public String getDisplaynm() {
		return displaynm;
	}
	/**
	 * @param displaynm the displaynm to set
	 */
	public void setDisplaynm(String displaynm) {
		this.displaynm = displaynm;
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
	 * @return the entdt
	 */
	public Date getEntdt() {
		return entdt;
	}
	/**
	 * @param entdt the entdt to set
	 */
	public void setEntdt(Date entdt) {
		this.entdt = entdt;
	}
	/**
	 * @return the upddt
	 */
	public Date getUpddt() {
		return upddt;
	}
	/**
	 * @param upddt the upddt to set
	 */
	public void setUpddt(Date upddt) {
		this.upddt = upddt;
	}
	/**
	 * @return the entryList
	 */
	public List<Entry> getEntryList() {
		return entryList;
	}
	/**
	 * @param entryList the entryList to set
	 */
	public void setEntryList(List<Entry> entryList) {
		this.entryList = entryList;
	}
	
	
	
}
