def call {
pipeline {
    agent any 
    environment {
        ENVIRONMENT="dev"
        user="suresh"
    }
    parameters {
       string defaultValue: 'major_version', description: 'Please provide major version ', name: 'MAJOR_VERSION'
       string defaultValue: 'minor_version', description: 'Please provide major version ', name: 'MINOR_VERSION'
       string defaultValue: 'bug_version', description: 'Please provide major version ', name: 'BUG_VERSION'
       booleanParam defaultValue: true, description: 'provide sonar scan or not', name: 'dosonarscan'
       booleanParam defaultValue: true, description: 'provide sonar scan or not', name: 'QUALITy_GATE'
    }
    stages {
      stage('General') {
        steps {
          sh "echo general stage"
         }
      }

      stage('Build') {
        steps {
         sh "echo build stage"
      }
      }

}
    
}

}





