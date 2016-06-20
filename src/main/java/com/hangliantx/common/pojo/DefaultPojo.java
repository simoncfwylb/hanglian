package com.hangliantx.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class DefaultPojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7595713420537090769L;


	private Long id;

	private String name;

	private Date created;

	private Long createId;

	private Date updated;

	private Long modifyId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Long getCreateId() {
		return createId;
	}

	public void setCreateId(Long createId) {
		this.createId = createId;
	}


	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Long getModifyId() {
		return modifyId;
	}

	public void setModifyId(Long modifyId) {
		this.modifyId = modifyId;
	}






}
