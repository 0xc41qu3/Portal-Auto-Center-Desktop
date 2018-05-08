package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import controller.MySql;
import controller.Partner;

public class PartnerDAO {
	
	/**
	 * Get all partners existents into DB
	 * @return ArrayList<Partner> Containing all partners
	 * @return empty ArrayList<Partner> Fail to attempt get partners into DB
	 */
	public ArrayList<Partner> getPartners()
	{
		ArrayList<Partner> partners = new ArrayList<>();
		
		// Open connection to DB
		MySql db = new MySql();
		Connection con = db.openConnection();

		// Select into DB
		String sql = "SELECT * FROM tbl_parceiro";

		try {
			
			// Create the statement
			PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				
			// Execute the query
			ResultSet rs = stmt.executeQuery();
			
			// Verify if rs has records inside itself
			while(rs.next())
			{		
				Partner partner = new Partner(
						rs.getInt("id_parceiro"),
						rs.getInt("id_usuario"),
						rs.getInt("id_endereco"),
						rs.getInt("id_plano_contratacao"),
						rs.getString("nome_fantasia"),
						rs.getString("razao_social"),
						rs.getString("cnpj"),
						rs.getInt("ativo"),
						rs.getInt("socorrista"),
						rs.getString("email"),
						rs.getString("telefone"),
						rs.getString("celular"),
						rs.getString("foto_perfil"),
						rs.getString("logParceiro")
				);
				
				// Add partner into list
			    partners.add(partner);
			}
			
			// close connection to DB
			con.close();
			
			return partners;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return partners;
		}
	}
	
	/**
	 * Get partners amount existents into DB
	 * @return int Partner amount
	 * Obs.: Returns -1 if it got some problem during attempt to get data
	 */
	public int getPartnersAmount()
	{
		int response = -1;
		
		// Open connection to DB
		MySql db = new MySql();
		Connection con = db.openConnection();

		// Select into DB
		String sql = "SELECT COUNT(*) AS qtd_parceiros FROM tbl_parceiro";

		try {
			
			// Create the statement
			PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				
			// Execute the query
			ResultSet rs = stmt.executeQuery();
			
			// Verify if rs has records inside itself
			if(rs.next())
			{		
			    response = rs.getInt("qtd_parceiros");
			}
			
			// close connection to DB
			con.close();
			
			return response;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return response;
		}
	}
	
	/**
	 * Get active partners amount existents into DB
	 * @return int Partner amount
	 * Obs.: Returns -1 if it got some problem during attempt to get data
	 */
	public int getActivePartnersAmount()
	{
		int response = -1;
		
		// Open connection to DB
		MySql db = new MySql();
		Connection con = db.openConnection();

		// Select into DB
		String sql = "SELECT COUNT(*) AS ativos FROM tbl_parceiro WHERE ativo = 1";

		try {
			
			// Create the statement
			PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				
			// Execute the query
			ResultSet rs = stmt.executeQuery();
			
			// Verify if rs has records inside itself
			if(rs.next())
			{		
			    response = rs.getInt("ativos");
			}
			
			// close connection to DB
			con.close();
			
			return response;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return response;
		}
	}
	
	/**
	 * Get inactive partners amount existents into DB
	 * @return int Partner amount
	 * Obs.: Returns -1 if it got some problem during attempt to get data
	 */
	public int getInactivePartnersAmount()
	{
		int response = -1;
		
		// Open connection to DB
		MySql db = new MySql();
		Connection con = db.openConnection();

		// Select into DB
		String sql = "SELECT COUNT(*) AS inativos FROM tbl_parceiro WHERE ativo = 0";

		try {
			
			// Create the statement
			PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
				
			// Execute the query
			ResultSet rs = stmt.executeQuery();
			
			// Verify if rs has records inside itself
			if(rs.next())
			{		
			    response = rs.getInt("inativos");
			}
			
			// close connection to DB
			con.close();
			
			return response;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return response;
		}
	}
	

}
