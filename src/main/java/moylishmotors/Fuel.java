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
@Table(name = "fuel")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Fuel.findAll", query = "SELECT f FROM Fuel f"),
	@NamedQuery(name = "Fuel.findByFuel", query = "SELECT f FROM Fuel f WHERE f.fuel = :fuel"),
	@NamedQuery(name = "Fuel.findById", query = "SELECT f FROM Fuel f WHERE f.id = :id")
})
public class Fuel implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Size(max = 50)
    @Column(name = "Fuel")
	private String fuel;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	public Fuel()
	{
	}
	public Fuel(Integer id)
	{
		this.id = id;
	}
	public String getFuel()
	{
		return fuel;
	}
	public void setFuel(String fuel)
	{
		this.fuel = fuel;
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
		if (!(object instanceof Fuel))
		{
			return false;
		}
		Fuel other = (Fuel) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Fuel[ id=" + id + " ]";
	}
	
}
