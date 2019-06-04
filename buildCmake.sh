#!/bin/bash

tar -xvf cmake-3.13.3-Linux-x86_64.tar.gz 
cd cmake-3.13.3-Linux-x86_64/
sudo ln -s bin/cmake /usr/bin/cmake
export PATH=$cwd"/cmake-3.13.3-Linux-x86_64/bin:$PATH"
echo $PATH
cmake --version
#export PATH=$cwd"/cmake-3.13.3-Linux-x86_64/bin:$PATH"
#echo $PATH
