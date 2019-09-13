function jQuery(selector) {
//1.截取选择器从下标为1的字符一直到最后，也就是说 "#ipt"截取ipt
    var s = selector.substring(1);
    var element = document.getElementById(s);
    return element;
}
$ = jQuery