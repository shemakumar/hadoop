#!/bin/bash
# Gamma Stage Machine 10.32.65.3
mvn install -Pdist -Dtar -DskipTests -Dmaven.javadoc.skip=true
ssh $1  sudo  rm -rf  /tmp/fdp-hadoop
ssh $1  sudo  mkdir -p  /tmp/fdp-hadoop
ssh $1 sudo chmod 777 /tmp/fdp-hadoop
scp -r -C  hadoop-dist/target/hadoop-2.6.0/* $1:/tmp/fdp-hadoop
scp run_hadoop $1:/tmp/fdp-hadoop/hadoop
ssh $1 sudo mkdir -p /usr/share/fk-bigfoot-mr
ssh $1 sudo cp -r /tmp/fdp-hadoop/\* /usr/share/fk-bigfoot-mr/
ssh $1 sudo chmod 777 /usr/share/fk-bigfoot-mr/hadoop
scp -r -C hadoop-dist/target/hadoop-2.6.0.tar.gz $1:/tmp/fdp-hadoop
ssh $1 sudo -ufk-bigfoot-azkaban hadoop fs -put -f  /tmp/fdp-hadoop/hadoop-2.6.0.tar.gz  /projects/mukund/hadoop-2.6.0.tar.gz
