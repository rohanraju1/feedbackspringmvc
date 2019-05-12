package org.caps.dev.feeback.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="faculty_skill")
public class Faculty implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Pid")
	private int pid;
	
	@Column(name="Faculty_Id")
	private int facultyId;
	
	@Column(name="Skill_Set")
     private String skillSet;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	@Override
	public String toString() {
		return "Faculty [pid=" + pid + ", facultyId=" + facultyId + ", skillSet=" + skillSet + "]";
	}
	
	
	
}
