var fs = require("fs");

fs.readFile('server.js', function (err, data) {
    if (err) return consolo.error(err);
    console.log(data.toString());
});

console.log("程序执行结束！")
