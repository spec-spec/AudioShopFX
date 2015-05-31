package ua.oa.taras.audio.controller;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import ua.oa.taras.audio.dao.DaoFacade;
import ua.oa.taras.audio.data.Album;

public class AudioShopController {
	@FXML
	private TableView<Album> table;
	@FXML
	private Button createButton;
	@FXML
	private TextField idField;
	@FXML
	private TextField nameField;
	@FXML
	private TextField yearField;
	private DaoFacade facade = new DaoFacade();
	private List<Album> albums;
	private ObservableList<Album> olist;
	
	public void initData(){
	albums = facade.getAlbumDaoSql().loadAll();
	olist = FXCollections.observableList(albums);
	}
	public void setTableView() {
		initData();
		TableColumn idColumn = new TableColumn("Id");
		TableColumn nameColumn = new TableColumn("Name");
		TableColumn yearColumn = new TableColumn("Year");
		idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
		table.getColumns().addAll(idColumn, nameColumn, yearColumn);
		table.setItems(olist);

	}

	public void createAlbum() {
		Album tmp = new Album(new Long(idField.getText()), nameField.getText(),
				new Integer(yearField.getText()));
		olist.add(tmp);
	}

	public void saveToDB() {
		facade.getAlbumDaoSql().addAll(olist);
	}

	public void getFromDB() {
		
		
	}

}
