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
	@NamedQuery(name = "Salesstock.findById", query = "SELECT s FROM Salesstock s WHERE s.id = :id"),
	@NamedQuery(name = "Salesstock.findByListingNumber", query = "SELECT s FROM Salesstock s WHERE s.listingNumber = :listingNumber"),
	@NamedQuery(name = "Salesstock.findByBuyPrice", query = "SELECT s FROM Salesstock s WHERE s.buyPrice = :buyPrice"),
	@NamedQuery(name = "Salesstock.findByListPrice", query = "SELECT s FROM Salesstock s WHERE s.listPrice = :listPrice"),
	@NamedQuery(name = "Salesstock.findByOdometerKPH", query = "SELECT s FROM Salesstock s WHERE s.odometerKPH = :odometerKPH"),
	@NamedQuery(name = "Salesstock.findByEngine", query = "SELECT s FROM Salesstock s WHERE s.engine = :engine"),
	@NamedQuery(name = "Salesstock.findByMotorTax", query = "SELECT s FROM Salesstock s WHERE s.motorTax = :motorTax"),
	@NamedQuery(name = "Salesstock.findByPreviousOwners", query = "SELECT s FROM Salesstock s WHERE s.previousOwners = :previousOwners")
})
public class SalesStock implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	@Column(name = "Listing Number")
	private Integer listingNumber;
	@Lob
    @Size(max = 65535)
    @Column(name = "Year")
	private String year;
	@Lob
    @Size(max = 65535)
    @Column(name = "Reg")
	private String reg;
	@Lob
    @Size(max = 65535)
    @Column(name = "Make")
	private String make;
	@Lob
    @Size(max = 65535)
    @Column(name = "Model")
	private String model;
	@Lob
    @Size(max = 65535)
    @Column(name = "Colour")
	private String colour;
	@Lob
    @Size(max = 65535)
    @Column(name = "Description")
	private String description;
	@Column(name = "Buy Price")
	private Integer buyPrice;
	@Column(name = "List Price")
	private Integer listPrice;
	@Column(name = "Odometer (KPH)")
	private Integer odometerKPH;
	@Lob
    @Size(max = 65535)
    @Column(name = "0-62 kph")
	private String kph;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "Engine")
	private Double engine;
	@Lob
    @Size(max = 65535)
    @Column(name = "Fuel")
	private String fuel;
	@Lob
    @Size(max = 65535)
    @Column(name = "Transmission")
	private String transmission;
	@Lob
    @Size(max = 65535)
    @Column(name = "Body")
	private String body;
	@Lob
    @Size(max = 65535)
    @Column(name = "Isofix")
	private String isofix;
	@Column(name = "Motor Tax")
	private Integer motorTax;
	@Column(name = "Previous Owners")
	private Integer previousOwners;
	@Lob
    @Size(max = 65535)
    @Column(name = "Sales Person")
	private String salesPerson;
	@Lob
    @Size(max = 65535)
    @Column(name = "Sales Person Phone")
	private String salesPersonPhone;
	@Lob
    @Size(max = 65535)
    @Column(name = "Sales Person Email")
	private String salesPersonEmail;
	@Lob
    @Size(max = 65535)
    @Column(name = "Sales Person Fax")
	private String salesPersonFax;
	@Lob
    @Size(max = 65535)
    @Column(name = "Last Previous Owners Name")
	private String lastPreviousOwnersName;
	@Lob
    @Size(max = 65535)
    @Column(name = "Last Previous Owner Address")
	private String lastPreviousOwnerAddress;
	@Lob
    @Size(max = 65535)
    @Column(name = "Last Previous Owner Phone")
	private String lastPreviousOwnerPhone;
	@Lob
    @Size(max = 65535)
    @Column(name = "Full Service History")
	private String fullServiceHistory;
	@Lob
    @Size(max = 65535)
    @Column(name = "Note")
	private String note;
	public SalesStock()
	{
	}
	public SalesStock(Integer id)
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
	public String getYear()
	{
		return year;
	}
	public void setYear(String year)
	{
		this.year = year;
	}
	public String getReg()
	{
		return reg;
	}
	public void setReg(String reg)
	{
		this.reg = reg;
	}
	public String getMake()
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
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
	public Integer getOdometerKPH()
	{
		return odometerKPH;
	}
	public void setOdometerKPH(Integer odometerKPH)
	{
		this.odometerKPH = odometerKPH;
	}
	public String getKph()
	{
		return kph;
	}
	public void setKph(String kph)
	{
		this.kph = kph;
	}
	public Double getEngine()
	{
		return engine;
	}
	public void setEngine(Double engine)
	{
		this.engine = engine;
	}
	public String getFuel()
	{
		return fuel;
	}
	public void setFuel(String fuel)
	{
		this.fuel = fuel;
	}
	public String getTransmission()
	{
		return transmission;
	}
	public void setTransmission(String transmission)
	{
		this.transmission = transmission;
	}
	public String getBody()
	{
		return body;
	}
	public void setBody(String body)
	{
		this.body = body;
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
	public Integer getPreviousOwners()
	{
		return previousOwners;
	}
	public void setPreviousOwners(Integer previousOwners)
	{
		this.previousOwners = previousOwners;
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
		if (!(object instanceof SalesStock))
		{
			return false;
		}
		SalesStock other = (SalesStock) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Salesstock[ id=" + id + " ]";
	}
	
}
