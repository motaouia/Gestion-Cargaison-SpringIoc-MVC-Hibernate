package org.gestiontransport.pckage.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CR")
@NoArgsConstructor
@Data
public class CargaisonRoutiere extends Cargaison {
	
	private double tempConservation;

	public CargaisonRoutiere(String referenceCargaison, double distanceParcourue, Date dateLivraison,
			Set<Marchandise> marchanides, double tempConservation) {
		super(referenceCargaison, distanceParcourue, dateLivraison, marchanides);
		this.tempConservation = tempConservation;
	}
	
	

}
