# Instala o Oracle JDK via WebUpd8 PPa
echo "Instalando Java 8..."
sudo apt-get install -y software-properties-common python-software-properties
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
sudo add-apt-repository -y ppa:webupd8team/java
sudo apt-get update
sudo apt-get install -y oracle-java8-installer
sudo apt-get install -y oracle-java8-set-default
echo "Versao do Java Instalada: "
java -version
sudo apt-get autoremove -y

# Apache Tomcat
sudo apt-get -y install apache2
sudo apt-get -y install tomcat7 tomcat7-admin
sudo apt-get -y install maven

# Configurando a variavel JAVA_HOME
cd /etc/default
sudo echo "JAVA_HOME=/usr/lib/jvm/java-7-oracle" >> tomcat7
sudo service tomcat7 restart
