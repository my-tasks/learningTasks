package com.kk.study.buildtools.db;

import java.util.ArrayList;
import java.util.List;

import com.kk.study.buildtools.log.Logger;
import com.kk.study.buildtools.model.Color;
import com.kk.study.buildtools.model.Box;

public class DataBase {

	private static List<Box> coloredBoxes = new ArrayList<Box>();

	static {
		Logger.log("Initializing...");
		Box cb1 = new Box(Color.GREEN, 100, 50, Color.BLACK, 5);
		addColoredBox(cb1);
		Logger.log("ColoredBox is loaded: " + cb1);
		Box cb2 = new Box(Color.RED, 50, 100, Color.BLACK, 5);
		addColoredBox(cb2);
		Logger.log("ColoredBox is loaded: " + cb2);
		Box cb3 = new Box(Color.BLUE, 70, 70, Color.BLACK, 5);
		addColoredBox(cb3);
		Logger.log("ColoredBox is loaded: " + cb3);
		Box cb4 = new Box(Color.BLACK, 50, 120, Color.BLACK, 5);
		addColoredBox(cb4);
		Logger.log("ColoredBox is loaded: " + cb4);
		Box cb5 = new Box(Color.WHITE, 100, 30, Color.BLACK, 5);
		addColoredBox(cb5);
		Logger.log("ColoredBox is loaded: " + cb5);
		Box cb6 = new Box(Color.PURPLE, 70, 50, Color.BLACK, 5);
		addColoredBox(cb6);
		Logger.log("ColoredBox is loaded: " + cb6);
		Box cb7 = new Box(Color.YELLOW, 100, 80, Color.BLACK, 5);
		addColoredBox(cb7);
		Logger.log("ColoredBox is loaded: " + cb7);
		Logger.log("Data Base is initialized");
	}

	public static List<Box> getColoredBoxes() {
		return coloredBoxes;
	}

	public static void addColoredBox(Box coloredBox) {
		coloredBox.setId(coloredBoxes.size());
		coloredBoxes.add(coloredBox);
	}

}
