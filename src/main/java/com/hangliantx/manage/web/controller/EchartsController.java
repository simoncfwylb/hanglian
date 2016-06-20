package com.hangliantx.manage.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hangliantx.common.pojo.echarts.Axis;
import com.hangliantx.common.pojo.echarts.AxisLabel;
import com.hangliantx.common.pojo.echarts.Legend;
import com.hangliantx.common.pojo.echarts.Option;
import com.hangliantx.common.pojo.echarts.Series;
import com.hangliantx.common.pojo.echarts.Tooltip;
import com.hangliantx.common.pojo.echarts.enums.AxisType;
import com.hangliantx.common.pojo.echarts.enums.SeriesType;
import com.hangliantx.common.pojo.echarts.enums.Trigger;
import com.hangliantx.common.vo.JsonResult;

/**
 * 报表显示
 * @author changf 2016-4-20 下午2:38:20
 *
 */
@Controller
@RequestMapping("/echart")
public class EchartsController {

	@RequestMapping(value="/e1",method= RequestMethod.POST)
	@ResponseBody
	public JsonResult sss(HttpServletResponse  response
			,HttpServletRequest  request){
		//重构代码
		//设置图例
		List<String> legendDataValues=new ArrayList<String>();
		legendDataValues.add("华山高度(km)与气温(°C)变化关系");
		legendDataValues.add("高度(ml)与气温(°C)变化关系");
		//
		List<String> legendDatas=new ArrayList<String>();
		for (String legendDataValue : legendDataValues) {
			legendDatas.add(legendDataValue);
		}
		//设置提示
		Tooltip tooltip=new Tooltip();
		//tooltip.setFormatter("Temperature : <br/>{b}km : {c}°C");
		//设置value值数组
		List<Series> seriess=new ArrayList<Series>();
		List<String>   seriesDataValues=Arrays.asList("11","12","14","-12","31","42","-11","-5");
		wrapSeries(seriess,"华山高度(km)与气温(°C)变化关系",seriesDataValues,SeriesType.line);
		List<String>   seriesDataValues2=Arrays.asList("15","0.9","-6.5","6.5","2.1","24.5","11","-5.2");
		wrapSeries(seriess,"高度(ml)与气温(°C)变化关系",seriesDataValues2,SeriesType.line,"1","");
		
		Axis xAxis = wrapAxis("{value} °C","温度",AxisType.value);
		Axis xAxis2 = wrapAxis("{value} ml","雨量",AxisType.value);
		List<String>   categoryDatas=Arrays.asList("10","20","30","40","50","60","70","80");
		//List<String>   categoryDatas2=Arrays.asList("110","220","320","420","502","620","720","820");
		Axis yAxis = wrapCategoryAxis("{value} km","山高",AxisType.category,categoryDatas);
		//Axis yAxis2 = wrapCategoryAxis("{value} km1","山高222",AxisType.category,categoryDatas2);
		List<Axis> xAxiss=new ArrayList<Axis>();
		List<Axis> yAxiss=new ArrayList<Axis>();
		xAxiss.add(xAxis);
		xAxiss.add(xAxis2);
		yAxiss.add(yAxis);
		//yAxiss.add(yAxis2);
		Option data = wrapOption(legendDatas,tooltip,seriess,xAxiss,yAxiss);
		JsonResult jsonResult = new JsonResult(200,"Success",data);
		return jsonResult;
		//JsonResult.ok(getData());
	}
	/**
	 * 
	 * @param seriess          
	 * @param seriesName       name值
	 * @param seriesDataValues data数组值
	 * @param seriesType       line bar
	 * @param xaxisIndex
	 * @param yaxisIndex
	 */
	public void wrapSeries(List<Series> seriess,String seriesName,List<String> seriesDataValues,SeriesType seriesType
			,String xaxisIndex,String yaxisIndex){
		Series series=new Series();
		series.setName(seriesName);
		series.setType(seriesType);
		if(StringUtils.isNotEmpty(xaxisIndex))
		series.setxAxisIndex(xaxisIndex);
		if(StringUtils.isNotEmpty(yaxisIndex))
		series.setyAxisIndex(yaxisIndex);
		List<String> seriesDatas=new ArrayList<String>();
		for (String seriesDataValue : seriesDataValues) {
			seriesDatas.add(seriesDataValue);
		}
		series.setData(seriesDatas);
		seriess.add(series);
	}
	
	/**
	 * 默认类型
	 * @param seriess
	 * @param seriesName
	 * @param seriesDataValues
	 */
	public void wrapSeries(List<Series> seriess,String seriesName,List<String> seriesDataValues){
		wrapSeries(seriess,seriesName,seriesDataValues,SeriesType.line,"","");
	}
	
	/**
	 * 设置类型
	 * @param seriess
	 * @param seriesName
	 * @param seriesDataValues
	 * @param seriesType
	 */
	public void wrapSeries(List<Series> seriess,String seriesName,List<String> seriesDataValues,SeriesType seriesType){
		wrapSeries(seriess,seriesName,seriesDataValues,seriesType,"","");
	}
	
	/**
	 *  封装Axis 
	 * @param formater  "{value} °C"
	 * @param name      坐标标题
	 * @param axisType  value category   
	 */
	public Axis wrapAxis(String formater,String name,AxisType axisType){
		Axis axis=new Axis();
		AxisLabel xlabel=new AxisLabel();
		xlabel.setFormatter(formater);
		axis.setAxisLabel(xlabel);
		axis.setType(axisType);
		axis.setName(name);
		return axis;
	}
	
	/**
	 * 设置品类
	 * @param formater
	 * @param name       坐标标题
	 * @param axisType   AxisType.category
	 * @param categories 品类值
	 */
	public Axis wrapCategoryAxis(String formater,String name,AxisType axisType,List<String> categories){
		Axis wrapAxis = wrapAxis(formater,name,axisType);
		wrapAxis.setData(categories);
		return wrapAxis;
	}
	
	
	
	/*
	public Option getData(){  
		//地址:http://echarts.baidu.com/doc/example/line5.html
		//GsonOption option=new GsonOption();
		Option option = new Option();
		option.legend("高度(km)与气温(°C)变化关系");

		option.toolbox().show(true).feature(Tool.mark, Tool.dataView, new MagicType(Magic.line, Magic.bar), Tool.restore, Tool.saveAsImage);

		option.calculable(true);
		option.tooltip().trigger(Trigger.axis).formatter("Temperature : <br/>{b}km : {c}°C");

		ValueAxis valueAxis = new ValueAxis();
		valueAxis.axisLabel().formatter("{value} °C");
		option.xAxis(valueAxis);

		CategoryAxis categoryAxis = new CategoryAxis();
		categoryAxis.axisLine().onZero(false);
		categoryAxis.axisLabel().formatter("{value} km");
		categoryAxis.boundaryGap(false);
		categoryAxis.data(0, 10, 20, 30, 40, 50, 60, 70, 80,90,100,101,102,103,104,105,106,107,108,109);
		option.yAxis(categoryAxis);

		Line line = new Line();
		line.smooth(true).name("高度(km)与气温(°C)变化关系").data(15, -50, -56.5, -46.5, -22.1, -2.5, -27.7, -55.7, -76.5).itemStyle().normal().lineStyle().shadowColor("rgba(0,0,0,0.4)");
		option.series(line);
		return option;
	}  */


	/**
	 * 
	 * @param legendDatas 图例列表
	 * @return
	 */
	public Option wrapOption(List<String> legendDatas,Tooltip tooltip,List<Series> seriess,List<Axis> xAxiss,List<Axis> yAxiss){  
		Option option = new Option();
		//设置图例
		Legend  legend=new Legend();
		legend.setData(legendDatas);
		option.setLegend(legend);
		//设置提示
		if(tooltip!=null&&tooltip.getTrigger()==null)
			//tooltip.setTrigger(Trigger.item);
		tooltip.setTrigger(Trigger.item);
		option.setTooltip(tooltip);
		//x
		option.setxAxis(xAxiss);
		//y
		option.setyAxis(yAxiss);
		//series
		option.setSeries(seriess);
		return option;
	}  




	public Option getData3(){  
		Option option = new Option();
		//设置图例
		List<String> legendDatas=new ArrayList<String>();
		legendDatas.add("华山高度(km)与气温(°C)变化关系");
		legendDatas.add("高度(km)与气温(°C)变化关系");
		Legend  legend=new Legend();
		legend.setData(legendDatas);
		option.setLegend(legend);
		//设置提示
		Tooltip tooltip=new Tooltip();
		tooltip.setTrigger(Trigger.item);
		tooltip.setFormatter("Temperature : <br/>{b}km : {c}°C");
		option.setTooltip(tooltip);


		//x
		List<Axis> xAxiss=new ArrayList<Axis>();
		//华山
		Axis xaxis=new Axis();
		AxisLabel xlabel=new AxisLabel();
		xlabel.setFormatter("{value} °C");
		xaxis.setAxisLabel(xlabel);
		xaxis.setType(AxisType.value);
		xaxis.setName("温度");
		xAxiss.add(xaxis);
		option.setxAxis(xAxiss);
		//y
		List<Axis> yAxiss=new ArrayList<Axis>();
		Axis yaxis=new Axis();

		AxisLabel ylabel=new AxisLabel();
		ylabel.setFormatter("{value} kmm");
		yaxis.setAxisLabel(ylabel);
		yaxis.setName("山高");
		yaxis.setType(AxisType.category);
		List<String> yDatas=new ArrayList<String>();
		yDatas.add("0");
		yDatas.add("10");
		yDatas.add("20");
		yDatas.add("30");
		yDatas.add("40");
		yDatas.add("50");
		yaxis.setData(yDatas);
		yAxiss.add(yaxis);
		option.setyAxis(yAxiss);

		//series
		List<Series> seriess=new ArrayList<Series>();
		List<String> seriesDatas=new ArrayList<String>();
		Series series=new Series();
		series.setName("华山高度(km)与气温(°C)变化关系");
		series.setType(SeriesType.line);
		seriesDatas.add("15");
		seriesDatas.add("-50");
		seriesDatas.add("-56.5");
		seriesDatas.add("-46.5");
		seriesDatas.add("-22.1");
		seriesDatas.add("-2.5");
		series.setData(seriesDatas);

		Series series2=new Series();
		List<String> seriesDatas2=new ArrayList<String>();
		series2.setName("高度(km)与气温(°C)变化关系");
		series2.setType(SeriesType.line);
		seriesDatas2.add("15");
		seriesDatas2.add("0.9");
		seriesDatas2.add("-6.5");
		seriesDatas2.add("-6.5");
		seriesDatas2.add("-2.1");
		seriesDatas2.add("-24.5");
		series2.setData(seriesDatas2);

		seriess.add(series);
		seriess.add(series2);
		option.setSeries(seriess);

		return option;
	}  

}
