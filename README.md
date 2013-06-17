
Enhance any swing components with a 'busy' state
------------------------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/jbusycomponent](http://artifacts.griffon-framework.org/plugin/jbusycomponent)


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

