package com.hcl.demo.dataobject;

import java.io.Serializable;
import java.math.BigDecimal;

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

public class InCvpmv05 extends BaseBO<InCvpmv05> implements Serializable {
	private static final long serialVersionUID = 1L;

	public InCvpmv05() {
		super();
	}

	public InCvpmv05(String data) {
		super();
		setData(data);
	}

	private String cvpmv05Kundid;

	private Integer cvpmv05Gruppid;

	private String cvpmv05Berkod;

	private Integer cvpmv05BerDat;

	private String cvpmv05Lkod;

	private Integer cvpmv05Myndk;

	private Integer cvpmv05Pnr;

	private String cvpmv05Kategori;

	private Integer cvpmv05Forml;

	private String cvpmv05Fslag;

	private Integer cvpmv05Debkod;

	private String cvpmv05Ftekngr;

	private String cvpmv05Ursprung;

	private Integer cvpmv05Fromdatum;

	private Integer cvpmv05Upphalder;

	private Integer cvpmv05Upphdat;

	private Integer cvpmv05Upphkod;

	private Integer cvpmv05PaAntm;

	private BigDecimal cvpmv05Tjtfakt;

	private BigDecimal cvpmv05Upprfakt;

	private Integer cvpmv05Belopp;

	private Integer cvpmv05Itt;

	private Integer cvpmv05Mtt;

	private String cvpmv05Schablon;

	private Integer cvpmv05Punderl;

	private Integer cvpmv05Pskuld;

	private Integer cvpmv05Punderlar;

	private String cvpmv05Kbidr;

	private String cvpmv05Felsts;

	private Integer cvpmv05APnr;

	private Integer cvpmv05PskuldSti;

	private BigDecimal cvpmv05Kapfakt;

	private Integer cvpmv05Retro;

	public String getCvpmv05Kundid() {
		return cvpmv05Kundid;

	}

	public void setCvpmv05Kundid(String cvpmv05Kundid) {
		this.cvpmv05Kundid = cvpmv05Kundid;
	}

	public Integer getCvpmv05Gruppid() {
		return cvpmv05Gruppid;

	}

	public void setCvpmv05Gruppid(Integer cvpmv05Gruppid) {
		this.cvpmv05Gruppid = cvpmv05Gruppid;
	}

	public String getCvpmv05Berkod() {
		return cvpmv05Berkod;

	}

	public void setCvpmv05Berkod(String cvpmv05Berkod) {
		this.cvpmv05Berkod = cvpmv05Berkod;
	}

	public Integer getCvpmv05BerDat() {
		return cvpmv05BerDat;

	}

	public void setCvpmv05BerDat(Integer cvpmv05BerDat) {
		this.cvpmv05BerDat = cvpmv05BerDat;
	}

	public String getCvpmv05Lkod() {
		return cvpmv05Lkod;

	}

	public void setCvpmv05Lkod(String cvpmv05Lkod) {
		this.cvpmv05Lkod = cvpmv05Lkod;
	}

	public Integer getCvpmv05Myndk() {
		return cvpmv05Myndk;

	}

	public void setCvpmv05Myndk(Integer cvpmv05Myndk) {
		this.cvpmv05Myndk = cvpmv05Myndk;
	}

	public Integer getCvpmv05Pnr() {
		return cvpmv05Pnr;

	}

	public void setCvpmv05Pnr(Integer cvpmv05Pnr) {
		this.cvpmv05Pnr = cvpmv05Pnr;
	}

	public String getCvpmv05Kategori() {
		return cvpmv05Kategori;

	}

	public void setCvpmv05Kategori(String cvpmv05Kategori) {
		this.cvpmv05Kategori = cvpmv05Kategori;
	}

	public Integer getCvpmv05Forml() {
		return cvpmv05Forml;

	}

	public void setCvpmv05Forml(Integer cvpmv05Forml) {
		this.cvpmv05Forml = cvpmv05Forml;
	}

	public String getCvpmv05Fslag() {
		return cvpmv05Fslag;

	}

	public void setCvpmv05Fslag(String cvpmv05Fslag) {
		this.cvpmv05Fslag = cvpmv05Fslag;
	}

	public Integer getCvpmv05Debkod() {
		return cvpmv05Debkod;

	}

	public void setCvpmv05Debkod(Integer cvpmv05Debkod) {
		this.cvpmv05Debkod = cvpmv05Debkod;
	}

	public String getCvpmv05Ftekngr() {
		return cvpmv05Ftekngr;

	}

	public void setCvpmv05Ftekngr(String cvpmv05Ftekngr) {
		this.cvpmv05Ftekngr = cvpmv05Ftekngr;
	}

	public String getCvpmv05Ursprung() {
		return cvpmv05Ursprung;

	}

	public void setCvpmv05Ursprung(String cvpmv05Ursprung) {
		this.cvpmv05Ursprung = cvpmv05Ursprung;
	}

	public Integer getCvpmv05Fromdatum() {
		return cvpmv05Fromdatum;

	}

	public void setCvpmv05Fromdatum(Integer cvpmv05Fromdatum) {
		this.cvpmv05Fromdatum = cvpmv05Fromdatum;
	}

	public Integer getCvpmv05Upphalder() {
		return cvpmv05Upphalder;

	}

	public void setCvpmv05Upphalder(Integer cvpmv05Upphalder) {
		this.cvpmv05Upphalder = cvpmv05Upphalder;
	}

	public Integer getCvpmv05Upphdat() {
		return cvpmv05Upphdat;

	}

	public void setCvpmv05Upphdat(Integer cvpmv05Upphdat) {
		this.cvpmv05Upphdat = cvpmv05Upphdat;
	}

	public Integer getCvpmv05Upphkod() {
		return cvpmv05Upphkod;

	}

	public void setCvpmv05Upphkod(Integer cvpmv05Upphkod) {
		this.cvpmv05Upphkod = cvpmv05Upphkod;
	}

	public Integer getCvpmv05PaAntm() {
		return cvpmv05PaAntm;

	}

	public void setCvpmv05PaAntm(Integer cvpmv05PaAntm) {
		this.cvpmv05PaAntm = cvpmv05PaAntm;
	}

	public BigDecimal getCvpmv05Tjtfakt() {
		return cvpmv05Tjtfakt;

	}

	public void setCvpmv05Tjtfakt(BigDecimal cvpmv05Tjtfakt) {
		this.cvpmv05Tjtfakt = cvpmv05Tjtfakt;
	}

	public BigDecimal getCvpmv05Upprfakt() {
		return cvpmv05Upprfakt;

	}

	public void setCvpmv05Upprfakt(BigDecimal cvpmv05Upprfakt) {
		this.cvpmv05Upprfakt = cvpmv05Upprfakt;
	}

	public Integer getCvpmv05Belopp() {
		return cvpmv05Belopp;

	}

	public void setCvpmv05Belopp(Integer cvpmv05Belopp) {
		this.cvpmv05Belopp = cvpmv05Belopp;
	}

	public Integer getCvpmv05Itt() {
		return cvpmv05Itt;

	}

	public void setCvpmv05Itt(Integer cvpmv05Itt) {
		this.cvpmv05Itt = cvpmv05Itt;
	}

	public Integer getCvpmv05Mtt() {
		return cvpmv05Mtt;

	}

	public void setCvpmv05Mtt(Integer cvpmv05Mtt) {
		this.cvpmv05Mtt = cvpmv05Mtt;
	}

	public String getCvpmv05Schablon() {
		return cvpmv05Schablon;

	}

	public void setCvpmv05Schablon(String cvpmv05Schablon) {
		this.cvpmv05Schablon = cvpmv05Schablon;
	}

	public Integer getCvpmv05Punderl() {
		return cvpmv05Punderl;

	}

	public void setCvpmv05Punderl(Integer cvpmv05Punderl) {
		this.cvpmv05Punderl = cvpmv05Punderl;
	}

	public Integer getCvpmv05Pskuld() {
		return cvpmv05Pskuld;

	}

	public void setCvpmv05Pskuld(Integer cvpmv05Pskuld) {
		this.cvpmv05Pskuld = cvpmv05Pskuld;
	}

	public Integer getCvpmv05Punderlar() {
		return cvpmv05Punderlar;

	}

	public void setCvpmv05Punderlar(Integer cvpmv05Punderlar) {
		this.cvpmv05Punderlar = cvpmv05Punderlar;
	}

	public String getCvpmv05Kbidr() {
		return cvpmv05Kbidr;

	}

	public void setCvpmv05Kbidr(String cvpmv05Kbidr) {
		this.cvpmv05Kbidr = cvpmv05Kbidr;
	}

	public String getCvpmv05Felsts() {
		return cvpmv05Felsts;

	}

	public void setCvpmv05Felsts(String cvpmv05Felsts) {
		this.cvpmv05Felsts = cvpmv05Felsts;
	}

	public Integer getCvpmv05APnr() {
		return cvpmv05APnr;

	}

	public void setCvpmv05APnr(Integer cvpmv05APnr) {
		this.cvpmv05APnr = cvpmv05APnr;
	}

	public Integer getCvpmv05PskuldSti() {
		return cvpmv05PskuldSti;

	}

	public void setCvpmv05PskuldSti(Integer cvpmv05PskuldSti) {
		this.cvpmv05PskuldSti = cvpmv05PskuldSti;
	}

	public BigDecimal getCvpmv05Kapfakt() {
		return cvpmv05Kapfakt;

	}

	public void setCvpmv05Kapfakt(BigDecimal cvpmv05Kapfakt) {
		this.cvpmv05Kapfakt = cvpmv05Kapfakt;
	}

	public Integer getCvpmv05Retro() {
		return cvpmv05Retro;

	}

	public void setCvpmv05Retro(Integer cvpmv05Retro) {
		this.cvpmv05Retro = cvpmv05Retro;
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 98);
		this.setCvpmv05Kundid(baseData.substring(0, 6));
		this.setCvpmv05Gruppid((Integer) DemoUtils.readFieldAsNumber(baseData.substring(6, 9), "###", Integer.class));
		this.setCvpmv05Berkod(baseData.substring(9, 11));
		this.setCvpmv05BerDat((Integer) DemoUtils.readFieldAsNumber(baseData.substring(11, 19), "########", Integer.class));
		this.setCvpmv05Lkod(baseData.substring(19, 20));
		this.setCvpmv05Myndk((Integer) DemoUtils.readFieldAsNumber(baseData.substring(20, 25), "#####", Integer.class));
		this.setCvpmv05Pnr((Integer) DemoUtils.readFieldAsNumber(baseData.substring(25, 35), "##########", Integer.class));
		this.setCvpmv05Kategori(baseData.substring(35, 36));
		this.setCvpmv05Forml((Integer) DemoUtils.readFieldAsNumber(baseData.substring(36, 39), "###", Integer.class));
		this.setCvpmv05Fslag(baseData.substring(39, 42));
		this.setCvpmv05Debkod((Integer) DemoUtils.readFieldAsNumber(baseData.substring(42, 44), "##", Integer.class));
		this.setCvpmv05Ftekngr(baseData.substring(44, 46));
		this.setCvpmv05Ursprung(baseData.substring(46, 47));
		this.setCvpmv05Fromdatum((Integer) DemoUtils.readFieldAsNumber(baseData.substring(47, 55), "########", Integer.class));
		this.setCvpmv05Upphalder((Integer) DemoUtils.readFieldAsNumber(baseData.substring(55, 58), "###", Integer.class));
		this.setCvpmv05Upphdat((Integer) DemoUtils.readFieldAsNumber(baseData.substring(58, 66), "########", Integer.class));
		this.setCvpmv05Upphkod((Integer) DemoUtils.readFieldAsNumber(baseData.substring(66, 67), "#", Integer.class));
		this.setCvpmv05PaAntm((Integer) DemoUtils.readFieldAsNumber(baseData.substring(67, 70), "###", Integer.class));
		this.setCvpmv05Tjtfakt((BigDecimal) DemoUtils.readFieldAsNumber(baseData.substring(70, 75), "#.####", BigDecimal.class));
		this.setCvpmv05Upprfakt((BigDecimal) DemoUtils.readFieldAsNumber(baseData.substring(75, 80), "00.000", BigDecimal.class));
		this.setCvpmv05Belopp((Integer) DemoUtils.readFieldAsNumber(baseData.substring(80, 87), "#######", Integer.class));
		this.setCvpmv05Itt((Integer) DemoUtils.readFieldAsNumber(baseData.substring(87, 90), "###", Integer.class));
		this.setCvpmv05Mtt((Integer) DemoUtils.readFieldAsNumber(baseData.substring(90, 93), "###", Integer.class));
		this.setCvpmv05Schablon(baseData.substring(93, 94));
		this.setCvpmv05Punderl((Integer) DemoUtils.readFieldAsNumber(baseData.substring(94, 101), "#######", Integer.class));
		this.setCvpmv05Pskuld((Integer) DemoUtils.readFieldAsNumber(baseData.substring(101, 108), "#######", Integer.class));
		this.setCvpmv05Punderlar((Integer) DemoUtils.readFieldAsNumber(baseData.substring(108, 112), "####", Integer.class));
		this.setCvpmv05Kbidr(baseData.substring(112, 113));
		this.setCvpmv05Felsts(baseData.substring(113, 114));
		this.setCvpmv05APnr((Integer) DemoUtils.readFieldAsNumber(baseData.substring(114, 124), "##########", Integer.class));
		this.setCvpmv05PskuldSti((Integer) DemoUtils.readFieldAsNumber(baseData.substring(124, 131), "#######", Integer.class));
		this.setCvpmv05Kapfakt((BigDecimal) DemoUtils.readFieldAsNumber(baseData.substring(131, 139), "####.####", BigDecimal.class));
		this.setCvpmv05Retro((Integer) DemoUtils.readFieldAsNumber(baseData.substring(139, 146), "#######", Integer.class));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getCvpmv05Kundid().toString(), 6) + StringUtils.rightPad(getCvpmv05Gruppid().toString(), 2) + StringUtils.rightPad(getCvpmv05Berkod().toString(), 2) + StringUtils.rightPad(getCvpmv05BerDat().toString(), 5) + StringUtils.rightPad(getCvpmv05Lkod().toString(), 1) + StringUtils.rightPad(getCvpmv05Myndk().toString(), 3) + StringUtils.rightPad(getCvpmv05Pnr().toString(), 6) + StringUtils.rightPad(getCvpmv05Kategori().toString(), 1) + StringUtils.rightPad(getCvpmv05Forml().toString(), 2) + StringUtils.rightPad(getCvpmv05Fslag().toString(), 3) + StringUtils.rightPad(getCvpmv05Debkod().toString(), 2) + StringUtils.rightPad(getCvpmv05Ftekngr().toString(), 2) + StringUtils.rightPad(getCvpmv05Ursprung().toString(), 1) + StringUtils.rightPad(getCvpmv05Fromdatum().toString(), 5) + StringUtils.rightPad(getCvpmv05Upphalder().toString(), 2) + StringUtils.rightPad(getCvpmv05Upphdat().toString(), 5) + StringUtils.rightPad(getCvpmv05Upphkod().toString(), 1)
				+ StringUtils.rightPad(getCvpmv05PaAntm().toString(), 2) + StringUtils.rightPad(getCvpmv05Tjtfakt().toString(), 3) + StringUtils.rightPad(getCvpmv05Upprfakt().toString(), 3) + StringUtils.rightPad(getCvpmv05Belopp().toString(), 4) + StringUtils.rightPad(getCvpmv05Itt().toString(), 2) + StringUtils.rightPad(getCvpmv05Mtt().toString(), 2) + StringUtils.rightPad(getCvpmv05Schablon().toString(), 1) + StringUtils.rightPad(getCvpmv05Punderl().toString(), 4) + StringUtils.rightPad(getCvpmv05Pskuld().toString(), 4) + StringUtils.rightPad(getCvpmv05Punderlar().toString(), 3) + StringUtils.rightPad(getCvpmv05Kbidr().toString(), 1) + StringUtils.rightPad(getCvpmv05Felsts().toString(), 1) + StringUtils.rightPad(getCvpmv05APnr().toString(), 6) + StringUtils.rightPad(getCvpmv05PskuldSti().toString(), 4) + StringUtils.rightPad(getCvpmv05Kapfakt().toString(), 5) + StringUtils.rightPad(getCvpmv05Retro().toString(), 4);
	}

}