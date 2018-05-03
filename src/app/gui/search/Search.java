package app.gui.search;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import com.jfoenix.controls.JFXToggleButton;

import app.gui.generate.listeners.Algorithm5;
import app.gui.menu.GuiMenu;
import app.gui.menu.WindowButtons;
import app.gui.search.SrcInformationDesign;
import app.gui.search.SrcSectionDesign;
import app.gui.search.listeners.searchwindow;
import app.gui.settings.InformationDesign;
import app.gui.settings.SectionDesign;
import app.utility.GuiLocation;
import app.utility.SearchUtility;
import app.utility.animation.BounceInTransition;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Search {
	
	private final Scene scene;

	public Search(Scene scene) {
		super();

		this.scene = scene;
	}
	
	public void setContent() {

		final AnchorPane pane = (AnchorPane) scene.lookup("#principalPane");
		pane.getChildren().clear();

		SearchUtility.setLoc(GuiLocation.SEARCH);

		Pane smallpane = new Pane();
		smallpane.setId("searchPane");
		smallpane.setOpacity(0);
		Pane scrollsmallPane = new Pane();

		ScrollPane sc = new ScrollPane();
		sc.setLayoutX(0);
		sc.setLayoutY(0);
		sc.setContent(scrollsmallPane);
		sc.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
		sc.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

		scrollsmallPane.setMaxWidth(1000);
		scrollsmallPane.setMinWidth(1000);
		sc.setMaxWidth(1000);
		sc.setMinWidth(1000);
		sc.setMinHeight(400);
		sc.setMaxHeight(400);
		sc.getStyleClass().add("smallPane-color");
		scrollsmallPane.getStyleClass().add("smallPane-color");
		smallpane.getChildren().add(sc);

		pane.getChildren().add(smallpane);

		smallpane.setMinWidth(1000);
		smallpane.setMinHeight(500);
		smallpane.setMaxWidth(1000);
		smallpane.setMaxHeight(500);

		pane.setLeftAnchor(smallpane, 100.0);
		pane.setRightAnchor(smallpane, 100.0);
		pane.setTopAnchor(smallpane, 100.0);
		pane.setBottomAnchor(smallpane, 100.0);
		smallpane.setOpacity(0);
		smallpane.getStyleClass().add("smallPane-color");

		new SrcSectionDesign(scrollsmallPane, 0, 10, "Search in CV").generateTitle();

		JFXButton searchButton = new JFXButton("Search".toUpperCase());
		searchButton.getStyleClass().add("button-raised");
		searchButton.setLayoutX(780);
		searchButton.setLayoutY(90);
		searchButton.setMinWidth(200);
		searchButton.setMaxWidth(200);
		searchButton.setMinHeight(50);
		searchButton.setMaxHeight(50);

		searchButton.setOnMouseClicked(new searchwindow());

		scrollsmallPane.getChildren().add(searchButton);
		TextField TextField1 = new TextField();

		TextField1.setLayoutX(50);
		TextField1.setLayoutY(90);
		TextField1.setMaxWidth(700);
		TextField1.setMinWidth(700);
		TextField1.setMaxHeight(50);
		TextField1.setMinHeight(50);

		scrollsmallPane.getChildren().add(TextField1);

		scrollsmallPane.setPadding(new Insets(0, 0, 50, 0));
		new GuiMenu(scene).generateMenu();
		new WindowButtons(pane).generateButtons();
		new BounceInTransition(smallpane).play();
		
		
		new SrcSectionDesign(scrollsmallPane, 0, 160, "Options").generateTitle();

		new SrcInformationDesign(scrollsmallPane, 50, 237, "Option1", 200).generateSection();

		JFXToggleButton option1 = new JFXToggleButton();
		option1.getStyleClass().add("jfx-toggle-button");
		option1.setLayoutX(270);
		option1.setLayoutY(210);
		scrollsmallPane.getChildren().add(option1);
		
		
		new SrcInformationDesign(scrollsmallPane, 50, 297, "Option2", 200).generateSection();

		JFXToggleButton option2 = new JFXToggleButton();
		option2.getStyleClass().add("jfx-toggle-button");
		option2.setLayoutX(270);
		option2.setLayoutY(270);
		scrollsmallPane.getChildren().add(option2);
		
		
		new SrcInformationDesign(scrollsmallPane, 50, 357, "Option3", 200).generateSection();

		JFXToggleButton option3 = new JFXToggleButton();
		option3.getStyleClass().add("jfx-toggle-button");
		option3.setLayoutX(270);
		option3.setLayoutY(330);
		scrollsmallPane.getChildren().add(option3);
		
		
		new SrcInformationDesign(scrollsmallPane, 450, 267, "Start date", 200).generateSection();

        JFXDatePicker datePicker1 = new JFXDatePicker();
        datePicker1.setPromptText("Pick a date");
        datePicker1.setLayoutX(670);
        datePicker1.setLayoutY(269);
        
        scrollsmallPane.getChildren().add(datePicker1);
        
        
        new SrcInformationDesign(scrollsmallPane, 450, 327, "End date", 200).generateSection();
        
        JFXDatePicker datePicker2 = new JFXDatePicker();
        datePicker2.setPromptText("Pick a date");
        datePicker2.setLayoutX(670);
        datePicker2.setLayoutY(329);
        
        scrollsmallPane.getChildren().add(datePicker2);
        
        
        
	}
}
