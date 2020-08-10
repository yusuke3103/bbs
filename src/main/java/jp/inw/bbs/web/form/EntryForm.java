package jp.inw.bbs.web.form;

import java.util.List;

public class EntryForm {

	private String comment;
	
	private List<EntryItem> entries;

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
	 * @return the entries
	 */
	public List<EntryItem> getEntries() {
		return entries;
	}

	/**
	 * @param entries the entries to set
	 */
	public void setEntries(List<EntryItem> entries) {
		this.entries = entries;
	}
	
	
	
}
