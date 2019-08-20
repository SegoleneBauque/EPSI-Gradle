pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        bat 'gradlew bootJar'
      }
    }
    stage('Unit Tests') {
      parallel {
        stage('Unit Tests') {
          post {
            always {
              junit '**/build/test-results/test/TEST-*.xml'

            }

          }
          steps {
            bat 'gradlew test'
          }
        }
        stage('SonarQube Analysis') {
          steps {
            sh 'gradlew sonarqube'
          }
        }
      }
    }
    stage('SonarQube analysis') {
      steps {
        bat 'gradlew sonarqube'
      }
    }
  }
}