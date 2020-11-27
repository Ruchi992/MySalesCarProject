/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@Entity
@Table(name = "userroles")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Userroles.findAll", query = "SELECT u FROM Userroles u"),
	@NamedQuery(name = "Userroles.findByUserID", query = "SELECT u FROM Userroles u WHERE u.userID = :userID"),
	@NamedQuery(name = "Userroles.findByRole", query = "SELECT u FROM Userroles u WHERE u.role = :role")
})
public class Userroles implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userID")
	private Integer userID;
	@Size(max = 45)
    @Column(name = "role")
	private String role;
	public Userroles()
	{
	}
	public Userroles(Integer userID)
	{
		this.userID = userID;
	}
	public Integer getUserID()
	{
		return userID;
	}
	public void setUserID(Integer userID)
	{
		this.userID = userID;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (userID != null ? userID.hashCode() : 0);
		return hash;
	}
	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Userroles))
		{
			return false;
		}
		Userroles other = (Userroles) object;
		if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Userroles[ userID=" + userID + " ]";
	}
	
}
