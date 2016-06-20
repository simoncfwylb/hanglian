<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="padding:0">  
<div style="padding:10px;clear: both;">  
    <div id="psLine" style="height:600px;">11</div>  
</div>  
</body>  
<!-- <script src="/js/echarts.min.js"></script>   -->
<script src="js/echarts-all.js"></script>  
<script src="/js/jquery-1.7.2.js"></script>  
<script type="text/javascript">  
    //图表  
    var psLineChar = echarts.init(document.getElementById('psLine'));  
  
    //查询  
    function loadDrugs() {  
        psLineChar.clear();  
        psLineChar.showLoading({text: '正在努力的读取数据中...'});  
        var json=""
        var option2={
        	    toolbox: {
        	        show: true,
        	        feature: {
        	            mark: {
        	                show: true,
        	                title: {
        	                    mark: "辅助线开关",
        	                    markClear: "清空辅助线",
        	                    markUndo: "删除辅助线"
        	                },
        	                lineStyle: {
        	                    color: "#1e90ff",
        	                    type: "dashed",
        	                    width: 2
        	                }
        	            },
        	            dataView: {
        	                show: true,
        	                title: "数据视图",
        	                readOnly: false,
        	                lang: [
        	                    "数据视图",
        	                    "关闭",
        	                    "刷新"
        	                ]
        	            },
        	            magicType: {
        	                show: true,
        	                title: {
        	                    line: "折线图切换",
        	                    stack: "堆积",
        	                    bar: "柱形图切换",
        	                    tiled: "平铺"
        	                },
        	                type: [
        	                    "line",
        	                    "bar"
        	                ]
        	            },
        	            restore: {
        	                show: true,
        	                title: "还原"
        	            },
        	            saveAsImage: {
        	                show: true,
        	                title: "保存为图片",
        	                type: "png",
        	                lang: [
        	                    "点击保存"
        	                ]
        	            }
        	        }
        	    },
        	    tooltip: {
        	        formatter: "Temperature : <br/>{b}km : {c}°C"
        	    },
        	    legend: {
        	        data: [
        	            "高度(km)与气温(°C)变化关系"
        	        ]
        	    },
        	    xAxis: [
        	        {
        	            type: "value",
        	            axisLabel: {
        	                formatter: "{value} °C"
        	            }	
        	        }
        	    ],
        	    yAxis: [
        	        {
        	           data: [
        	                0,
        	                10,
        	                20,
        	                30,
        	                40,
        	                50,
        	                60,
        	                70,
        	                80
        	            ],
        	            type: "category",
        	            axisLabel: {
        	                formatter: "{value} km"
        	            }
        	        }
        	    ],
        	    series: [
        	        {
        	            data: [
        	                15,
        	                -50,
        	                -56.5,
        	                -46.5,
        	                -22.1,
        	                -2.5,
        	                -27.7,
        	                -55.7,
        	                -76.5
        	            ],
        	            name: "高度(km)与气温(°C)变化关系",
        	            type: "line",
        	            itemStyle: {
        	                normal: {
        	                    lineStyle: {
        	                        shadowColor: "rgba(0,0,0,0.4)"
        	                    }
        	                }
        	            }
        	        }
        	    ]
        	}
        var option4={
        	    "code": 200,
        	    "message": "Success",
        	    "data": {
        	        "xAxis": [
        	            {
        	                "data": null,
        	                "name": "温度",
        	                "type": "value",
        	                "axisLabel": {
        	                    "formatter": "{value} °C"
        	                }
        	            },
        	            {
        	                "data": null,
        	                "name": "雨量",
        	                "type": "value",
        	                "axisLabel": {
        	                    "formatter": "{value} ml"
        	                }
        	            }
        	        ],
        	        "yAxis": [
        	            {
        	                "data": [
        	                    "10",
        	                    "20",
        	                    "30",
        	                    "40",
        	                    "50",
        	                    "60",
        	                    "70",
        	                    "80"
        	                ],
        	                "name": "山高",
        	                "type": "category",
        	                "axisLabel": {
        	                    "formatter": "{value} km"
        	                }
        	            }
        	        ],
        	        "series": [
        	            {
        	                "data": [
        	                    "11",
        	                    "12",
        	                    "14",
        	                    "-12",
        	                    "31",
        	                    "42",
        	                    "-11",
        	                    "-5"
        	                ],
        	                "name": "华山高度(km)与气温(°C)变化关系",
        	                "type": "line"
        	            },
        	            {
        	                "data": [
        	                    "15",
        	                    "0.9",
        	                    "-6.5",
        	                    "6.5",
        	                    "2.1",
        	                    "24.5",
        	                    "11",
        	                    "-5.2"
        	                ],
        	                "name": "高度(km)与气温(°C)变化关系",
        	                "type": "line"
        	            }
        	        ],
        	        "tooltip": {
        	            "trigger": "item",
        	            "formatter": "Temperature : <br/>{b}km : {c}°C"
        	        },
        	        "legend": {
        	            "data": [
        	                "华山高度(km)与气温(°C)变化关系",
        	                "高度(km)与气温(°C)变化关系"
        	            ]
        	        }
        	    },
        	    "ok": true
        	}
       var option = {
        	    legend: {                                   // 图例配置
        	        padding: 5,                             // 图例内边距，单位px，默认上下左右内边距为5
        	        itemGap: 100,                            // Legend各个item之间的间隔，横向布局时为水平间隔，纵向布局时为纵向间隔
        	        data: ['ios', 'android']
        	    },
        	    tooltip: {                                  // 气泡提示配置
        	        trigger: 'item',                        // 触发类型，默认数据触发，可选为：'axis'
        	    },
        	    xAxis: [                                    // 直角坐标系中横轴数组
        	        {
        	            type: 'category',                   // 坐标轴类型，横轴默认为类目轴，数值轴则参考yAxis说明
        	            data: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        	        }
        	    ],
        	    yAxis: [                                    // 直角坐标系中纵轴数组
        	        {
        	            type: 'value',                      // 坐标轴类型，纵轴默认为数值轴，类目轴则参考xAxis说明
        	            boundaryGap: [0.1, 0.1],            // 坐标轴两端空白策略，数组内数值代表百分比
        	            splitNumber: 4                      // 数值轴用，分割段数，默认为5
        	        }
        	    ],
        	    series: [
        	        {
        	            name: 'ios',                        // 系列名称
        	            type: 'bar',                       // 图表类型，折线图line、散点图scatter、柱状图bar、饼图pie、雷达图radar
        	            data: [112, 23, 45, 56, 233, 343, 454, 89, 343, 123, 45, 123]
        	        },
        	        {
        	            name: 'android',                    // 系列名称
        	            type: 'bar',                       // 图表类型，折线图line、散点图scatter、柱状图bar、饼图pie、雷达图radar
        	            data: [45, 123, 145, 526, 233, 343, 44, 829, 33, 123, 45, 13]
        	        }
        	    ]
        	};
        
        var categories=[];
        var values=[];
        $.ajax({
            url: "/echart/e1.do" ,
            //data: JSON.stringify(json),
            type: "POST",
            beforeSend: function(xhr) {
                xhr.setRequestHeader("Accept", "application/json");
                xhr.setRequestHeader("Content-Type", "application/json");
            },
            success: function(data) {
                if (data.code==200) {
                	psLineChar.setOption(data.data)
                	 psLineChar.hideLoading();
                	}
                }
                /*
            success: function(data) {
                if (data.code==200) {
                    //psLineChar.setOption(data.data,true); 
                   //psLineChar.setOption(option2); 
                   categories=data.data.yAxis[0].data;
                   values=data.data.series[0].data;
                var option3={
        		backgroundColor:null,
        	    toolbox: {
        	        show: true,
        	        feature: {
        	            mark: {
        	                show: true,
        	                title: {
        	                    mark: "辅助线开关",
        	                    markClear: "清空辅助线",
        	                    markUndo: "删除辅助线"
        	                },
        	                lineStyle: {
        	                    color: "#1e90ff",
        	                    type: "dashed",
        	                    width: 2
        	                }
        	            },
        	            dataView: {
        	                show: true,
        	                title: "数据视图",
        	                readOnly: false,
        	                lang: [
        	                    "数据视图",
        	                    "关闭",
        	                    "刷新"
        	                ]
        	            },
        	            magicType: {
        	                show: true,
        	                title: {
        	                    line: "折线图切换",
        	                    stack: "堆积",
        	                    bar: "柱形图切换",
        	                    tiled: "平铺"
        	                },
        	                type: [
        	                    "line",
        	                    "bar"
        	                ]
        	            },
        	            restore: {
        	                show: true,
        	                title: "还原"
        	            },
        	            saveAsImage: {
        	                show: true,
        	                title: "保存为图片",
        	                type: "png",
        	                lang: [
        	                    "点击保存"
        	                ]
        	            }
        	        }
        	    },
        	    tooltip: {
        	        formatter: "Temperature : <br/>{b}km : {c}°C"
        	    },
        	    legend: {
        	        data: [
        	            "高度(km)与气温(°C)变化关系"
        	        ]
        	    },
        	    xAxis: [
        	        {
        	            type: "value",
        	            axisLabel: {
        	                formatter: "{value} °C"
        	            }	
        	        }
        	    ],
        	    yAxis: [
        	        {
        	           data: categories,
        	            type: "category",
        	            axisLabel: {
        	                formatter: "{value} km"
        	            }
        	        }
        	    ],
        	    series: [
        	        {
        	            data: values,
        	            name: "高度(km)与气温(°C)变化关系",
        	            type: "line",
        	            itemStyle: {
        	                normal: {
        	                    lineStyle: {
        	                        shadowColor: "rgba(0,0,0,0.4)"
        	                    }
        	                }
        	            }
        	        }
        	    ]
        	}
                psLineChar.setOption(option3);
                    psLineChar.hideLoading();  
                } else {  
                    alert('提示', data.message);  
                }
            }*/
            
            

        });
    }  
    //载入图表  
    loadDrugs();  
</script> 
</html>