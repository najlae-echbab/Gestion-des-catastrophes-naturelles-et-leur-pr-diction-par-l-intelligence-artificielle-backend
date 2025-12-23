pipeline {
    agent any
    tools{
    jdk 'JDK17'
    maven 'Maven3'


    }
    stages {

            stage('Checkout') {
                steps {
                    checkout scm
                }
            }

            stage('build et le test'){
                steps{
                bat 'mvn clean verify'
                 }
            }
        stage('SonarQube Test'){
            steps{
                 withCredentials([string(credentialsId: 'sonar-token', variable: 'SONAR_TOKEN')]) {
                 bat'''
                     mvn sonar:sonar ^
                      -Dsonar.projectKey=pfa-backend ^
                      -Dsonar.projectName=pfa-backend ^
                      -Dsonar.host.url=http://localhost:9000 ^
                       -Dsonar.token=%SONAR_TOKEN%
                 '''


                 }
            }

        }

 post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
        cleanup {
            cleanWs()
        }
    }


    }



}