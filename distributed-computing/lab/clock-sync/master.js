const master = require('./src/Master');

const masterServer = new master(41234, 'localhost');

const date = Date.now();
const message = date.toString();

masterServer.send(message, 47777, 'localhost');