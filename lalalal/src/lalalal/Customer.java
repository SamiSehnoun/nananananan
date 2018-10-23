/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lalalal;

/**
 *
 * @author 74155232
 */

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	String nome;
	int eta;
	int id;

	public String getNome() {
		return nome;
	}

	@XmlElement
	public void setNome(String name) {
		this.nome = name;
	}

	public int getEta() {
		return eta;
	}

	@XmlElement
	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getId() {
		return id;
	}

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}

}
