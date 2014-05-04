
~/bin/stop_tomcat
mvn clean install
rm -rf /usr/local/Cellar/tomcat/7.0.39/libexec/webapps/shapes-svg-0.0.1-SNAPSHOT
rm -rf /usr/local/Cellar/tomcat/7.0.39/libexec/webapps/shapes-svg-0.0.1-SNAPSHOT.war
cp ~/Development/svg/svg-app/target/shapes-svg-0.0.1-SNAPSHOT.war /usr/local/Cellar/tomcat/7.0.39/libexec/webapps/
~/bin/start_tomcat