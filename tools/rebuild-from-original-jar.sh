#!/usr/bin/env bash
set -euo pipefail

JAR="${1:-input/original.jar}"
OUT="${2:-build/cfr}"
CFR="${CFR:-build/cfr.jar}"

mkdir -p "$OUT"

if [[ ! -f "$JAR" ]]; then
  echo "Missing original JAR: $JAR" >&2
  exit 2
fi

if [[ ! -f "$CFR" ]]; then
  curl -L --fail --silent --show-error -o "$CFR" https://github.com/leibnitz27/cfr/releases/download/0.152/cfr-0.152.jar
fi

java -jar "$CFR" "$JAR" --outputdir "$OUT" --comments false --decodefinally true --removeboilerplate false
echo "Decompiled source written to $OUT"
