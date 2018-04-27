const Server = require('./Commons/Server');

class Master extends Server {
    constructor (port, address) {
        super(port, address);
        super.start();
        this.port = port;
        this.address = address;
    }

    send(message, port, address) {
        const server = super.getServer();        
        
        server.send(message, port, address, (err) => {
            console.log(err);
        });
    }
}

module.exports = Master;