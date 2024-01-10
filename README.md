# Clone repo into local 
# set JAVA_HOME for maven
# once JAVA_HOME is set run mvn clean install
# once mvn clean install is successful jar file would be generated in the target
# once Jar is generated run java -jar target/weather-forecast-app-1.0-SNAPSHOT.jar


Jenkinsfile 

pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    sh "${MAVEN_HOME}/bin/mvn clean package"
                }
            }
        }

        stage('Run Locally') {
            steps {
                script {
                    // Run the Spring Boot application locally
                    sh "java -jar target/myhealthapp.jar &"
                    // Sleep for a while to allow the application to start (adjust as needed)
                    sleep 30
                }
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                script {
                    // Copy the JAR file to the Tomcat webapps directory
                    sh "cp target/myhealthapp.jar /path/to/tomcat/webapps/"

                    // Restart Tomcat
                    sh "/path/to/tomcat/bin/shutdown.sh"
                    sh "/path/to/tomcat/bin/startup.sh"
                }
            }
        }
    }

    post {
        success {
            echo 'Deployment successful!'
        }
        failure {
            echo 'Deployment failed!'
        }
        always {
            // Cleanup: Stop the locally running Spring Boot application
            script {
                sh "pkill -f 'java -jar target/myhealthapp.jar'"
            }
        }
    }
}

