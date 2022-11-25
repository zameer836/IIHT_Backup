package com.Employee.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Integer fieldValue;
	
	
	
	public String getResourceName() {
		return resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public Integer getFieldValue() {
		return fieldValue;
	}
	public ResourceNotFoundException(String resourceName, String fieldName, Integer id) {
		super(String.format("%s not found with %s: %s", resourceName, fieldName, id));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue= id;
	}
	
}
