package com.kk.study.buildtools.comparator;

import java.util.Comparator;

import com.kk.study.buildtools.model.Box;

public class HeightComparator implements Comparator<Box> {

//	@Override
	public int compare(Box cb1, Box cb2) {
		return cb1.getHeight() - cb2.getHeight();
	}

}
