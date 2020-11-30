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
@Table(name = "cartable")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Cartable.findAll", query = "SELECT c FROM Cartable c"),
	@NamedQuery(name = "Cartable.findByListingNumber", query = "SELECT c FROM Cartable c WHERE c.listingNumber = :listingNumber"),
	@NamedQuery(name = "Cartable.findByEngine", query = "SELECT c FROM Cartable c WHERE c.engine = :engine"),
	@NamedQuery(name = "Cartable.findByOdometerKPH", query = "SELECT c FROM Cartable c WHERE c.odometerKPH = :odometerKPH"),
	@NamedQuery(name = "Cartable.findById", query = "SELECT c FROM Cartable c WHERE c.id = :id")
})
public class Cartable implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Column(name = "ListingNumber")
	private Integer listingNumber;
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
    @Column(name = "Year")
	private String year;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "Engine")
	private Double engine;
	@Lob
    @Size(max = 65535)
    @Column(name = "Body")
	private String body;
	@Lob
    @Size(max = 65535)
    @Column(name = "Fuel")
	private String fuel;
	@Column(name = "OdometerKPH")
	private Integer odometerKPH;
	@Lob
    @Size(max = 65535)
    @Column(name = "Transmission")
	private String transmission;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	public Cartable()
	{
	}
	public Cartable(Integer id)
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
	public String getYear()
	{
		return year;
	}
	public void setYear(String year)
	{
		this.year = year;
	}
	public Double getEngine()
	{
		return engine;
	}
	public void setEngine(Double engine)
	{
		this.engine = engine;
	}
	public String getBody()
	{
		return body;
	}
	public void setBody(String body)
	{
		this.body = body;
	}
	public String getFuel()
	{
		return fuel;
	}
	public void setFuel(String fuel)
	{
		this.fuel = fuel;
	}
	public Integer getOdometerKPH()
	{
		return odometerKPH;
	}
	public void setOdometerKPH(Integer odometerKPH)
	{
		this.odometerKPH = odometerKPH;
	}
	public String getTransmission()
	{
		return transmission;
	}
	public void setTransmission(String transmission)
	{
		this.transmission = transmission;
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
		if (!(object instanceof Cartable))
		{
			return false;
		}
		Cartable other = (Cartable) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}
	
}
