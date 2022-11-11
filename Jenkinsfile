pipeline {
  agent any
  stages {
  stage('maven install') {
    steps {
      withMaven(maven: 'maven') {
        bat 'mvn clean install'
      }
    }
  }
}
}
