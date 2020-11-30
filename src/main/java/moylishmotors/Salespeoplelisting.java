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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
@Entity
@Table(name = "salespeoplelisting")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Salespeoplelisting.findAll", query = "SELECT s FROM Salespeoplelisting s"),
	@NamedQuery(name = "Salespeoplelisting.findByListingNumber", query = "SELECT s FROM Salespeoplelisting s WHERE s.listingNumber = :listingNumber")
})
public class Salespeoplelisting implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ListingNumber")
	private Integer listingNumber;
	@Lob
    @Size(max = 65535)
    @Column(name = "SalesPersonEmail")
	private String salesPersonEmail;
	public Salespeoplelisting()
	{
	}
	public Salespeoplelisting(Integer listingNumber)
	{
		this.listingNumber = listingNumber;
	}
	public Integer getListingNumber()
	{
		return listingNumber;
	}
	public void setListingNumber(Integer listingNumber)
	{
		this.listingNumber = listingNumber;
	}
	public String getSalesPersonEmail()
	{
		return salesPersonEmail;
	}
	public void setSalesPersonEmail(String salesPersonEmail)
	{
		this.salesPersonEmail = salesPersonEmail;
	}
	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (listingNumber != null ? listingNumber.hashCode() : 0);
		return hash;
	}
	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Salespeoplelisting))
		{
			return false;
		}
		Salespeoplelisting other = (Salespeoplelisting) object;
		if ((this.listingNumber == null && other.listingNumber != null) || (this.listingNumber != null && !this.listingNumber.equals(other.listingNumber)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Salespeoplelisting[ listingNumber=" + listingNumber + " ]";
	}
	
}
