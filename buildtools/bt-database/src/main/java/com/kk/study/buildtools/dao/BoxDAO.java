package com.kk.study.buildtools.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kk.study.buildtools.comparator.HeightComparator;
import com.kk.study.buildtools.comparator.WidthComparator;
import com.kk.study.buildtools.db.DataBase;
import com.kk.study.buildtools.log.Logger;
import com.kk.study.buildtools.model.Color;
import com.kk.study.buildtools.model.Box;

public class BoxDAO implements IBoxDAO {
	private List<Box> db = new ArrayList<Box>();
	private TreeSet<Box> sortedByWidth = new TreeSet<Box>(new WidthComparator());
	private TreeSet<Box> sortedByHeight = new TreeSet<Box>(
			new HeightComparator());

	{
		db.addAll(DataBase.getColoredBoxes());
		sortedByWidth.addAll(db);
		sortedByHeight.addAll(db);
	}

	// @Override
	public List<Box> getAll() {
		Logger.log("Request for all ColoredBoxes is processed successfully");
		return db;
	}

	// @Override
	public List<Box> getByColor(Color color) {
		List<Box> list = new ArrayList<Box>();
		for (Box cb : db) {
			if (cb.getColor().equals(color)) {
				list.add(cb);
			}
		}
		return list;
	}

	// @Override
	public List<Box> getByColor(String color) {
		List<Box> list = new ArrayList<Box>();
		for (Box cb : db) {
			Color c = Color.valueOf(color.toUpperCase());
			if (cb.getColor().equals(c)) {
				list.add(cb);
			}
		}
		return list;
	}

	// @Override
	public List<Box> getByWidth(int width) {
		List<Box> list = new ArrayList<Box>();
		Box cb = new Box();
		cb.setWidth(width);
		list.addAll(sortedByHeight.subSet(cb, true, cb, true));
		return list;
	}

	public Set<Box> getByWidth(int width, Class<Set> clazz) {
		Box cb = new Box();
		cb.setWidth(width);
		return sortedByHeight.subSet(cb, true, cb, true);
	}

	// @Override
	public List<Box> getByWidth(int from, int to) {
		List<Box> list = new ArrayList<Box>();
		Box fromCb = new Box();
		fromCb.setWidth(from);
		Box toCb = new Box();
		toCb.setWidth(to);
		list.addAll(sortedByHeight.subSet(fromCb, true, toCb, true));
		return list;
	}

	public Set<Box> getByWidth(int from, int to, Class<Set> clazz) {
		Box fromCb = new Box();
		fromCb.setWidth(from);
		Box toCb = new Box();
		toCb.setWidth(to);
		return sortedByHeight.subSet(fromCb, true, toCb, true);
	}

	// @Override
	public List<Box> getByHeight(int height) {
		List<Box> list = new ArrayList<Box>();
		Box cb = new Box();
		cb.setHeight(height);
		list.addAll(sortedByHeight.subSet(cb, true, cb, true));
		return list;
	}

	public Set<Box> getByHeight(int height, Class<Set> clazz) {
		Box cb = new Box();
		cb.setHeight(height);
		return sortedByWidth.subSet(cb, true, cb, true);
	}

	// @Override
	public List<Box> getByHeight(int from, int to) {
		List<Box> list = new ArrayList<Box>();
		Box fromCb = new Box();
		fromCb.setHeight(from);
		Box toCb = new Box();
		toCb.setHeight(to);
		list.addAll(sortedByHeight.subSet(fromCb, true, toCb, true));
		return list;
	}

	public Set<Box> getByHeight(int from, int to, Class<Set> clazz) {
		Box fromCb = new Box();
		fromCb.setHeight(from);
		Box toCb = new Box();
		toCb.setHeight(to);
		return sortedByWidth.subSet(fromCb, true, toCb, true);
	}

	// @Override
	public List<Box> getByWidthAndHeight(int fromWidth, int toWidth,
			int fromHeight, int toHeight) {
		List<Box> list = new ArrayList<Box>();
		Set<Box> set1 = getByWidth(fromWidth, toWidth, Set.class);
		Set<Box> set2 = getByHeight(fromHeight, toHeight, Set.class);
		set1.retainAll(set2);
		list.addAll(set1);
		return list;
	}
}
