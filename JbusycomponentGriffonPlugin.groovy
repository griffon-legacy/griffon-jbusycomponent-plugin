class JbusycomponentGriffonPlugin {
    // the plugin version
    String version = '0.5.3'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = ['swingx-builder': '0.6', jxlayer: '0.2']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, qt
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-jbusycomponent-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Enhance any swing components with a \'busy\' state'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
JBusyComponent: Enhance any swing components with a 'busy' state.
http://code.google.com/p/jbusycomponent
'''
}
