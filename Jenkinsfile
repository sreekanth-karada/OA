pipeline {
  agent any
    triggers {
  cron '* 12 * * *'
}
    stages {
        stage('build') {
            steps {
                echo 'Scheduled build running...'
            }
        }
    }
}
