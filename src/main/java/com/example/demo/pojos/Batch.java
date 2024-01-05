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
 * Batch generated by hbm2java
 */
@Entity
@Table(name = "batch", catalog = "computersikho")
public class Batch implements java.io.Serializable {

	private int batchId;
	private int course;
	private String batchName;
	private Date batchStartTime;
	private Date batchEndTime;
	private Boolean batchIsActive;
	private Date finalPresentationDate;
	private Set<Student> students = new HashSet(0);

	public Batch() {
	}

	public Batch(int batchId, int course, String batchName, Date batchStartTime, Date batchEndTime) {
		this.batchId = batchId;
		this.course = course;
		this.batchName = batchName;
		this.batchStartTime = batchStartTime;
		this.batchEndTime = batchEndTime;
	}

	public Batch(int batchId, int course, String batchName, Date batchStartTime, Date batchEndTime,
			Boolean batchIsActive, Date finalPresentationDate, Set<Student> students) {
		this.batchId = batchId;
		this.course = course;
		this.batchName = batchName;
		this.batchStartTime = batchStartTime;
		this.batchEndTime = batchEndTime;
		this.batchIsActive = batchIsActive;
		this.finalPresentationDate = finalPresentationDate;
		this.students = students;
	}

	//@Id
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "batch_id", unique = true, nullable = false)
	public int getBatchId() {
		return this.batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "course_id", nullable = false)
	public int getCourse() {
		return this.course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Column(name = "batch_name", nullable = false, length = 200)
	public String getBatchName() {
		return this.batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "batch_start_time", nullable = false, length = 10)
	public Date getBatchStartTime() {
		return this.batchStartTime;
	}

	public void setBatchStartTime(Date batchStartTime) {
		this.batchStartTime = batchStartTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "batch_end_time", nullable = false, length = 10)
	public Date getBatchEndTime() {
		return this.batchEndTime;
	}

	public void setBatchEndTime(Date batchEndTime) {
		this.batchEndTime = batchEndTime;
	}

	@Column(name = "batch_is_active")
	public Boolean getBatchIsActive() {
		return this.batchIsActive;
	}

	public void setBatchIsActive(Boolean batchIsActive) {
		this.batchIsActive = batchIsActive;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "final_presentation_date", length = 10)
	public Date getFinalPresentationDate() {
		return this.finalPresentationDate;
	}

	public void setFinalPresentationDate(Date finalPresentationDate) {
		this.finalPresentationDate = finalPresentationDate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "batch")
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}