def echo1() {
    echo "Hello World from Shared Library"
}
    def call(int buildNumber) {
        pipeline {
            agent any

            stages {
                stage('Sample') {
                    steps {
                        script {
                            echo1()
                        }
                    }
                }
            }
        }
    }
