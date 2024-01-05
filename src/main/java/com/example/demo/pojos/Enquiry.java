package com.example.demo.pojos;
// Generated 20 Sep, 2022 5:56:57 PM by Hibernate Tools 3.2.2.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Enquiry generated by hbm2java
 */
@Entity
@Table(name = "enquiry", catalog = "computersikho")
public class Enquiry implements java.io.Serializable {

	private int enquiryId;
	private int course;
	private int closureReasonMaster;
	private String enquirerName;
	private String enquirerAddress;
	private String enquirerMobile;
	private String enquirerAlternateMobile;
	private String enquirerEmailId;
	private Date enquiryDate;
	private String enquirerQuery;
	private String closureReason;
	private Boolean enquiryProcessedFlag;
	private String studentName;
	private int enquiryCounter;
	private Date followUp;
	private Set<Student> students = new HashSet(0);
	private Set<Followup> followups = new HashSet(0);

	public Enquiry() {
	}

	public Enquiry(int enquiryId, int course, String enquirerName, String enquirerAddress, String enquirerMobile,
			String enquirerAlternateMobile, Date enquiryDate, String studentName, int enquiryCounter, Date followUp) {
		this.enquiryId = enquiryId;
		this.course = course;
		this.enquirerName = enquirerName;
		this.enquirerAddress = enquirerAddress;
		this.enquirerMobile = enquirerMobile;
		this.enquirerAlternateMobile = enquirerAlternateMobile;
		this.enquiryDate = enquiryDate;
		this.studentName = studentName;
		this.enquiryCounter = enquiryCounter;
		this.followUp = followUp;
	}

	public Enquiry(int enquiryId, int course, int closureReasonMaster, String enquirerName,
			String enquirerAddress, String enquirerMobile, String enquirerAlternateMobile, String enquirerEmailId,
			Date enquiryDate, String enquirerQuery, String closureReason, Boolean enquiryProcessedFlag,
			String studentName, int enquiryCounter, Date followUp, Set<Student> students, Set<Followup> followups) {
		this.enquiryId = enquiryId;
		this.course = course;
		this.closureReasonMaster = closureReasonMaster;
		this.enquirerName = enquirerName;
		this.enquirerAddress = enquirerAddress;
		this.enquirerMobile = enquirerMobile;
		this.enquirerAlternateMobile = enquirerAlternateMobile;
		this.enquirerEmailId = enquirerEmailId;
		this.enquiryDate = enquiryDate;
		this.enquirerQuery = enquirerQuery;
		this.closureReason = closureReason;
		this.enquiryProcessedFlag = enquiryProcessedFlag;
		this.studentName = studentName;
		this.enquiryCounter = enquiryCounter;
		this.followUp = followUp;
		this.students = students;
		this.followups = followups;
	}

	//@Id
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "enquiry_id", unique = true, nullable = false)
	public int getEnquiryId() {
		return this.enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "course_id", nullable = false)
	public int getCourse() {
		return this.course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "closure_reasonID")
	public int getClosureReasonMaster() {
		return this.closureReasonMaster;
	}

	public void setClosureReasonMaster(int closureReasonMaster) {
		this.closureReasonMaster = closureReasonMaster;
	}

	@Column(name = "enquirer_name", nullable = false, length = 200)
	public String getEnquirerName() {
		return this.enquirerName;
	}

	public void setEnquirerName(String enquirerName) {
		this.enquirerName = enquirerName;
	}

	@Column(name = "enquirer_address", nullable = false, length = 200)
	public String getEnquirerAddress() {
		return this.enquirerAddress;
	}

	public void setEnquirerAddress(String enquirerAddress) {
		this.enquirerAddress = enquirerAddress;
	}

	@Column(name = "enquirer_mobile", nullable = false, length = 200)
	public String getEnquirerMobile() {
		return this.enquirerMobile;
	}

	public void setEnquirerMobile(String enquirerMobile) {
		this.enquirerMobile = enquirerMobile;
	}

	@Column(name = "enquirer_alternate_mobile", nullable = false, length = 200)
	public String getEnquirerAlternateMobile() {
		return this.enquirerAlternateMobile;
	}

	public void setEnquirerAlternateMobile(String enquirerAlternateMobile) {
		this.enquirerAlternateMobile = enquirerAlternateMobile;
	}

	@Column(name = "enquirer_email_id", length = 200)
	public String getEnquirerEmailId() {
		return this.enquirerEmailId;
	}

	public void setEnquirerEmailId(String enquirerEmailId) {
		this.enquirerEmailId = enquirerEmailId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "enquiry_date", nullable = false, length = 10)
	public Date getEnquiryDate() {
		return this.enquiryDate;
	}

	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}

	@Column(name = "enquirer_query", length = 200)
	public String getEnquirerQuery() {
		return this.enquirerQuery;
	}

	public void setEnquirerQuery(String enquirerQuery) {
		this.enquirerQuery = enquirerQuery;
	}

	@Column(name = "closure_reason", length = 200)
	public String getClosureReason() {
		return this.closureReason;
	}

	public void setClosureReason(String closureReason) {
		this.closureReason = closureReason;
	}

	@Column(name = "enquiry_processed_flag")
	public Boolean getEnquiryProcessedFlag() {
		return this.enquiryProcessedFlag;
	}

	public void setEnquiryProcessedFlag(Boolean enquiryProcessedFlag) {
		this.enquiryProcessedFlag = enquiryProcessedFlag;
	}

	@Column(name = "Student_Name", nullable = false, length = 200)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "enquiry_counter", nullable = false)
	public int getEnquiryCounter() {
		return this.enquiryCounter;
	}

	public void setEnquiryCounter(int enquiryCounter) {
		this.enquiryCounter = enquiryCounter;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Follow_up", nullable = false, length = 10)
	public Date getFollowUp() {
		return this.followUp;
	}

	public void setFollowUp(Date followUp) {
		this.followUp = followUp;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "enquiry")
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "enquiry")
	public Set<Followup> getFollowups() {
		return this.followups;
	}

	public void setFollowups(Set<Followup> followups) {
		this.followups = followups;
	}

}