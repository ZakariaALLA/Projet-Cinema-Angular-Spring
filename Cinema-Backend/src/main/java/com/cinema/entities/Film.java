package com.cinema.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Film {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String realisateur;
	private String titre;
	private double duree;
	private String photo;
	private Date dateSortie;
	@OneToMany(mappedBy = "film")
	// l'annotation sert à ne pas afficher les projection (que en ecriture seuelement ) 
	@JsonProperty(access=Access.WRITE_ONLY)
	private Collection<Projection> projections;
	@ManyToOne
	private Categorie categorie;

}
