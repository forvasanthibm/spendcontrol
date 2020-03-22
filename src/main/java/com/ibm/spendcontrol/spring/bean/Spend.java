package com.ibm.spendcontrol.spring.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@SuppressWarnings("serial")
@Document(collection = "spend")
public class Spend extends BaseEntity {
	
	

	@JsonProperty("email")
	private String email;
	@JsonProperty("spendDetails")
	private List<SpendDetail> spendDetails = null;
	//@JsonIgnore
	//private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	
	public Spend() {
	}
	
	public Spend(String email, List<SpendDetail> spendDetails) {
		
		this.email = email;
		this.spendDetails = spendDetails;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		System.out.println("email is: "+email);
		this.email = email;
	}

	@JsonProperty("spendDetails")
	public List<SpendDetail> getSpendDetails() {
		return spendDetails;
	}

	@JsonProperty("spendDetails")
	public void setSpendDetails(List<SpendDetail> spendDetails) {
		System.out.println("spendDetails are: "+spendDetails.toString());
		this.spendDetails = spendDetails;
	}

	/*
	 * @JsonAnyGetter public Map<String, Object> getAdditionalProperties() { return
	 * this.additionalProperties; }
	 * 
	 * @JsonAnySetter public void setAdditionalProperty(String name, Object value) {
	 * this.additionalProperties.put(name, value); }
	 */

}