/**
 * 
 */
package model;

import java.io.Serializable;

/**
 * @author JiHan
 *
 */
public class Teacher extends User implements Serializable {
	private static final long serialVersionUID = 8208096290851472481L;
	private String Title;
	/**
	 * @return title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title Ҫ���õ� title
	 */
	public void setTitle(String title) {
		Title = title;
	}

}