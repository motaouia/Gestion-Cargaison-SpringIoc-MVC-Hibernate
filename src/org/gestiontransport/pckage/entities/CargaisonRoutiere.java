package org.gestiontransport.pckage.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DiscriminatorValue("CR")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CargaisonRoutiere extends Cargaison {
	
	private double tempConservation;

}
