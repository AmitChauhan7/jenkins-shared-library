def call() {

    pipeline {
        agent any


        stages {
            stage('Python Lint Check2') {
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