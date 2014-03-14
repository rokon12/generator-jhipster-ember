#!/bin/sh

set -e

echo '----> Cleanup...'
./gradlew clean
grunt clean
grunt build
git add -A .
git add -u .

echo '----> Bumping version...'
grunt bump:minor

VERSION=$(awk '/version: (.*)$/ {print $2}' VERSION)
echo '----> Build version' $VERSION