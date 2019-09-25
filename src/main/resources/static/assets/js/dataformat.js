/*数据处理的js*/


/*处理时间的工具*/
var dateUtil={
    /**
     *
     * @param time 时间戳:"2019-09-11T10:11:54.000+0000"
     * @param format 格式:"yyyy-MM-dd HH:mm:ss"
     * @returns {*|string}
     */
    toDateString(time, format) {
        var date = new Date(time);
        var year = date.getFullYear();
        var month = date.getMonth() + 1;
        month = month < 10 ? ('0' + month) : month;
        var day = date.getDate();
        day = day < 10 ? ('0' + day) : day;
        var h = date.getHours();
        h = h < 10 ? ('0' + h) : h;
        var m = date.getMinutes();
        m = m < 10 ? ('0' + m) : m;
        var s = date.getSeconds();
        s = s < 10 ? ('0' + s) : s;
        format = format.replace("yyyy", year).replace("MM", month).replace("dd", day).replace("HH", h).replace("mm", m).replace("ss", s);
        return format;
    }
};

/*处理字符的工具*/
var strUtil={
    /**
     * 去除空格
     */
    removeSpaces(str){
        return str.replace(/\s+/g, "");
    }
};