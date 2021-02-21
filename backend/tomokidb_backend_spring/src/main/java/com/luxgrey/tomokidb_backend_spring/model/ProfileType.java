package com.luxgrey.tomokidb_backend_spring.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProfileType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "profile_type_id")
  private Integer profileTypeId;

  @Column(name = "type_name")
  private String typeName;

  @Column(name = "icon_url")
  private String iconUrl;

  @OneToMany(mappedBy = "profileType")
  private List<Profile> profiles;
}
