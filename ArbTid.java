package com.hcl.demo.dataobject;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.hcl.demo.util.DemoUtils;

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

public class ArbTid extends BaseBO<ArbTid> implements Serializable {
	private static final long serialVersionUID = 1L;

	public ArbTid() {
		super();
	}

	public ArbTid(String data) {
		super();
		setData(data);
	}

	private Integer arbTidHh;

	private String fillerArbTid1 = ".";

	private Integer arbTidMm;

	public Integer getArbTidHh() {
		return arbTidHh;

	}

	public void setArbTidHh(Integer arbTidHh) {
		this.arbTidHh = arbTidHh;
	}

	public String getFillerArbTid1() {
		return fillerArbTid1;

	}

	public void setFillerArbTid1(String fillerArbTid1) {
	}

	public Integer getArbTidMm() {
		return arbTidMm;

	}

	public void setArbTidMm(Integer arbTidMm) {
		this.arbTidMm = arbTidMm;
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 5);
		this.setArbTidHh((Integer) DemoUtils.readFieldAsNumber(baseData.substring(0, 2), "##", Integer.class));
		this.setFillerArbTid1(baseData.substring(2, 3));
		this.setArbTidMm((Integer) DemoUtils.readFieldAsNumber(baseData.substring(3, 5), "##", Integer.class));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getArbTidHh().toString(), 2) + StringUtils.rightPad(getFillerArbTid1().toString(), 1) + StringUtils.rightPad(getArbTidMm().toString(), 2);
	}

}