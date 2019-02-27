#!/bin/sh
VERSION=1.0
CURRENT_DIR=`pwd`
LIB_JARS=${CURRENT_DIR}/lib/*
CLASSPATH=".:${CURRENT_DIR}/conf:${LIB_JARS}"
COMMAND="java -Xms400m -Xmx400m -Xmn120m -XX:+HeapDumpOnOutOfMemoryError -XX:ErrorFile=/var/log/java/java_error%p.log -classpath ${CLASSPATH}"
nohup ${COMMAND} com.zhang.boot2.Boot2Application >/dev/null 2>log &