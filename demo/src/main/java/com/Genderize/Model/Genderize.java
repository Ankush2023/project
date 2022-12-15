package com.Genderize.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="genderize")
public class Genderize {
	   @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String name;
	    private String gender;
	    private Integer count;
	    private Double probability;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Integer getCount() {
			return count;
		}
		public void setCount(Integer count) {
			this.count = count;
		}
		public Double getProbability() {
			return probability;
		}
		public void setProbability(Double probability) {
			this.probability = probability;
		}
		public Genderize(Integer id, String name, String gender, Integer count, Double probability) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.count = count;
			this.probability = probability;
		}
		public Genderize() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Genderize [id=" + id + ", name=" + name + ", gender=" + gender + ", count=" + count + ", probability="
					+ probability + "]";
		}
	    
	}



