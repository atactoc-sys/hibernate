package HibernetdemoLab.Emmploiee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emploiee 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 25, nullable = false)
	private String name;
	@Column(length = 50, nullable = false)
	private String address;
	@Column(length = 25, nullable = false, unique = true)
	private String emailId;
	@Column(length = 11, nullable = false, unique = true)
	private long phone_no;
	@Column(length = 11, nullable = false)
	private String designation;
	@Column(length = 25, nullable = false)
	private String depertment;
	@Column(length = 8, nullable = false)
	private double salary;
	
}
