import groovy.xml.*
static void main(String[] args) {
    def number = 0
    def classes = [String, List,File]
    def customers = new XmlSlurper().parse(new File('/Users/williamcrupi/Documents/github/groovy/hello_test/customers.xml'))
    println "Hello world!"
    new File('/Users/williamcrupi/Documents/github/groovy/hello_test/data.txt').eachLine
            { line ->
                number++
                println "$number: $line"
            }
    for (clazz in classes){
        println clazz.package.name
    }
    println([String, List, File]*.package*.name)
    for (customer in customers.corporate.customer)
    {
        println "${customer.@name} works for ${customer.@company}"
    }
}