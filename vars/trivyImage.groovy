def call() {
    sh 'trivy image jay0421/youtube:latest > trivyimage.txt'
}
