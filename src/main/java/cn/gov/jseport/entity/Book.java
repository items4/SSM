package cn.gov.jseport.entity;

import java.util.Date;

import cn.gov.jseport.tools.ChangeDate;

public class Book {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.bookid
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private Integer bookid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.business_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String businessCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.business_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String businessName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.record_business_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String recordBusinessCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.record_business_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String recordBusinessName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.recorder
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String recorder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.record_time
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private Date recordTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.start_validity
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private Date startValidity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.end_validity
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private Date endValidity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.business_bookid
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private Integer businessBookid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.book_type
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String bookType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.apply_type
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String applyType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.charge_customs
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String chargeCustoms;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.storeroom_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String storeroomCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column book.storeroom_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	private String storeroomName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.bookid
	 * @return  the value of book.bookid
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public Integer getBookid() {
		return bookid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.bookid
	 * @param bookid  the value for book.bookid
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.business_code
	 * @return  the value of book.business_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getBusinessCode() {
		return businessCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.business_code
	 * @param businessCode  the value for book.business_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.business_name
	 * @return  the value of book.business_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.business_name
	 * @param businessName  the value for book.business_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.record_business_code
	 * @return  the value of book.record_business_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getRecordBusinessCode() {
		return recordBusinessCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.record_business_code
	 * @param recordBusinessCode  the value for book.record_business_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setRecordBusinessCode(String recordBusinessCode) {
		this.recordBusinessCode = recordBusinessCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.record_business_name
	 * @return  the value of book.record_business_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getRecordBusinessName() {
		return recordBusinessName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.record_business_name
	 * @param recordBusinessName  the value for book.record_business_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setRecordBusinessName(String recordBusinessName) {
		this.recordBusinessName = recordBusinessName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.recorder
	 * @return  the value of book.recorder
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getRecorder() {
		return recorder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.recorder
	 * @param recorder  the value for book.recorder
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setRecorder(String recorder) {
		this.recorder = recorder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.record_time
	 * @return  the value of book.record_time
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public Date getRecordTime() {
		return recordTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.record_time
	 * @param recordTime  the value for book.record_time
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.start_validity
	 * @return  the value of book.start_validity
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public Date getStartValidity() {
		return startValidity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.start_validity
	 * @param startValidity  the value for book.start_validity
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setStartValidity(Date startValidity) {
		this.startValidity = startValidity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.end_validity
	 * @return  the value of book.end_validity
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public Date getEndValidity() {
		return endValidity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.end_validity
	 * @param endValidity  the value for book.end_validity
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setEndValidity(Date endValidity) {
		this.endValidity = endValidity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.business_bookid
	 * @return  the value of book.business_bookid
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public Integer getBusinessBookid() {
		return businessBookid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.business_bookid
	 * @param businessBookid  the value for book.business_bookid
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setBusinessBookid(Integer businessBookid) {
		this.businessBookid = businessBookid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.book_type
	 * @return  the value of book.book_type
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getBookType() {
		return bookType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.book_type
	 * @param bookType  the value for book.book_type
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.apply_type
	 * @return  the value of book.apply_type
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getApplyType() {
		return applyType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.apply_type
	 * @param applyType  the value for book.apply_type
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.charge_customs
	 * @return  the value of book.charge_customs
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getChargeCustoms() {
		return chargeCustoms;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.charge_customs
	 * @param chargeCustoms  the value for book.charge_customs
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setChargeCustoms(String chargeCustoms) {
		this.chargeCustoms = chargeCustoms;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.storeroom_code
	 * @return  the value of book.storeroom_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getStoreroomCode() {
		return storeroomCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.storeroom_code
	 * @param storeroomCode  the value for book.storeroom_code
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setStoreroomCode(String storeroomCode) {
		this.storeroomCode = storeroomCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column book.storeroom_name
	 * @return  the value of book.storeroom_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public String getStoreroomName() {
		return storeroomName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column book.storeroom_name
	 * @param storeroomName  the value for book.storeroom_name
	 * @mbggenerated  Mon May 06 17:01:29 CST 2019
	 */
	public void setStoreroomName(String storeroomName) {
		this.storeroomName = storeroomName;
	}

	private String recordTimeStr;
    
    public String getRecordTimeStr() {
		return ChangeDate.convertString(recordTime);
	}

	public void setRecordTimeStr(String recordTimeStr) {
		this.recordTimeStr = recordTimeStr;
		recordTime = ChangeDate.convertDate(recordTimeStr);
	}

	
	private String startValidityStr;
	
    public String getStartValidityStr() {
		return ChangeDate.convertString(startValidity);
	}

	public void setStartValidityStr(String startValidityStr) {
		this.startValidityStr = startValidityStr;
		startValidity=ChangeDate.convertDate(startValidityStr);
	}

	
	private String endValidityStr;
	
    
    public String getEndValidityStr() {
		return ChangeDate.convertString(endValidity);
	}

	public void setEndValidityStr(String endValidityStr) {
		this.endValidityStr = endValidityStr;
		endValidity=ChangeDate.convertDate(endValidityStr);
	}

	
}