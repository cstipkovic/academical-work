// FIP Examples

// Proving: 1 + 2 + 3 + ... + n = (n (n + 1))/2
// So, n = 3

//process.argv.forEach(function (val, index, array) {
//	console.log(index + ':' + val);
//});

var n, sum, fip_sum;

process.stdin.resume();
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (i) {
	process.stdout.write('data' + i);
});

process.stdin.on('end', function (){
	return true;
});

sum = function (n) {
	var result = 1;
	for (var i = 1; i < n; i++) {
		result = result + (i+1);  
	}

	return result;
};

console.log(sum(n));

fip_sum = function (n) {
	return ((n * (n + 1)) / 2);
};

console.log(fip_sum(n));
