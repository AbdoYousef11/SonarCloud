package org.jfree.chart.charts;

import java.awt.Font;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.HighLowRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.data.xy.XYDataset;

public class HighLowChart extends JFreeChart {
    public HighLowChart(String title, Font titleFont, Plot plot, boolean createLegend) {
        super(title, titleFont, plot, createLegend);
    }

    /**
     * Creates and returns a default instance of a high-low-open-close chart.
     *
     * @param title          the chart title ({@code null} permitted).
     * @param timeAxisLabel  a label for the time axis ({@code null}
     *                       permitted).
     * @param valueAxisLabel a label for the value axis ({@code null}
     *                       permitted).
     * @param dataset        the dataset for the chart ({@code null} permitted).
     * @param legend         a flag specifying whether or not a legend is required.
     *
     * @return A high-low-open-close chart.
     */
    public static JFreeChart createHighLowChart(String title,
            String timeAxisLabel, String valueAxisLabel, OHLCDataset dataset,
            boolean legend) {

        ValueAxis timeAxis = new DateAxis(timeAxisLabel);
        NumberAxis valueAxis = new NumberAxis(valueAxisLabel);
        HighLowRenderer renderer = new HighLowRenderer();
        renderer.setDefaultToolTipGenerator(new HighLowItemLabelGenerator());
        XYPlot plot = new XYPlot(dataset, timeAxis, valueAxis, renderer);

        return new HighLowChart(title, JFreeChart.DEFAULT_TITLE_FONT,
                plot, legend);

    }

    @Override
    public JFreeChart createChart(String title, String categoryAxisLabel, String valueAxisLabel,
            DefaultCategoryDataset dataset) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JFreeChart createChart(String title, DefaultPieDataset dataset, Boolean legend, Boolean tooltips,
            Boolean urls) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JFreeChart createChart(String title, String timeAxisLabel, String valueAxisLabel,
            TimeSeriesCollection dataset) {
        // TODO Auto-generated method stub
        return null;
    }

}
