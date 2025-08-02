pipeline {
  agent any
  stages {
    stage('Clone') {
      steps {
        git 'https://github.com/Chethanraj777/insure-me.git'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build & Run') {
      steps {
        sh 'docker build -t insureme .'
        sh 'docker run -d -p 8091:8080 insureme'
      }
    }
  }
}
