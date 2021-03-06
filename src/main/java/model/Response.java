package model;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response{

	@SerializedName("visibility")
	private int visibility;

	@SerializedName("timezone")
	private int timezone;

	@SerializedName("main")
	private Main main;

	@SerializedName("clouds")
	private Clouds clouds;

	@SerializedName("sys")
	private Sys sys;

	@SerializedName("dt")
	private int dt;

	@SerializedName("coord")
	private Coord coord;

	@SerializedName("weather")
	private List<WeatherItem> weather;

	@SerializedName("name")
	private String name;

	@SerializedName("cod")
	private int cod;

	@SerializedName("id")
	private int id;

	@SerializedName("base")
	private String base;

	@SerializedName("wind")
	private Wind wind;
}