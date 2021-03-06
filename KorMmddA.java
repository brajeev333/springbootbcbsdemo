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

public class KorMmddA extends BaseBO<KorMmddA> implements Serializable {
	private static final long serialVersionUID = 1L;

	public KorMmddA() {
		super();
	}

	public KorMmddA(String data) {
		super();
		setData(data);
	}

	private Integer korMmdd;

	public Integer getKorMmdd() {
		return korMmdd;

	}

	public void setKorMmdd(Integer korMmdd) {
		this.korMmdd = korMmdd;
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 4);
		this.setKorMmdd((Integer) DemoUtils.readFieldAsNumber(baseData.substring(0, 4), "####", Integer.class));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getKorMmdd().toString(), 4);
	}

}