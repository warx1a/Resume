package com.warx1a.graphing;

import java.awt.*;

/**
 * Created by WJ001 on 6/14/15.
 */
public abstract class GPainter<T extends GPainter<T>> implements Comparable<GPainter<T>> {

    public final int x,y;

    public GPainter(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(final Graphics2D g);

    public void connectPoints(final Graphics2D g, final GPainter<T> pt_1, final GPainter<T> pt_2){};

    @Override
    public int compareTo(final GPainter<T> pt) {
        if(pt.x < x) {
            return 1;
        } else if( pt.x > x) {
            return -1;
        }
        return 0;
    }

}
