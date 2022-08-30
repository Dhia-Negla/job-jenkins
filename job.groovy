
properties([
        buildDiscarder(logRotator(numToKeepStr: '10')),
        disableConcurrentBuilds(),
        parameters([
                string(defaultValue: 'WEBSHOPS', description: 'Apache config to compare ( , sep)', name: 'ServerGroups'),
                string(defaultValue: 'master', description: '', name: 'BranchTagName'),
        ])
])

node {
    def file = load './file.groovy'
    file.fct2()
}
