package com.globallogic.users.infraestructure;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "phones")
public class PhoneEntity {
	private final static Logger logger = LoggerFactory.getLogger(PhoneEntity.class);
	@Id
	private UUID id;
	private String number;
	@Column(name="countrycode")
	private String countryCode;
	@Column(name="citycode")
	private String citycode;
	
	
	public PhoneEntity() {
	}

	public PhoneEntity(String number, String countryCode, String citycode) {
		this.id= UUID.randomUUID();
		logger.debug("ID Phone generado: "+ this.id.toString());
		this.number = number;
		this.countryCode = countryCode;
		this.citycode = citycode;
	}
	
	public UUID getId() {
		return id;
	}
	public String getNumber() {
		return number;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getCityCode() {
		return citycode;
	}

}
