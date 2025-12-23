pipeline {
    agent any

    tools {
        jdk 'jdk17'
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build et Tests') {
            steps {
                bat 'mvn clean verify'
            }
        }

        stage('Analyse SonarQube') {
            steps {
                withCredentials([string(credentialsId: 'sonar-token', variable: 'SONAR_TOKEN')]) {
                    bat '''
                      mvn sonar:sonar ^
                      -Dsonar.host.url=http://localhost:9000 ^
                      -Dsonar.projectKey=pfa-backend ^
                      -Dsonar.projectName=pfa-backend ^
                      -Dsonar.token=%SONAR_TOKEN%
                    '''
                }
            }
        }
    }

    post {
        success {
            echo ' Pipeline terminé avec succès'
        }
        failure {
            echo ' Pipeline échoué'
        }
    }
}
