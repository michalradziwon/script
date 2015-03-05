#!/bin/sh
# POSTs a content of 'payload.json' file
curl -v -X POST -H 'Content-Type:application/json' -k -d @payload.json https://host/abc