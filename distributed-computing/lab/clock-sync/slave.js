const master = require('./src/Master');

const masterServer = new master(47777, 'localhost');

const date = Date.now();
const message = date.toString();

masterServer.send(message, 41234, 'localhost');