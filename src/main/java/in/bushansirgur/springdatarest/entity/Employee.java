package in.bushansirgur.springdatarest.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String name;
	
	private BigDecimal salary;
	@Column(name="created_at", nullable=false, updatable=false)
	@CreationTimestamp
	private Date createdAt;
	@Column(name="updated_at")
	@UpdateTimestamp
	private Date updatedAt;
}
