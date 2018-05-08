package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.PartnerDAO;

public class Partner {
	
	// Get fields from window
	@FXML TableView<Partner> tblPartners;
	@FXML TableColumn<Partner, String> colPartnerId;
	@FXML TableColumn<Partner, String> colPartnerCompanyName;
	@FXML TableColumn<Partner, String> colPartnerSubscription;
	@FXML TableColumn<Partner, String> colPartnershipDate;
	@FXML TableColumn<Partner, String> colPartnerEmail;
	@FXML TableColumn<Partner, String> colPartnerStatus;
	
    // Attributes
    private int idParceiro;
    private int idEndereco;
    private int idUsuario;
    private int idPlanoContratacao;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private int ativo;
    private int socorrista;
    private String email;
    private String telefone;
    private String celular;
    private String fotoPerfil;
    private String logParceiro;
        
    // Constructors
    public Partner(){}
    
    public Partner
    (
		int idParceiro,
		int idEndereco,
		int idUsuario,
		int idPlanoContratacao,
		String nomeFantasia,
		String razaoSocial,
	    String cnpj,
	    int ativo,
	    int socorrista,
	    String email,
	    String telefone,
	    String celular,
	    String fotoPerfil,
	    String logParceiro
    )
    {
    	this.idParceiro = idParceiro;
    	this.idEndereco = idEndereco;
    	this.idUsuario = idUsuario;
    	this.idPlanoContratacao = idPlanoContratacao;
    	this.nomeFantasia = nomeFantasia;
    	this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.ativo = ativo;
		this.socorrista = socorrista;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.fotoPerfil = fotoPerfil;
		this.logParceiro = logParceiro;
    }
   //  ___________________________________________________><
   
	public int getIdParceiro() {
		return idParceiro;
	}
	public void setIdParceiro(int idParceiro) {
		this.idParceiro = idParceiro;
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdPlanoContratacao() {
		return idPlanoContratacao;
	}
	public void setIdPlanoContratacao(int idPlanoContratacao) {
		this.idPlanoContratacao = idPlanoContratacao;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getAtivo() {
		return ativo;
	}
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	public int getSocorrista() {
		return socorrista;
	}
	public void setSocorrista(int socorrista) {
		this.socorrista = socorrista;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getFotoPerfil() {
		return fotoPerfil;
	}
	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}
	public String getLogParceiro() {
		return logParceiro;
	}
	public void setLogParceiro(String logParceiro) {
		this.logParceiro = logParceiro;
	}
	   
	  
	/**
	 * Get employee amount existents into DB
	 * @return int Employee amount
	 * Obs.: Returns -1 if it got some problem during attempt to get data
	 */
	static public int getPartnersAmount()
	{
		PartnerDAO partnerDAO = new PartnerDAO();
		return partnerDAO.getPartnersAmount();
	}
   
	/**
	 * Get active partners amount existents into DB
	 * @return int Partner amount
	 * Obs.: Returns -1 if it got some problem during attempt to get data
	 */
	static public int getActivePartnersAmount()
	{
		PartnerDAO partnerDAO = new PartnerDAO();
		return partnerDAO.getActivePartnersAmount();
	}
   
	/**
	 * Get inactive partners amount existents into DB
	 * @return int Partner amount
	 * Obs.: Returns -1 if it got some problem during attempt to get data
	 */
	static public int getInactivePartnersAmount()
	{
		PartnerDAO partnerDAO = new PartnerDAO();
		return partnerDAO.getInactivePartnersAmount();
	}
	
	/**
	 * Get all partners existents into DB
	 * @return ArrayList<Partner> Containing all partners
	 * @return empty ArrayList<Partner> Fail to attempt get partners into DB
	 */
	public ArrayList<Partner> getPartners()
	{
		PartnerDAO partnerDAO = new PartnerDAO();
		return partnerDAO.getPartners();
	}
	
	// ******************* CONTROLLER *******************
	@FXML public void initialize()
	{
//		for(Partner partner : this.getPartners())
//		{
			colPartnerId.setCellValueFactory(new PropertyValueFactory<Partner,String>("idParceiro"));
			colPartnerEmail.setCellValueFactory(new PropertyValueFactory<Partner,String>("email"));
			colPartnerCompanyName.setCellValueFactory(new PropertyValueFactory<Partner,String>("razaoSocial"));
			colPartnershipDate.setCellValueFactory(new PropertyValueFactory<Partner,String>("logParceiro"));
			colPartnerStatus.setCellValueFactory(new PropertyValueFactory<Partner,String>("ativo"));
			colPartnerSubscription.setCellValueFactory(new PropertyValueFactory<Partner,String>("idPlanoContratacao"));
			
			ArrayList<Partner> partners = this.getPartners();
			
			tblPartners.setItems(FXCollections.observableArrayList(partners));
//		}
	}
	// **************************************************
		

}
