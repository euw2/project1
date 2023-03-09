package com.example.lab1;

import java.util.Locale;

public class Polygon {
    private Point [] points;
    private Style style;
    Polygon(int nump, Style style){
        points=new Point [nump];
        this.style = style;
    };
    public void setP(int i,Point nw){
    points[i]=nw;
    }
    public void setA(Point []pts){
        points=pts;
    }

    public String toSvg(){
        String s="";
        for(Point p: points){
            s+=p.x+","+p.y+" ";
        }
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style=\"%s\"/>",s, s.style.toSvg());
    }
}
