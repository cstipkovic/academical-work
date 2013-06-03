// FIP Examples
// Proving: 1 + 2 + 3 + ... + n = (n (n + 1))/2

console.log("Finity Induction Principle - Example\n")

var n = parseInt(process.argv.slice(2)[0], 10), 
    sum, fip_sum;

sum = function (n) {
	var result = 1;
	for (var i = 1; i < n; i++) {
		result = result + (i+1);  
	}

	return result;
};

console.log("Natural sum:", sum(n));

fip_sum = function (n) {
	return ((n * (n + 1)) / 2);
};

console.log("Finity Induction Principle:", fip_sum(n));
