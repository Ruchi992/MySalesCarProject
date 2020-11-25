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
	@NamedQuery(name = "Salespeople.findByPersonId", query = "SELECT s FROM Salespeople s WHERE s.personId = :personId")
})
public class Salespeople implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PersonId")
	private Integer personId;
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
	public Salespeople()
	{
	}
	public Salespeople(Integer personId)
	{
		this.personId = personId;
	}
	public Integer getPersonId()
	{
		return personId;
	}
	public void setPersonId(Integer personId)
	{
		this.personId = personId;
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
	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (personId != null ? personId.hashCode() : 0);
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
		if ((this.personId == null && other.personId != null) || (this.personId != null && !this.personId.equals(other.personId)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "Salespeople{" + "personId=" + personId + ", salesPerson=" + salesPerson + ", salesPersonPhone=" + salesPersonPhone + ", salesPersonEmail=" + salesPersonEmail + ", salesPersonFax=" + salesPersonFax + '}';
	}
	
	
}
