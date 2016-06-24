/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.series;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;
import at.downdrown.vaadinaddons.highchartsapi.model.data.HighChartsData;

import java.util.List;

public class ScatterChartSeries extends HighChartsSeriesImpl {

    public ScatterChartSeries(String name) {
        chartType = ChartType.SCATTER;
        this.name = name;
    }

    public ScatterChartSeries(String name, List<HighChartsData> data) {
        chartType = ChartType.SCATTER;
        this.name = name;
        this.data = data;
    }
	
	
    public void addData(HighChartsData chartData) {
        this.data.add(chartData);
    }
	
    @Deprecated
    public List<HighChartsData> getData() {
        return data;
    }

    @Deprecated
    public void setData(List<HighChartsData> data) {
        this.data = data;
    }

}
