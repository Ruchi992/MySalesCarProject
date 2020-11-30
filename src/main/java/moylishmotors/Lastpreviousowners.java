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
@Table(name = "lastpreviousowners")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Lastpreviousowners.findAll", query = "SELECT l FROM Lastpreviousowners l"),
	@NamedQuery(name = "Lastpreviousowners.findByListingNumber", query = "SELECT l FROM Lastpreviousowners l WHERE l.listingNumber = :listingNumber")
})
public class Lastpreviousowners implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ListingNumber")
	private Integer listingNumber;
	@Lob
    @Size(max = 65535)
    @Column(name = "LastPreviousOwnersName")
	private String lastPreviousOwnersName;
	@Lob
    @Size(max = 65535)
    @Column(name = "LastPreviousOwnerAddress")
	private String lastPreviousOwnerAddress;
	@Lob
    @Size(max = 65535)
    @Column(name = "LastPreviousOwnerPhone")
	private String lastPreviousOwnerPhone;
	@Lob
    @Size(max = 65535)
    @Column(name = "FullServiceHistory")
	private String fullServiceHistory;
	public Lastpreviousowners()
	{
	}
	public Lastpreviousowners(Integer listingNumber)
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
	public String getLastPreviousOwnersName()
	{
		return lastPreviousOwnersName;
	}
	public void setLastPreviousOwnersName(String lastPreviousOwnersName)
	{
		this.lastPreviousOwnersName = lastPreviousOwnersName;
	}
	public String getLastPreviousOwnerAddress()
	{
		return lastPreviousOwnerAddress;
	}
	public void setLastPreviousOwnerAddress(String lastPreviousOwnerAddress)
	{
		this.lastPreviousOwnerAddress = lastPreviousOwnerAddress;
	}
	public String getLastPreviousOwnerPhone()
	{
		return lastPreviousOwnerPhone;
	}
	public void setLastPreviousOwnerPhone(String lastPreviousOwnerPhone)
	{
		this.lastPreviousOwnerPhone = lastPreviousOwnerPhone;
	}
	public String getFullServiceHistory()
	{
		return fullServiceHistory;
	}
	public void setFullServiceHistory(String fullServiceHistory)
	{
		this.fullServiceHistory = fullServiceHistory;
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
		if (!(object instanceof Lastpreviousowners))
		{
			return false;
		}
		Lastpreviousowners other = (Lastpreviousowners) object;
		if ((this.listingNumber == null && other.listingNumber != null) || (this.listingNumber != null && !this.listingNumber.equals(other.listingNumber)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Lastpreviousowners[ listingNumber=" + listingNumber + " ]";
	}
	
}
