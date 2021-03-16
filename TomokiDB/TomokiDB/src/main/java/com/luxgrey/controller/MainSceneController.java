package com.luxgrey.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class MainSceneController {
  @FXML private TabPane tabPane;
  @FXML private Tab artistsTab;
  @FXML private ArtistsPageController artistsPageController;
  @FXML private Tab profileTypesTab;
  @FXML private ProfileTypesPageController profileTypesPageController;
  @FXML private Tab tagsTab;
  @FXML private TagsPageController tagsPageController;
}
