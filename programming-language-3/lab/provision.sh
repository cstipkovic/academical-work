#!/bin/bash

# Updating Centos 7
sudo yum update -y
sudo yum install wget -y

# Install Oracle Java 8 (JDK)
cd ~
wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u60-b27/jdk-8u60-linux-x64.rpm"
sudo yum localinstall jdk-8u60-linux-x64.rpm -y
rm ~/jdk-8u60-linux-x64.rpm

# Install Tomcat
sudo groupadd tomcat
sudo useradd -M -s /bin/nologin -g tomcat -d /opt/tomcat tomcat
cd ~
wget http://ftp.unicamp.br/pub/apache/tomcat/tomcat-8/v8.5.11/bin/apache-tomcat-8.5.11.tar.gz
sudo mkdir /opt/tomcat
sudo tar xvf apache-tomcat-8*tar.gz -C /opt/tomcat --strip-components=1
cd /opt/tomcat
sudo chgrp -R tomcat /opt/tomcat
sudo chmod -R g+r conf
sudo chmod g+x conf
sudo chown -R tomcat webapps/ work/ temp/ logs/
sudo cp /vagrant/configs/tomcat.service /etc/systemd/system/tomcat.service
sudo systemctl daemon-reload
sudo systemctl start tomcat
sudo systemctl enable tomcat

# Install Maven
sudo yum install maven -y

# Install Apache Derby
echo "Instalando o Apache Derby..."
sudo wget http://mirror.nbtelecom.com.br/apache//db/derby/db-derby-10.12.1.1/db-derby-10.12.1.1-bin.zip
sudo unzip db-derby-10.12.1.1-bin.zip
sudo mkdir /opt/Apache
sudo cp -r db-derby-10.12.1.1-bin /opt/Apache
cd /opt/Apache/db-derby-10.12.1.1-bin/bin
echo "JAVA_HOME='/usr/lib/jvm/java-8-oracle'" >> ~/.bashrc
echo "DERBY_INSTALL='/opt/Apache/db-derby-10.12.1.1-bin/bin'" >> ~/.bashrc
source ~/.bashrc
