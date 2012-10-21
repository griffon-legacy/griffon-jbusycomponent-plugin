/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class JbusycomponentGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = ['swingx-builder': '0.7', jxlayer: '1.0.0']
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
This plugin enables a *busy* state on any Swing component via [JBusyComponent][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| Node            | Property              | Type       | Required | Bindable | Notes                         |
| --------------- | --------------------- | -----------| -------- | -------- | ----------------------------- |
| busyComponent   | busy                  | boolean    | no       | no       |                               |
|                 | busyModel             | BusyModel  | no       | no       |                               |
|                 | view                  | JComponent | yes      | no       | or nest any `JComponent` node |
| busyModel       | busy                  | boolean    | no       | yes      |                               |
|                 | determinate           | boolean    | no       | yes      |                               |
|                 | autoCompletionEnabled | boolean    | no       | yes      |                               |
|                 | cancellable           | boolean    | no       | yes      |                               |
|                 | description           | String     | no       | yes      |                               |
| futureBusyModel | future                | Future     | no       | no       |                               |

### Example

Here is a simple example of a textArea that is set to busy or not depending on a toggleButton's selected state

        application(title: 'Sample',
          size: [320,320],
          locationByPlatform: true,
          iconImage: imageIcon('/griffon-icon-48x48.png').image,
          iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                       imageIcon('/griffon-icon-32x32.png').image,
                       imageIcon('/griffon-icon-16x16.png').image]) {
            borderLayout()
            toggleButton(id: "t1", "Busy", constraints: NORTH)
            busyComponent(id: "c1", constraints: CENTER, busy: bind{t1.selected}) {
              busyModel(description: "Can't you see I'm busy?")
              scrollPane {
                textArea(columns: 30, rows: 5, text: """Lorem ipsum dolor sit amet, consectetur adipisicing elit,
        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
        Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
        nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
        reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
        pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
        culpa qui officia deserunt mollit anim id est laborum.""")
              }
            }
        }

[1]: http://code.google.com/p/jbusycomponent
'''
}
