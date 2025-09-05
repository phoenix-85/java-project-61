.DEFAULT_GOAL := build-run

setup:
	./app/gradlew wrapper

clean:
	./app/gradlew clean

build:
	./app/gradlew clean build

install:
	./app/gradlew clean install

run-dist:
	./app/build/install/app/bin/app

run:
	./app/gradlew run

test:
	./app/gradlew test

lint:
	./app/gradlew checkstyleMain

build-run: build run

.PHONY: build