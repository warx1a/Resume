package com.snoopdogg.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Tile implements Drawable {
	
	private final int x, y, width, height;
	
	public Tile(final int x, final int y, final int width, final int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean onMatch(Point pt) {
		// its in the proper x range
		if(pt.x > x && pt.x < x + width) {
			// in the proper y range
			if(pt.y > y && pt.y < y + height) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void draw(Graphics2D g) {
		System.out.println("drawing");
		g.setColor(Color.BLUE);
		g.fillRect(x + 1, y + 1, width - 1, height - 1);
	}

}
