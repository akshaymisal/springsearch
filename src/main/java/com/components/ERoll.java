package com.components;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "collection1")
public class ERoll {

	@Id
	@Field
	private String id;

	@Field
	private String epic_no;

	@Field
	private String name;

	@Field
	private String name_v1;

	@Field
	private String rln_name;

	@Field
	private String rln_name_v1;

	@Field
	private String rln_type;

	@Field
	private String gender;

	@Field
	private String dob;

	@Field
	private int age;

	@Field
	private String state;

	@Field
	private String st_code;

	@Field
	private int ac_no;

	@Field
	private String ac_name;

	@Field
	private int part_no;

	@Field
	private String part_name;

	@Field
	private String pc_name;

	@Field
	private String ps_name;

	@Field
	private String house_no;

	@Field
	private String ps_lat_long;

	@Field
	private String district;

	@Field
	private String last_update;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEpic_no() {
		return epic_no;
	}

	public void setEpic_no(String epic_no) {
		this.epic_no = epic_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_v1() {
		return name_v1;
	}

	public void setName_v1(String name_v1) {
		this.name_v1 = name_v1;
	}

	public String getRln_name() {
		return rln_name;
	}

	public void setRln_name(String rln_name) {
		this.rln_name = rln_name;
	}

	public String getRln_name_v1() {
		return rln_name_v1;
	}

	public void setRln_name_v1(String rln_name_v1) {
		this.rln_name_v1 = rln_name_v1;
	}

	public String getRln_type() {
		return rln_type;
	}

	public void setRln_type(String rln_type) {
		this.rln_type = rln_type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSt_code() {
		return st_code;
	}

	public void setSt_code(String st_code) {
		this.st_code = st_code;
	}

	public int getAc_no() {
		return ac_no;
	}

	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	public int getPart_no() {
		return part_no;
	}

	public void setPart_no(int part_no) {
		this.part_no = part_no;
	}

	public String getPart_name() {
		return part_name;
	}

	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}

	public String getPc_name() {
		return pc_name;
	}

	public void setPc_name(String pc_name) {
		this.pc_name = pc_name;
	}

	public String getPs_name() {
		return ps_name;
	}

	public void setPs_name(String ps_name) {
		this.ps_name = ps_name;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getPs_lat_long() {
		return ps_lat_long;
	}

	public void setPs_lat_long(String ps_lat_long) {
		this.ps_lat_long = ps_lat_long;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "ERoll [id=" + id + ", epic_no=" + epic_no + ", name=" + name
				+ ", name_v1=" + name_v1 + ", rln_name=" + rln_name
				+ ", rln_name_v1=" + rln_name_v1 + ", rln_type=" + rln_type
				+ ", gender=" + gender + ", dob=" + dob + ", age=" + age
				+ ", state=" + state + ", st_code=" + st_code + ", ac_no="
				+ ac_no + ", ac_name=" + ac_name + ", part_no=" + part_no
				+ ", part_name=" + part_name + ", pc_name=" + pc_name
				+ ", ps_name=" + ps_name + ", house_no=" + house_no
				+ ", ps_lat_long=" + ps_lat_long + ", district=" + district
				+ ", last_update=" + last_update + "]";
	}

}
