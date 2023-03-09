def call() {
    echo "building the package"
    sh '''
    mvn clean install
    '''
}
