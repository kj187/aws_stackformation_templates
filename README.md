
# AWS StackFormation Templates

## Installation
```
$ git clone git@github.com:kj187/aws_stackformation_templates.git
$ cd aws_stackformation_templates
```

## Usage & Setup
```
$ docker run --rm -it -v $(pwd):/app -w /app stackformation:latest bash
$ stackformation setup
```

## Services
### Lambda

#### NodeJS
```
$ docker run --rm -it -v $(pwd):/app -w /app kj187/stackformation:latest bash
$ stackformation blueprint:deploy sftemplates-example-nodejs-lambda
```

#### Java
TODO: Use java/maven image and compile java binary on the fly
```
$ docker run --rm -it -v $(pwd):/app -w /app kj187/stackformation:latest bash
$ stackformation blueprint:deploy sftemplates-example-java-lambda
```

#### Python
TODO

#### Not native supported languages

##### Perl
TODO

##### Golang
```
$ docker run --rm -it -v $(pwd):/app -w /app kj187/stackformation:latest-golang bash
$ stackformation blueprint:deploy sftemplates-example-golang-lambda
```

## TODOs
- add alias for stackformation commands
