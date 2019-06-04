#!/bin/bash

mkdir pushHadoopTar/HadoopSourceBinary
cp -rf hadoop-dist/target/hadoop-3.1.1 pushHadoopTar/HadoopSourceBinary/
pushHadoopTar/make-flipkart-yarn-2.9.0-deb 

cd pushHadoopTar
sh make-flipkart-yarn-2.9.0-deb 
dpkg -b deb flipkart-hadoop-tar-test.deb
reposervice --host repo-svc-app-0001.nm.flipkart.com --port "8080" pubrepo --repo  fk-hadoop-tar-test-source  --appkey dummy --debs flipkart-hadoop-tar-test.deb
