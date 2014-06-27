package com.kk.study.buildtools.comparator;

import java.util.Comparator;

import com.kk.study.buildtools.model.Box;

public class WidthComparator implements Comparator<Box> {

//	@Override
	public int compare(Box cb1, Box cb2) {
		return cb1.getWidth() - cb2.getWidth();
	}

}
