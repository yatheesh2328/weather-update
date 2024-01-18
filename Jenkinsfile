pipeline {
  agent {label 'slave3'}
  stages {
    stage('checkout') {
      steps {
        sh 'git clone https://github.com/yatheesh2328/weather-update.git'
      }
    }
    stage('build') {
      steps {
        sh 'mvn --version'
        sh 'mvn clean install'
      }
    }
  }
}
