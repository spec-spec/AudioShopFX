package ua.oa.taras.audio.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Audio {
	@SerializedName("id")
	private final long id;
	
	@SerializedName("name")
	private final String name;
	
	@SerializedName("duration")
	private final int duration;
	
	@SerializedName("price")
	private int price;
	
	@SerializedName("genreId")
	private long genreId;
	
	@SerializedName("authorId")
	private final long authorId;
	
	@Expose
	private Author author;
	
	@Expose
	private Genre genre;
	
	public Audio(long id, String name, long authorId, int duration, int price,
			long genreId) {
		this.id = id;
		this.name = name;
		this.authorId = authorId;
		this.duration = duration;
		this.price = price;
		this.genreId = genreId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getGenre() {
		return genreId;
	}

	public void setGenre(long genre) {
		this.genreId = genre;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getAuthor() {
		return authorId;
	}

	public int getDuration() {
		return duration;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	

}
