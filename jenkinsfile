pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'Sample '
      }
    }

    stage('API Test') {
      steps {
        bat 'mvn test'
      }
    }

    stage('Archive ') {
      steps {
        archiveArtifacts '/target/surefire-reports/*.xml'
      }
    }

  }
}