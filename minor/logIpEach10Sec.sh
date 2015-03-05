#!/bin/sh
while [ true ]
do
  date >> ip.log ; curl ifconfig.me >> ip.log ; curl icanhazip.com >> ip.log
    sleep 10
done
