//定义EndlessScroll的构造函数
var EndlessScroll = function(ele, opt) {
    this.$element = ele,
    this.defaults = {
        'color': 'red',
        'fontSize': '12px',
        'textDecoration':'none'
    },
    this.options = $.extend({}, this.defaults, opt)
}
//定义EndlessScroll的方法
EndlessScroll.prototype.run = function() {
        return this.$element.css({
            'color': this.options.color,
            'fontSize': this.options.fontSize,
            'textDecoration': this.options.textDecoration
        });
}

//在插件中使用EndlessScroll对象
$.fn.endlessScroll = function(options) {
    //创建EndlessScroll的实体
    var endlessScroll = new EndlessScroll(this, options);
    //调用其方法
    return endlessScroll.run();
}