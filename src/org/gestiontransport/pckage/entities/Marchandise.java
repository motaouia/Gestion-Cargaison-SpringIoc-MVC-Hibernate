package org.gestiontransport.pckage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MARCHANDISE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marchandise implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numMarchandise;
	private String nomMarchandise;
	private int poidsMarchandise;
	private int volumeMarchandise;
	

}
