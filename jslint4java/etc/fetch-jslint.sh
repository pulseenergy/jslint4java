#/bin/sh
#
# Download the latest jslint.
#

resourceDir="${1:-src/main/resources}"
pkgDir="${2:-net/happygiraffe/jslint}"
curl -R -o $resourceDir/$pkgDir/jshint.js http://jshint.com/jshint.js
