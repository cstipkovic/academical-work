#!/bin/bash
# Baseado no artigo: https://dzone.com/articles/vagrant
# Instala o Oracle JDK via WebUpd8 PPa
echo "Instalando Java 8..."
sudo apt-get install -y software-properties-common python-software-properties
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
sudo add-apt-repository -y ppa:webupd8team/java
sudo apt-get update
sudo apt-get install -y oracle-java8-installer
echo "Aplicando as variaveis de ambiente do Java 8..."
sudo apt-get install -y oracle-java8-set-default
echo "Versao do Java Instalada: "
java -version

echo "Limpando o sistema..."
sudo apt-get autoremove -y

echo "Instalando Tomcat..."
sudo apt-get -y install tomcat7 tomcat7-admin

echo "Instalando Maven.."
sudo apt-get -y install maven

# Configurando a variavel JAVA_HOME
echo "Configurando o Tomcat7..."
cd /etc/default
sudo echo "JAVA_HOME=/usr/lib/jvm/java-8-oracle" >> tomcat7
sudo service tomcat7 restart

# Apache Derby
echo "Instalando o Apache Derby..."
sudo wget http://mirror.nbtelecom.com.br/apache//db/derby/db-derby-10.12.1.1/db-derby-10.12.1.1-bin.zip
sudo unzip db-derby-10.12.1.1-bin.zip
sudo mkdir /opt/Apache
sudo cp -r db-derby-10.12.1.1-bin /opt/Apache
cd /opt/Apache/db-derby-10.12.1.1-bin/bin
echo "JAVA_HOME='/usr/lib/jvm/java-8-oracle'" >> ~/.bashrc
echo "DERBY_INSTALL='/opt/Apache/db-derby-10.12.1.1-bin/bin'" >> ~/.bashrc
source ~/.bashrc

# // Necessita fazer na mao
# sudo ./startNetworkServer -h 192.168.2.110 &
# ./ij
# connect 'jdbc:derby://localhost:1527/meuDB;create=true;user=me;password=pass';
# exit;
