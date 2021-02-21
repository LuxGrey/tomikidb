package com.luxgrey.tomokidb_backend_spring.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Alias {
  @Column(name = "name")
  private String name;
}
