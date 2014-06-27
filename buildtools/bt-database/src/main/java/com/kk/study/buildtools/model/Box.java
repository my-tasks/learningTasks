package com.kk.study.buildtools.model;

/**
 * @author freeda
 */

public class Box implements Comparable<Box> {
	private int id;
	private Color color;
	private int width;
	private int height;
	private Color borderColor;
	private int borderWidth;

	/**
	 * Default constructor with no parameters
	 */
	public Box() {
	}

	/**
	 * Constructor with parameters but without id parameter. Id will be set when
	 * adding to teh Data Base
	 * 
	 * @param color
	 *            Color enum item describing the color of ColoredBox
	 * @param width
	 *            width of ColoredBox
	 * @param heigth
	 *            heigth of ColoredBox
	 * @param borderColor
	 *            Color enum item color of a border for ColoredBox
	 * @param borderWidth
	 *            width of ColoredBox border in px, 0 if there is no border
	 */

	public Box(Color color, int width, int height, Color borderColor,
			int borderWidth) {
		this.color = color;
		this.width = width;
		this.height = height;
		this.borderColor = borderColor;
		this.borderWidth = borderWidth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	@Override
	public String toString() {
		return "ColoredBox [id=" + id + ", color=" + color + ", width=" + width
				+ ", height=" + height + ", borderColor=" + borderColor
				+ ", borderWidth=" + borderWidth + "]";
	}

//	@Override
	public int compareTo(Box cb) {
		return this.id - cb.id;
	}

}
