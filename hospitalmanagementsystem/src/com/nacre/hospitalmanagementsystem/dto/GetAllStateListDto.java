package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;

public class GetAllStateListDto implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7455087649806181117L;
	private Integer stateId;
	private String stateName;
	public Integer getStateId() {
		return stateId;
	}
	public void setStateid(Integer stateid) {
		this.stateId = stateid;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "GetAllStateListDto [stateid=" + stateId + ", stateName=" + stateName + "]";
	}
	

}
