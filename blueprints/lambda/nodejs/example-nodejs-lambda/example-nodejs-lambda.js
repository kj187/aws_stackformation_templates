
exports.handler = function (event, context) {
    // A useful line for debugging, add a version number to see which version ran in lambda
    console.log('=============> Running lambda event handler. <================');
    event.Records.forEach(function(value) { process(value, context); });
}

function process(value, context) {
    var message = JSON.parse(value.Sns.Message);
    console.log(message);
    context.done(null, 'success');
}
