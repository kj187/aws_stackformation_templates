# AWS Lambda with Golang

## Usage

```
$ git clone https://github.com/kj187/aws_stackformation_templates.git
$ cd aws_stackformation_templates/
$ docker run --rm -it -v $(pwd):/app -w /app kj187/stackformation:latest-golang setup
$ docker run --rm -it -v $(pwd):/app -w /app kj187/stackformation:latest-golang blueprint:deploy sftemplates-example-golang-lambda
```
