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
@Table(name = "usertable")
@XmlRootElement
@NamedQueries(
{
	@NamedQuery(name = "Usertable.findAll", query = "SELECT u FROM Usertable u"),
	@NamedQuery(name = "Usertable.findById", query = "SELECT u FROM Usertable u WHERE u.id = :id"),
	@NamedQuery(name = "Usertable.findByFirstName", query = "SELECT u FROM Usertable u WHERE u.firstName = :firstName"),
	@NamedQuery(name = "Usertable.findByLastName", query = "SELECT u FROM Usertable u WHERE u.lastName = :lastName"),
	@NamedQuery(name = "Usertable.findByEmail", query = "SELECT u FROM Usertable u WHERE u.email = :email"),
	@NamedQuery(name = "Usertable.findByPassword", query = "SELECT u FROM Usertable u WHERE u.password = :password")
})
public class Usertable implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	@Size(max = 50)
    @Column(name = "FirstName")
	private String firstName;
	@Size(max = 45)
    @Column(name = "LastName")
	private String lastName;
	// @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
	@Size(max = 45)
    @Column(name = "Email")
	private String email;
	@Size(max = 45)
    @Column(name = "Password")
	private String password;
	public Usertable()
	{
	}
	public Usertable(Integer id)
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
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
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
		if (!(object instanceof Usertable))
		{
			return false;
		}
		Usertable other = (Usertable) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "moylishmotors.Usertable[ id=" + id + " ]";
	}
	
}