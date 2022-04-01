/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.mysite.components.Demo__002d__BlogAbout;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class Demo__002d__BlogAbout__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<!doctype html>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n    <link rel=\"icon\" href=\"assets/img/favicons/favicon.ico\"/>\n\n    <title>Bootcamp Blog</title>\n\n    <link rel=\"canonical\" href=\"homepage.html\"/>\n\n    <!-- Bootstrap core CSS -->\n    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n\t<link hreef=\"dist/css/custom.css\" <!-- Custom styles for this template --/>\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n    <link href=\"blog.css\" rel=\"stylesheet\"/>\n  </head>\n\n  <body>\n    <aside class=\"col-md-4 blog-sidebar\">\n        <div class=\"p-3 mb-3 bg-light rounded\">\n          <h4 class=\"font-italic\">About</h4>\n          <p class=\"mb-0\">Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>\n        </div>\n        </aside>\n\n<!-- Bootstrap core JavaScript\n    ================================================== -->\n    <!-- Placed at the end of the document so the pages load faster -->\n    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n    <script>window.jQuery || document.write('<script src=\"assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n    <script src=\"assets/js/vendor/popper.min.js\"></script>\n    <script src=\"dist/js/bootstrap.min.js\"></script>\n    <script src=\"assets/js/vendor/holder.min.js\"></script>\n    <script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n\n        </body>\n        </html>\n        \n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

