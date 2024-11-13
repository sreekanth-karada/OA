pipeline {
    agent any
    
    triggers {
        cron('H 4 * * 1-5')  // Every weekday at 4:00 AM
    }
    tools{
        maven 'MyMaven'
        jdk 'MyJava'
    }

    stages {
        stage('checkotromGit') {
            steps {
                git 'https://github.com/sreekanth-karada/OA.git'
            }
        }
        
        stage('compile') {
            steps {
                sh "mvn compile"
            }
        }
    }
}
