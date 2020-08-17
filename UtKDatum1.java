package com.hcl.demo.dataobject;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

public class UtKDatum1 extends BaseBO<UtKDatum1> implements Serializable {
	private static final long serialVersionUID = 1L;

	public UtKDatum1() {
		super();
	}

	public UtKDatum1(String data) {
		super();
		setData(data);
	}

	private String fillerUtKDatum11 = "";

	private String fillerUtKDatum12 = "DAGENS DATUM   :";

	private Integer utKDatAkt;

	private String fillerUtKDatum13 = "  KLOCKSLAG : ";

	private String utKTidAkt ="";

	private String fillerUtKDatum14 = "";

	public String getFillerUtKDatum11() {
		return fillerUtKDatum11;

	}

	public void setFillerUtKDatum11(String fillerUtKDatum11) {
	}

	public String getFillerUtKDatum12() {
		return fillerUtKDatum12;

	}

	public void setFillerUtKDatum12(String fillerUtKDatum12) {
	}

	public Integer getUtKDatAkt() {
		if(null==utKDatAkt) {
			utKDatAkt=Integer.parseInt((LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd"))));
		}
		return utKDatAkt;

	}

	public void setUtKDatAkt(Integer utKDatAkt) {
		this.utKDatAkt = utKDatAkt;
	}

	public String getFillerUtKDatum13() {
		return fillerUtKDatum13;

	}

	public void setFillerUtKDatum13(String fillerUtKDatum13) {
	}

	public String getUtKTidAkt() {
		return utKTidAkt;

	}

	public void setUtKTidAkt(String utKTidAkt) {
		this.utKTidAkt = utKTidAkt;
	}

	public String getFillerUtKDatum14() {
		return fillerUtKDatum14;

	}

	public void setFillerUtKDatum14(String fillerUtKDatum14) {
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 61);
		this.setFillerUtKDatum11(baseData.substring(0, 1));
		this.setFillerUtKDatum12(baseData.substring(1, 17));
		this.setUtKDatAkt((Integer) DemoUtils.readFieldAsNumber(baseData.substring(17, 25), "########", Integer.class));
		this.setFillerUtKDatum13(baseData.substring(25, 39));
		this.setUtKTidAkt(baseData.substring(39, 44));
		this.setFillerUtKDatum14(baseData.substring(44, 61));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getFillerUtKDatum11().toString(), 1) + StringUtils.rightPad(getFillerUtKDatum12().toString(), 16) + StringUtils.rightPad(getUtKDatAkt().toString(), 8) + StringUtils.rightPad(getFillerUtKDatum13().toString(), 14) + StringUtils.rightPad(getUtKTidAkt().toString(), 5) + StringUtils.rightPad(getFillerUtKDatum14().toString(), 17);
	}

}