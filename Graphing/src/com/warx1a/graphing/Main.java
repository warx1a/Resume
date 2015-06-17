package com.warx1a.graphing;

import java.awt.*;

/**
 * Created by WJ001 on 6/14/15.
 */
public class Main<T extends GPainter<T>> {

    public final GDataTracker<T> points;

    public Main() {
        this.points = new GDataTracker<T>();
    }

    public static void main(String[] args) {
        final Main<GPoint> main = new Main<GPoint>();
        main.points.addPoint(new GPoint(100,100));
        main.points.addPoint(new GPoint(200,100));
        main.points.addPoint(new GPoint(373,158));
        main.points.addPoint(new GPoint(147,298));
        final GGraph graph = new GGraph(new Dimension(700,700), "Time", "Money");
        graph.init();
        graph.drawPoints(main.points);
    }
}
