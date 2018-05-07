package controller;

import model.PartnerDAO;

public class Partner {
	
    // Attributes
    private int idParceiro;
    private int idEndereco;
    private int idUsuario;
    private int idPlanoContratacao;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private int ativo;
    private String socorrista;
    private String email;
    private String telefone;
    private String celular;
    private String fotoPerfil;
    private String logParceiro;
   
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
	public String getSocorrista() {
		return socorrista;
	}
	public void setSocorrista(String socorrista) {
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
	

}
