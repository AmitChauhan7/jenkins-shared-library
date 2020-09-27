def call() {

    pipeline {
        agent any


        stages {
            stage('Python Lint Check1') {
                steps {
                    sh '''
                    pylint payment.py || true
                    pylint rabbitmq.py || true
                '''
                }

            }


        }

    }
}