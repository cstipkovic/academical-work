const dgram = require('dgram');

class Server {
    constructor(port, address) {
        this.port = port;
        this.address = address;
        this.server = dgram.createSocket('udp4');

        this.server
            .on('message', (msg, rinfo) => {
                this.message(msg, rinfo);
            })
            .on('listening', () => {
                this.listening();
            })
            .on('error', (err) => {
                this.error();
            });
    }

    getPort() {
        return this.server.address().port;
    }

    getAddress() {
        return this.server.address().address;
    }

    getServer() {
        return this.server;
    }

    error() {
        console.log(`server error:\n${err.stack}`);
        this.server.close();
    }

    message(msg, rinfo) {
        console.log(`server got: ${msg} from ${rinfo.address}:${rinfo.port}`);
    }

    listening() {
        console.log(`server listening ${this.getAddress()}:${this.getPort()}`);
    }

    start() {
        this.server.bind({
            address: this.address,
            port: this.port
        });
    }
}

module.exports = Server;