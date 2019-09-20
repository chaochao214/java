//使用jQuery的插件机制，给jQuery的对象添加check()和uncheck()方法
$.fn.extend({
    check:function () {
        //让调用这个check方法的复选框选中
        //在jQuery的插件机制中，this代表的是调用方法的jQuery对象
        this.prop("checked",true)
    },
    uncheck:function () {
        //让调用这个方法的复选框取消选中
        this.prop("checked",false)
    }
})

$.extend({
    min:function (a,b) {
        return a>b ? b : a
    },
    max:function (a,b) {
        return a>b ? a : b
    }
})
