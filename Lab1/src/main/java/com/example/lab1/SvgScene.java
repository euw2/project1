package com.example.lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class SvgScene {
    private List<Polygon> list = new ArrayList<>();

    public void addPolygon(Polygon polygon)
    {
        list.add(polygon);
    }

    public void save(String filepath)
    {
        try
        {
            FileWriter file = new FileWriter(filepath);
            file.write(str: "<html>\n<body>\n<svg width=\" >");
        }
    }

    catch (IOException e)
    {
        e.printStackTrace();
    }
}
