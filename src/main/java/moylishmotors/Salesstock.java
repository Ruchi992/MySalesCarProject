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
@Table(name = "salesstock")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Salesstock.findAll", query = "SELECT s FROM Salesstock s"),
	@NamedQuery(name = "Salesstock.findByStockId", query = "SELECT s FROM Salesstock s WHERE s.stockId = :stockId"),
	@NamedQuery(name = "Salesstock.findByListingNumber", query = "SELECT s FROM Salesstock s WHERE s.listingNumber = :listingNumber"),
	@NamedQuery(name = "Salesstock.findByBuyPrice", query = "SELECT s FROM Salesstock s WHERE s.buyPrice = :buyPrice"),
	@NamedQuery(name = "Salesstock.findByListPrice", query = "SELECT s FROM Salesstock s WHERE s.listPrice = :listPrice"),
	@NamedQuery(name = "Salesstock.findByMotorTax", query = "SELECT s FROM Salesstock s WHERE s.motorTax = :motorTax")
})
public class Salesstock implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "StockId")
	private Integer stockId;
	@Column(name = "ListingNumber")
	private Integer listingNumber;
	@Lob
    @Size(max = 65535)
    @Column(name = "Description")
	private String description;
	@Column(name = "BuyPrice")
	private Integer buyPrice;
	@Column(name = "ListPrice")
	private Integer listPrice;
	@Lob
    @Size(max = 65535)
    @Column(name = "KPH")
	private String kph;
	@Lob
    @Size(max = 65535)
    @Column(name = "Isofix")
	private String isofix;
	@Column(name = "MotorTax")
	private Integer motorTax;
	@Lob
    @Size(max = 65535)
    @Column(name = "Note")
	private String note;
	public Salesstock()
	{
	}
	public Salesstock(Integer stockId)
	{
		this.stockId = stockId;
	}
	public Integer getStockId()
	{
		return stockId;
	}
	public void setStockId(Integer stockId)
	{
		this.stockId = stockId;
	}
	public Integer getListingNumber()
	{
		return listingNumber;
	}
	public void setListingNumber(Integer listingNumber)
	{
		this.listingNumber = listingNumber;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
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
	public String getKph()
	{
		return kph;
	}
	public void setKph(String kph)
	{
		this.kph = kph;
	}
	public String getIsofix()
	{
		return isofix;
	}
	public void setIsofix(String isofix)
	{
		this.isofix = isofix;
	}
	public Integer getMotorTax()
	{
		return motorTax;
	}
	public void setMotorTax(Integer motorTax)
	{
		this.motorTax = motorTax;
	}
	public String getNote()
	{
		return note;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
	@Override
	public int hashCode()
	{
		int hash = 0;
		hash += (stockId != null ? stockId.hashCode() : 0);
		return hash;
	}
	@Override
	public boolean equals(Object object)
	{
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Salesstock))
		{
			return false;
		}
		Salesstock other = (Salesstock) object;
		if ((this.stockId == null && other.stockId != null) || (this.stockId != null && !this.stockId.equals(other.stockId)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "Salesstock{" + "stockId=" + stockId + ", listingNumber=" + listingNumber + ", description=" + description + ", buyPrice=" + buyPrice + ", listPrice=" + listPrice + ", kph=" + kph + ", isofix=" + isofix + ", motorTax=" + motorTax + ", note=" + note + '}';
	}
	
	
}
