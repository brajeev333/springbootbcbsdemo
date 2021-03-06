package com.hcl.demo.dataobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*************************************************************************
 * 
 * HCL CONFIDENTIAL
 * _________________________________________________________________________________
 * 
 * HCL is a trademark of HCL Company.
 *
 * Copyright © 2020 HCL. All rights reserved.
 * 
 * NOTICE: All information contained herein is, and remains the property of HCL
 * and its suppliers, if any. The intellectual and technical concepts contained
 * herein are proprietary to HCL and its suppliers and may be covered by U.S.
 * and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission is obtained
 * from HCL.
 *
 *************************************************************************/
// Author : Generated by ATMA ®
// Revision History : 
public class Vpbv05Wrapper extends BaseBO<Vpbv05BO> implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Vpbv05BO> vpbv05BO;
	private Integer exeStatus;
	private Integer sqlStatusCode;
	private Map<String, Object> vpbv05Map;

	public List<Vpbv05BO> getVpbv05BO() {
		if (vpbv05BO == null) {
			vpbv05BO = new ArrayList<Vpbv05BO>();
		}
		return vpbv05BO;
	}

	public void setVpbv05BO(List<Vpbv05BO> vpbv05BO) {
		this.vpbv05BO = vpbv05BO;
	}

	public Integer getExeStatus() {
		return exeStatus;
	}

	public void setExeStatus(Integer exeStatus) {
		this.exeStatus = exeStatus;
	}

	public Integer getSqlStatusCode() {
		return sqlStatusCode;
	}

	public void setSqlStatusCode(Integer sqlStatusCode) {
		this.sqlStatusCode = sqlStatusCode;
	}

	public Map<String, Object> getVpbv05Map() {
		return vpbv05Map;
	}

	public void setVpbv05Map(Map<String, Object> vpbv05Map) {
		this.vpbv05Map = vpbv05Map;
	}

	@Override
	public String toString() {
		return "Vpbv05Wrapper [vpbv05BO =" + vpbv05BO + " ,exeStatus =" + exeStatus + " ,sqlStatusCode =" + sqlStatusCode + " ,vpbv05Map =" + vpbv05Map + "]";
	}

}