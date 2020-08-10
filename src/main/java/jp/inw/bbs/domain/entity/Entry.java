package jp.inw.bbs.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="entry")
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int entryid;
	
	@ManyToOne
	@JoinColumn(name="userid",referencedColumnName = "userid")
	private User user;
	
	@Column
	private String comment;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date entdt;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date upddt;

	/**
	 * @return the entryid
	 */
	public int getEntryid() {
		return entryid;
	}

	/**
	 * @param entryid the entryid to set
	 */
	public void setEntryid(int entryid) {
		this.entryid = entryid;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
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

	
}
