package org.gestiontransport.pckage.entities;

import javax.persistence.DiscriminatorValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DiscriminatorValue("CA")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CargaisonAerienne extends Cargaison {
	
	private double poidsMax;

}
