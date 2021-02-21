package com.luxgrey.tomokidb_backend_spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Profile {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "profile_id")
  private Long profileId;

  @Column(name = "url")
  private String url;

  @ManyToOne
  private ProfileType profileType;

  @ManyToOne
  private Artist artist;
}
