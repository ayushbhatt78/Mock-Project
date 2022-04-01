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
package org.apache.sling.scripting.sightly.apps.mysite.components.HomepageHeader;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class HomepageHeader__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<!doctype html>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n    <link rel=\"icon\" href=\"assets/img/favicons/favicon.ico\"/>\n\n    <title>Bootcamp Blog</title>\n\n    <link rel=\"canonical\" href=\"homepage.html\"/>\n\n    <!-- Bootstrap core CSS -->\n    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"/>\n\t<link hreef=\"dist/css/custom.css\" <!-- Custom styles for this template --/>\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n    <link href=\"blog.css\" rel=\"stylesheet\"/>\n  </head>\n\n  <body>\n\n      <header class=\"blog-header py-3\">\n        <div class=\"row flex-nowrap justify-content-between align-items-center\">\n          <div class=\"col-12 text-center\">\n            <a class=\"blog-header-logo text-dark\" href=\"homepage.html#\">\n    \t\t\t<img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "logo");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"ttn-logo\"/>\n\t\t\t\tBootcamp Blog\n\t\t\t</a>\n          </div>\n        </div>\n      </header>\n\n      <div class=\"nav-scroller py-1 mb-2\">\n        <nav class=\"nav d-flex\">\n          <a class=\"p-2 text-muted\"");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "homelink");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" href");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">Home</a>\n          <a class=\"p-2 text-muted\"");
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "blogs");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "uri");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" href");
                {
                    boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                    if (!var_istrueattr10) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">Published Blogs</a>\n        </nav>\n      </div>\n\n      <!-- Bootstrap core JavaScript\n    ================================================== -->\n    <!-- Placed at the end of the document so the pages load faster -->\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n    <script src=\"assets/js/vendor/holder.min.js\"></script>\n    <script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n\n    </body>\n</html>\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

