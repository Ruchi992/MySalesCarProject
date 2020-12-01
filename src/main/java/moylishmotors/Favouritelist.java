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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@Entity
@Table(name = "favouritelist")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Favouritelist.findAll", query = "SELECT f FROM Favouritelist f"),
	@NamedQuery(name = "Favouritelist.findById", query = "SELECT f FROM Favouritelist f WHERE f.id = :id"),
	@NamedQuery(name = "Favouritelist.findByListingNumber", query = "SELECT f FROM Favouritelist f WHERE f.listingNumber = :listingNumber"),
	@NamedQuery(name = "Favouritelist.findByUserId", query = "SELECT f FROM Favouritelist f WHERE f.userId = :userId")
})
public class Favouritelist implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	@Column(name = "listingNumber")
	private Integer listingNumber;
	@Column(name = "userId")
	private Integer userId;
	public Favouritelist()
	{
	}
	public Favouritelist(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getListingNumber()
	{
		return listingNumber;
	}
	public void setListingNumber(Integer listingNumber)
	{
		this.listingNumber = listingNumber;
	}
	public Integer getUserId()
	{
		return userId;
	}
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}
	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}
	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Favouritelist))
		{
			return false;
		}
		Favouritelist other = (Favouritelist) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "Favouritelist{" + "id=" + id + ", listingNumber=" + listingNumber + ", userId=" + userId + '}';
	}
	
	
}
