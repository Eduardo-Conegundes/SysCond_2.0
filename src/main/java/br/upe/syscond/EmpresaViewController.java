package br.upe.syscond;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EmpresaViewController implements Initializable{

    @FXML
    private Label lblId;

    @FXML
    private TextField txfId;

    @FXML
    private TextField txfCnpj;

    @FXML
    private TextField txfNome;

    @FXML
    private Label lblTel;

    @FXML
    private TextField txfTelefone;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblCnpj;

    @FXML
    private TableView<?> tableEmpresa;

    @FXML
    private TableColumn<?, ?> TableIdEmpresa;

    @FXML
    private TableColumn<?, ?> TableCnpj;

    @FXML
    private TableColumn<?, ?> TableNome;

    @FXML
    private TableColumn<?, ?> Tabletelefone;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnListaProdServ;

    @FXML
    void EditarEmpresa(MouseEvent event) {

    }

    @FXML
    void ExcluirEmpresa(MouseEvent event) {

    }

    @FXML
    void MostrarProdServ(MouseEvent event) {

    }

    @FXML
    void salvarEmpresa(MouseEvent event) {

    }

    @FXML
    void switchMain(MouseEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
