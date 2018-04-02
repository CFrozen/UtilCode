function realSysTime(clock){
	var now=new Date(); //创建Date对象
	var year=now.getFullYear(); //获取年份
	var month=now.getMonth()+1; //获取月份
	var date=now.getDate(); //获取日期
	var day=now.getDay(); //获取星期
    var year = now.getFullYear();
    month = month>9 ? month : "0" + month; 
    date = date>9 ? date : "0" + date;
    var hour = now.getHours();
    hour = hour>9 ? hour : "0" + hour;
    var miunte = now.getMinutes();
    miunte = miunte>9 ? miunte : "0" + miunte;
    var second = now.getSeconds();
    second = second>9 ? second : "0" + second;
	var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
	var week=arr_week[day]; //获取中文的星期
	var time=year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+miunte+":"+second; //组合系统时间
	clock.innerHTML=time; //显示系统时间
}
//调用:
window.onload=function(){
	window.setInterval("realSysTime(clock)",1000); //实时获取并显示系统时间
}
//页面在要显示的位置加上id=“clock”，具体的值只要和realSysTime()括号中匹配即可
