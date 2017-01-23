# AWS Lambda with Golang

## Usage

```
$ cd stackformation/
$ docker run --rm -it -v $(pwd):/app -w /app kj187/stackformation:latest-golang setup
$ docker run --rm -it -v $(pwd):/app -w /app kj187/stackformation:latest-golang blueprint:deploy sftemplates-example-golang-lambda
```
