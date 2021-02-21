package com.luxgrey.tomokidb_backend_spring.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "artist_id")
  private Integer artistId;

  @ElementCollection
  private List<Alias> aliases = new ArrayList<>();

  @OneToMany(mappedBy = "artist")
  private List<Profile> profiles = new ArrayList<>();

  //owner of relation, controls db-sync
  @ManyToMany
  @JoinTable(
      name = "artist_to_tag",
      joinColumns = @JoinColumn(name="a_id"),
      inverseJoinColumns = @JoinColumn(name="t_id")
  )
  private List<Tag> tags = new ArrayList<>();
}
