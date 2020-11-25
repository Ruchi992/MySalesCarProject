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
@Table(name = "carpricetable")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Carpricetable.findAll", query = "SELECT c FROM Carpricetable c"),
	@NamedQuery(name = "Carpricetable.findByPriceId", query = "SELECT c FROM Carpricetable c WHERE c.priceId = :priceId"),
	@NamedQuery(name = "Carpricetable.findByBuyPrice", query = "SELECT c FROM Carpricetable c WHERE c.buyPrice = :buyPrice"),
	@NamedQuery(name = "Carpricetable.findByListPrice", query = "SELECT c FROM Carpricetable c WHERE c.listPrice = :listPrice")
})
public class Carpricetable implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PriceId")
	private Integer priceId;
	@Column(name = "Buy Price")
	private Integer buyPrice;
	@Column(name = "List Price")
	private Integer listPrice;
	public Carpricetable()
	{
	}
	public Carpricetable(Integer priceId)
	{
		this.priceId = priceId;
	}
	public Integer getPriceId()
	{
		return priceId;
	}
	public void setPriceId(Integer priceId)
	{
		this.priceId = priceId;
	}
	public Integer getBuyPrice()
	{
		return buyPrice;
	}
	public void setBuyPrice(Integer buyPrice)
	{
		this.buyPrice = buyPrice;
	}
	public Integer getListPrice()
	{
		return listPrice;
	}
	public void setListPrice(Integer listPrice)
	{
		this.listPrice = listPrice;
	}
	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (priceId != null ? priceId.hashCode() : 0);
		return hash;
	}
	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Carpricetable))
		{
			return false;
		}
		Carpricetable other = (Carpricetable) object;
		if ((this.priceId == null && other.priceId != null) || (this.priceId != null && !this.priceId.equals(other.priceId)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Carpricetable[ priceId=" + priceId + " ]";
	}
	
}
