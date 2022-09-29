var events = require('events');

var eventEmitter = new events.EventEmitter();

var errorListener = function error() {
    console.log('事件错误');
}

var errorListener2 = function error2() {
    console.log('监听事件错误');
}

eventEmitter.on('error', errorListener);
eventEmitter.addListener('error', errorListener2);

eventEmitter.emit('error');