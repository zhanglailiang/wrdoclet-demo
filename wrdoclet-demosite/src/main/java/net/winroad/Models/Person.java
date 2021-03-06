package net.winroad.Models;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * 人
 * @author AdamsLi
 * @version 0.1
 * @memo init create
 */
@JsonIgnoreProperties({"height", "xIndex"})
public class Person implements Serializable{
	private String name;
	private int age;
	@SuppressWarnings("unused")
	private double weight;
	/**
	 * @egsummary 性别
	 * @egvalue MALE
	 */
	private Gender gender;

	private Color color;
	private double h;
	/**
	 * 是否成人
	 */
	private boolean isAdult;
	private String LOGOURL;
	private int xIndex;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private Address address;
	private List<String> friendNames;
	
	public final static String PET_PHRASE = "MY GOD!";

	/**
	 * @egsummary 兴趣爱好
	 * @egvalue cooking, movie
	 */
	@SuppressFBWarnings(value="SS_SHOULD_BE_STATIC", justification = "just for demo")
	public final String hobby = "hot girl";
	public static String favStar = "Jackie Chen";

	public boolean isAdult() {
		return isAdult;
	}

	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@JsonIgnore
	public String getTEast() {
		return this.name;
	}

	public void setTest(String test) {
		this.name = test;
	}

	@NotEmpty(message = "name 不能为空")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("user_age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@SuppressWarnings("unused")
	@SuppressFBWarnings(value="URF_UNREAD_FIELD", justification = "just for demo")
	private void setW(double weight) {
		this.weight = weight;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String saySomething() {
		return PET_PHRASE;
	}

	public void setHeight(double height) {
		this.h = height;
	}

	public double getHeight() {
		return h;
	}
	
	public String getHobbies() {
		return this.hobby;
	}

	public String getLOGOURL() {
		return LOGOURL;
	}

	@JsonIgnore
	public void setLOGOURL(String lOGOURL) {
		LOGOURL = lOGOURL;
	}

	public int getxIndex() {
		return xIndex;
	}

	public void setxIndex(int xIndex) {
		this.xIndex = xIndex;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getFriendNames() {
		return friendNames;
	}

	public void setFriendNames(List<String> friendNames) {
		this.friendNames = friendNames;
	}
}
