/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "sheet1")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Sheet1.findAll", query = "SELECT s FROM Sheet1 s"),
	@NamedQuery(name = "Sheet1.findByListingNumber", query = "SELECT s FROM Sheet1 s WHERE s.listingNumber = :listingNumber"),
	@NamedQuery(name = "Sheet1.findByYear", query = "SELECT s FROM Sheet1 s WHERE s.year = :year"),
	@NamedQuery(name = "Sheet1.findByReg", query = "SELECT s FROM Sheet1 s WHERE s.reg = :reg"),
	@NamedQuery(name = "Sheet1.findByMake", query = "SELECT s FROM Sheet1 s WHERE s.make = :make"),
	@NamedQuery(name = "Sheet1.findByModel", query = "SELECT s FROM Sheet1 s WHERE s.model = :model"),
	@NamedQuery(name = "Sheet1.findByColour", query = "SELECT s FROM Sheet1 s WHERE s.colour = :colour"),
	@NamedQuery(name = "Sheet1.findByDescription", query = "SELECT s FROM Sheet1 s WHERE s.description = :description"),
	@NamedQuery(name = "Sheet1.findByBuyPrice", query = "SELECT s FROM Sheet1 s WHERE s.buyPrice = :buyPrice"),
	@NamedQuery(name = "Sheet1.findByListPrice", query = "SELECT s FROM Sheet1 s WHERE s.listPrice = :listPrice"),
	@NamedQuery(name = "Sheet1.findByOdometerKPH", query = "SELECT s FROM Sheet1 s WHERE s.odometerKPH = :odometerKPH"),
	@NamedQuery(name = "Sheet1.findByKph", query = "SELECT s FROM Sheet1 s WHERE s.kph = :kph"),
	@NamedQuery(name = "Sheet1.findByEngine", query = "SELECT s FROM Sheet1 s WHERE s.engine = :engine"),
	@NamedQuery(name = "Sheet1.findByFuel", query = "SELECT s FROM Sheet1 s WHERE s.fuel = :fuel"),
	@NamedQuery(name = "Sheet1.findByTransmission", query = "SELECT s FROM Sheet1 s WHERE s.transmission = :transmission"),
	@NamedQuery(name = "Sheet1.findByBody", query = "SELECT s FROM Sheet1 s WHERE s.body = :body"),
	@NamedQuery(name = "Sheet1.findByIsofix", query = "SELECT s FROM Sheet1 s WHERE s.isofix = :isofix"),
	@NamedQuery(name = "Sheet1.findByMotorTax", query = "SELECT s FROM Sheet1 s WHERE s.motorTax = :motorTax"),
	@NamedQuery(name = "Sheet1.findByPreviousOwners", query = "SELECT s FROM Sheet1 s WHERE s.previousOwners = :previousOwners"),
	@NamedQuery(name = "Sheet1.findBySalesPerson", query = "SELECT s FROM Sheet1 s WHERE s.salesPerson = :salesPerson"),
	@NamedQuery(name = "Sheet1.findBySalesPersonPhone", query = "SELECT s FROM Sheet1 s WHERE s.salesPersonPhone = :salesPersonPhone"),
	@NamedQuery(name = "Sheet1.findBySalesPersonEmail", query = "SELECT s FROM Sheet1 s WHERE s.salesPersonEmail = :salesPersonEmail"),
	@NamedQuery(name = "Sheet1.findBySalesPersonFax", query = "SELECT s FROM Sheet1 s WHERE s.salesPersonFax = :salesPersonFax"),
	@NamedQuery(name = "Sheet1.findByLastPreviousOwnersName", query = "SELECT s FROM Sheet1 s WHERE s.lastPreviousOwnersName = :lastPreviousOwnersName"),
	@NamedQuery(name = "Sheet1.findByLastPreviousOwnerAddress", query = "SELECT s FROM Sheet1 s WHERE s.lastPreviousOwnerAddress = :lastPreviousOwnerAddress"),
	@NamedQuery(name = "Sheet1.findByLastPreviousOwnerPhone", query = "SELECT s FROM Sheet1 s WHERE s.lastPreviousOwnerPhone = :lastPreviousOwnerPhone"),
	@NamedQuery(name = "Sheet1.findByFullServiceHistory", query = "SELECT s FROM Sheet1 s WHERE s.fullServiceHistory = :fullServiceHistory"),
	@NamedQuery(name = "Sheet1.findByNote", query = "SELECT s FROM Sheet1 s WHERE s.note = :note"),
	@NamedQuery(name = "Sheet1.findById", query = "SELECT s FROM Sheet1 s WHERE s.id = :id")
})
public class Sheet1 implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Column(name = "Listing Number")
	private Integer listingNumber;
	@Size(max = 10)
    @Column(name = "Year")
	private String year;
	@Size(max = 12)
    @Column(name = "Reg")
	private String reg;
	@Size(max = 13)
    @Column(name = "Make")
	private String make;
	@Size(max = 40)
    @Column(name = "Model")
	private String model;
	@Size(max = 19)
    @Column(name = "Colour")
	private String colour;
	@Size(max = 1012)
    @Column(name = "Description")
	private String description;
	@Column(name = "Buy Price")
	private Integer buyPrice;
	@Column(name = "List Price")
	private Integer listPrice;
	@Column(name = "Odometer (KPH)")
	private Integer odometerKPH;
	@Size(max = 18)
    @Column(name = "0-62 kph")
	private String kph;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "Engine")
	private BigDecimal engine;
	@Size(max = 8)
    @Column(name = "Fuel")
	private String fuel;
	@Size(max = 9)
    @Column(name = "Transmission")
	private String transmission;
	@Size(max = 11)
    @Column(name = "Body")
	private String body;
	@Size(max = 3)
    @Column(name = "Isofix")
	private String isofix;
	@Size(max = 4)
    @Column(name = "Motor Tax")
	private String motorTax;
	@Column(name = "Previous Owners")
	private Integer previousOwners;
	@Size(max = 14)
    @Column(name = "Sales Person")
	private String salesPerson;
	@Size(max = 10)
    @Column(name = "Sales Person Phone")
	private String salesPersonPhone;
	@Size(max = 10)
    @Column(name = "Sales Person Email")
	private String salesPersonEmail;
	@Size(max = 10)
    @Column(name = "Sales Person Fax")
	private String salesPersonFax;
	@Size(max = 21)
    @Column(name = "Last Previous Owners Name")
	private String lastPreviousOwnersName;
	@Size(max = 76)
    @Column(name = "Last Previous Owner Address")
	private String lastPreviousOwnerAddress;
	@Size(max = 11)
    @Column(name = "Last Previous Owner Phone")
	private String lastPreviousOwnerPhone;
	@Size(max = 1)
    @Column(name = "Full Service History")
	private String fullServiceHistory;
	@Size(max = 90)
    @Column(name = "Note")
	private String note;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	public Sheet1()
	{
	}
	public Sheet1(Integer id)
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
	public BigDecimal getEngine()
	{
		return engine;
	}
	public void setEngine(BigDecimal engine)
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
	public String getMotorTax()
	{
		return motorTax;
	}
	public void setMotorTax(String motorTax)
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
		if (!(object instanceof Sheet1))
		{
			return false;
		}
		Sheet1 other = (Sheet1) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "Sheet1{" + "listingNumber=" + listingNumber + ", year=" + year + ", reg=" + reg + ", make=" + make + ", model=" + model + ", colour=" + colour + ", description=" + description + ", buyPrice=" + buyPrice + ", listPrice=" + listPrice + ", odometerKPH=" + odometerKPH + ", kph=" + kph + ", engine=" + engine + ", fuel=" + fuel + ", transmission=" + transmission + ", body=" + body + ", isofix=" + isofix + ", motorTax=" + motorTax + ", previousOwners=" + previousOwners + ", salesPerson=" + salesPerson + ", salesPersonPhone=" + salesPersonPhone + ", salesPersonEmail=" + salesPersonEmail + ", salesPersonFax=" + salesPersonFax + ", lastPreviousOwnersName=" + lastPreviousOwnersName + ", lastPreviousOwnerAddress=" + lastPreviousOwnerAddress + ", lastPreviousOwnerPhone=" + lastPreviousOwnerPhone + ", fullServiceHistory=" + fullServiceHistory + ", note=" + note + ", id=" + id + '}';
	}
	
	
}
