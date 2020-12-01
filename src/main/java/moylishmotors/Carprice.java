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
@Table(name = "carprice")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Carprice.findAll", query = "SELECT c FROM Carprice c"),
	@NamedQuery(name = "Carprice.findByPriceId", query = "SELECT c FROM Carprice c WHERE c.priceId = :priceId"),
	@NamedQuery(name = "Carprice.findByBuyPrice", query = "SELECT c FROM Carprice c WHERE c.buyPrice = :buyPrice"),
	@NamedQuery(name = "Carprice.findByListPrice", query = "SELECT c FROM Carprice c WHERE c.listPrice = :listPrice")
})
public class Carprice implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PriceId")
	private Integer priceId;
	@Column(name = "BuyPrice")
	private Integer buyPrice;
	@Column(name = "ListPrice")
	private Integer listPrice;
	public Carprice()
	{
	}
	public Carprice(Integer priceId)
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
		if (!(object instanceof Carprice))
		{
			return false;
		}
		Carprice other = (Carprice) object;
		if ((this.priceId == null && other.priceId != null) || (this.priceId != null && !this.priceId.equals(other.priceId)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Carprice[ priceId=" + priceId + " ]";
	}
	
}
