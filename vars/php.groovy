def call() {

    pipeline {
        agent any


        stages {



            stage('Lint Checking code') {
                steps {
                    sh '''
                            composer require overtrue/phplint --dev -vvv
                            ./vendor/bin/phplint html
                        '''

                }

            }


        }
    }
}