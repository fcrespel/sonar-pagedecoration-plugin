SonarQube Page Decoration Plugin
================================

This is a [SonarQube](http://www.sonarqube.org) plugin allowing you to customize the style, scripts, header, footer and sidebar of all SonarQube pages.


Building from source
--------------------

1. Checkout or download the source code from the latest tag on GitHub.
2. Execute `mvn clean verify` from your local source code folder (install [Maven](http://maven.apache.org) if not already done).
3. Find the `sonar-pagedecoration-plugin-[version].jar` file in the `target` subfolder.


Installation
------------

1. Copy the `sonar-pagedecoration-plugin-[version].jar` file in your `SONAR_HOME/extensions/plugins` folder.

2. (Re)start SonarQube.

3. Go to the Settings -> Page Decoration section to add custom HTML snippets to the style, scripts, header, footer and sidebar placeholders.


Configuration
-------------

The following settings are available for this plugin:

* **sonar.pagedecoration.script**: Custom JavaScript snippet to include in the head of the page (e.g. `<script type="text/javascript">alert('example');</script>`).
* **sonar.pagedecoration.style**: Custom CSS snippet to include in the head of the page (e.g. `<style type="text/css">#hd { background-color: #4B9FD5; }</style>`).
* **sonar.pagedecoration.header**: Custom HTML snippet to include at the top of the page (e.g. `<div>My Header</div>`).
* **sonar.pagedecoration.footer**: Custom HTML snippet to include at the bottom of the page (e.g. `<div>My Footer</div>`).
* **sonar.pagedecoration.sidebar**: Custom HTML snippet to include in the sidebar of the page (e.g. `<li><a href="http://github.com">GitHub</a></li>`).
