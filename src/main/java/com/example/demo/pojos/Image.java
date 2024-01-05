package com.example.demo.pojos;
// Generated 20 Sep, 2022 5:56:57 PM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Image generated by hbm2java
 */
@Entity
@Table(name = "image", catalog = "computersikho")
public class Image implements java.io.Serializable {

	private int imageId;
	private int album;
	private String imagePath;
	private Boolean imageIsActive;
	private Boolean isAlbumCover;

	public Image() {
	}

	public Image(int imageId, int album, String imagePath) {
		this.imageId = imageId;
		this.album = album;
		this.imagePath = imagePath;
	}

	public Image(int imageId, int album, String imagePath, Boolean imageIsActive, Boolean isAlbumCover) {
		this.imageId = imageId;
		this.album = album;
		this.imagePath = imagePath;
		this.imageIsActive = imageIsActive;
		this.isAlbumCover = isAlbumCover;
	}

	@Id

	@Column(name = "image_id", unique = true, nullable = false)
	public int getImageId() {
		return this.imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "album_id", nullable = false)
	public int getAlbum() {
		return this.album;
	}

	public void setAlbum(int album) {
		this.album = album;
	}

	@Column(name = "image_path", nullable = false, length = 200)
	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Column(name = "image_is_active")
	public Boolean getImageIsActive() {
		return this.imageIsActive;
	}

	public void setImageIsActive(Boolean imageIsActive) {
		this.imageIsActive = imageIsActive;
	}

	@Column(name = "is_album_cover")
	public Boolean getIsAlbumCover() {
		return this.isAlbumCover;
	}

	public void setIsAlbumCover(Boolean isAlbumCover) {
		this.isAlbumCover = isAlbumCover;
	}

}