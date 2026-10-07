#!/usr/bin/env bash
set -euo pipefail

mkdir -p input libs
base64 -d input/decompiled.zip.b64 > input/decompiled.zip
base64 -d input/original.jar.b64 > libs/original.jar

echo "Prepared supplied artifacts:"
sha256sum input/decompiled.zip libs/original.jar
