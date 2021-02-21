package com.luxgrey.tomokidb_backend_spring.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "tag_id")
  private Long tagId;

  @Column(name = "tag_name")
  private String tagName;

  @ManyToMany(mappedBy = "tags")
  private List<Artist> artists = new ArrayList<>();
}
