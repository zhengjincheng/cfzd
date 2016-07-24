//定义ListBinding的构造函数
var ListBinding = function(ele, opt) {
    this.$element = ele,
    this.defaults = {
         itemRender: function(dataItem) {
            return '';
         }
    },
    this.options = $.extend({}, this.defaults, opt)
}
//定义ListBinding的方法
ListBinding.prototype.setDataProvider = function(list) {
	  this.dataProvider=list;
	  this.$element.empty();
	  var lb=this;
      $.each(list,function(index, value) {
    	  lb.$element.append(lb.options.itemRender.apply(lb,[value]));
      });
}

//在插件中使用ListBinding对象
$.fn.listBinding = function(options) {
    //创建ListBinding的实体
    var listBinding = new ListBinding(this, options);
    //调用其方法
    return listBinding;
}