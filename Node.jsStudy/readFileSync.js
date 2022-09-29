var fs = require("fs");

var data = fs.readFileSync("server.js");

console.log(data.toString());
console.log("程序执行结束！");
