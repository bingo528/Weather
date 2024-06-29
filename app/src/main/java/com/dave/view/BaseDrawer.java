package com.dave.view;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;

import com.dave.util.UiUtil;

public abstract class BaseDrawer {
	static final String TAG = BaseDrawer.class.getSimpleName();
	protected Context context;
	//	private float curPercent = 0f;
	private final float desity;
	protected int width, height;
	private GradientDrawable skyDrawable;
	protected final boolean isNight;

	public BaseDrawer(Context context, boolean isNight) {
		super();
		this.context = context;
		this.desity = context.getResources().getDisplayMetrics().density;
		this.isNight = isNight;
	}

}
