package org.gestiontransport.pckage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MARCHANDISE")
@Data
@NoArgsConstructor
public class Marchandise implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numMarchandise;
	private String nomMarchandise;
	private int poidsMarchandise;
	private int volumeMarchandise;
	
	@ManyToOne
	@JoinColumn(name = "ID_CARGAISON")
	private Cargaison cargaison;

	public Marchandise(String nomMarchandise, int poidsMarchandise, int volumeMarchandise) {
		super();
		this.nomMarchandise = nomMarchandise;
		this.poidsMarchandise = poidsMarchandise;
		this.volumeMarchandise = volumeMarchandise;
	}
	
	

}
