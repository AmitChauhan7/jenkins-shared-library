def call() {

    pipeline {
        agent any

        tools {
            nodejs 'node-12.18.2'
        }

        stages {

            stage('Install Node Dependencies') {
                steps {
                    sh '''
                    npm install
                '''
                }

            }

            stage('Lint Check') {
                steps {
                    sh '''
                  npm install --save jslint
                  node_modules/.bin/jslint --edition=latest "*.js" || true
                '''
                }

            }


        }
    }
}
