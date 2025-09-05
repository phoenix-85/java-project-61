.DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

test:
	./gradlew test

lint:
	./gradlew checkstyleMain

build-run: build run

.PHONY: build