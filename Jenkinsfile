pipeline {
  agent {
    label 'slave3'
  }
  stages {
    stage('checkout') {
      steps {
        sh 'rm -rf weather-update'
        sh 'git clone https://github.com/yatheesh2328/weather-update.git'
      }
    }
    stage('build') {
      steps {
        sh 'mvn --version'
        sh 'mvn clean install'
      }
    }
    stage('deploy') {
      steps {
        sh 'scp /home/slave3/workspace/weatherMBP3_Develop/target/weather-forecast-app-1.0-SNAPSHOT.jar root@172.31.17.229:/opt/apache-tomcat-8.5.98/webapps/'
      }
    }
  }
}
