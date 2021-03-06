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
public class Vpmv05Wrapper extends BaseBO<Vpmv05BO> implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Vpmv05BO> vpmv05BO;
	private Integer exeStatus;
	private Integer sqlStatusCode;
	private Map<String, Object> vpmv05Map;

	public List<Vpmv05BO> getVpmv05BO() {
		if (vpmv05BO == null) {
			vpmv05BO = new ArrayList<Vpmv05BO>();
		}
		return vpmv05BO;
	}

	public void setVpmv05BO(List<Vpmv05BO> vpmv05BO) {
		this.vpmv05BO = vpmv05BO;
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

	public Map<String, Object> getVpmv05Map() {
		return vpmv05Map;
	}

	public void setVpmv05Map(Map<String, Object> vpmv05Map) {
		this.vpmv05Map = vpmv05Map;
	}

	@Override
	public String toString() {
		return "Vpmv05Wrapper [vpmv05BO =" + vpmv05BO + " ,exeStatus =" + exeStatus + " ,sqlStatusCode =" + sqlStatusCode + " ,vpmv05Map =" + vpmv05Map + "]";
	}

}