package com.xw.ws.server.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author wjx 2016年9月28日 上午11:07:48
 *
 */
// 控制字段或属性的序列化。FIELD表示JAXB将自动绑定Java类中的每个非静态的（static）、非瞬态的（由@XmlTransient标
// 注）字段到XML
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "book", // 节点名字
propOrder = { "name", "author", "price" }) // 指定xml的序列化顺序
public class Book {
	@XmlAttribute // 配置id 为 xml节点 book 的属性
	private Integer id;
	@XmlElement(name = "name", required = true) //配置该字段为节点名字 为name,require
												// 配置是否是必须出现的，字段不写注释不写就默认序列化为节点，
	private String name;
	@XmlElement
	private String author;
	@XmlElement
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}