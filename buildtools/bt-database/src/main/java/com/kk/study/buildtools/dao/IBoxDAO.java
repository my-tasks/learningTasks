package com.kk.study.buildtools.dao;

import java.util.List;

import com.kk.study.buildtools.model.Color;
import com.kk.study.buildtools.model.Box;

public interface IBoxDAO {

	List<Box> getAll();

	List<Box> getByColor(Color color);

	List<Box> getByColor(String color);

	List<Box> getByWidth(int width);

	List<Box> getByWidth(int from, int to);

	List<Box> getByHeight(int height);

	List<Box> getByHeight(int from, int to);

	List<Box> getByWidthAndHeight(int fromHeight, int toHeight, int fromWidth, int toWidth);
}
