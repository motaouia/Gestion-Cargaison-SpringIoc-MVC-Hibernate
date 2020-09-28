package org.gestiontransport.pckage.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CA")
@NoArgsConstructor
@Data
public class CargaisonAerienne extends Cargaison {
	
	private double poidsMax;
	
	public CargaisonAerienne(String referenceCargaison, double distanceParcourue, Date dateLivraison,
			Set<Marchandise> marchanides, double poidsMax) {
		super(referenceCargaison, distanceParcourue, dateLivraison, marchanides);
		this.poidsMax = poidsMax;
	}

	
	
	

}
