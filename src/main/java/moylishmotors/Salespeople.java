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
import javax.persistence.Lob;
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
@Table(name = "salespeople")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Salespeople.findAll", query = "SELECT s FROM Salespeople s"),
	@NamedQuery(name = "Salespeople.findById", query = "SELECT s FROM Salespeople s WHERE s.id = :id")
})
public class Salespeople implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Lob
    @Size(max = 65535)
    @Column(name = "SalesPerson")
	private String salesPerson;
	@Lob
    @Size(max = 65535)
    @Column(name = "SalesPersonPhone")
	private String salesPersonPhone;
	@Lob
    @Size(max = 65535)
    @Column(name = "SalesPersonEmail")
	private String salesPersonEmail;
	@Lob
    @Size(max = 65535)
    @Column(name = "SalesPersonFax")
	private String salesPersonFax;
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
	@Lob
    @Size(max = 65535)
    @Column(name = "Note")
	private String note;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	public Salespeople()
	{
	}
	public Salespeople(Integer id)
	{
		this.id = id;
	}
	public String getSalesPerson()
	{
		return salesPerson;
	}
	public void setSalesPerson(String salesPerson)
	{
		this.salesPerson = salesPerson;
	}
	public String getSalesPersonPhone()
	{
		return salesPersonPhone;
	}
	public void setSalesPersonPhone(String salesPersonPhone)
	{
		this.salesPersonPhone = salesPersonPhone;
	}
	public String getSalesPersonEmail()
	{
		return salesPersonEmail;
	}
	public void setSalesPersonEmail(String salesPersonEmail)
	{
		this.salesPersonEmail = salesPersonEmail;
	}
	public String getSalesPersonFax()
	{
		return salesPersonFax;
	}
	public void setSalesPersonFax(String salesPersonFax)
	{
		this.salesPersonFax = salesPersonFax;
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
	public String getNote()
	{
		return note;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
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
		if (!(object instanceof Salespeople))
		{
			return false;
		}
		Salespeople other = (Salespeople) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Salespeople[ id=" + id + " ]";
	}
	
}
