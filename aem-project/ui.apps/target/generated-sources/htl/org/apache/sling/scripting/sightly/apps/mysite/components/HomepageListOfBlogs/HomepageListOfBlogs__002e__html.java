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
package org.apache.sling.scripting.sightly.apps.mysite.components.HomepageListOfBlogs;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class HomepageListOfBlogs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_blogs = null;
Collection var_collectionvar0_list_coerced$ = null;
out.write("<!doctype html>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n    <link rel=\"icon\" href=\"assets/img/favicons/favicon.ico\"/>\n\n    <title>Bootcamp Blog</title>\n\n    <link rel=\"canonical\" href=\"homepage.html\"/>\n\n    <!-- Bootstrap core CSS -->\n    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"/>\n\t<link href=\"dist/css/custom.css\" <!-- Custom styles for this template --/>\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n    <link href=\"blog.css\" rel=\"stylesheet\"/>\n  </head>\n\n  <body>\n\n       <div class=\"row mb-2\">\n\n         ");
_global_blogs = renderContext.call("use", com.mysite.core.models.Blogs.class.getName(), obj());
out.write("<div sly>\n           ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_blogs, "blogsDetailsWithMap");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div>");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object item : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n             <div class=\"col-md-4\">\n               <div class=\"card flex-md-row mb-4 shadow-sm h-md-400\">\n                 <div class=\"card-body d-flex flex-column align-items-start\">\n                   <img class=\"card-img-right flex-auto d-none d-lg-block\" data-src=\"holder.js/320x150?theme=thumb\" alt=\"Card image cap\"/>\n                   <strong class=\"d-inline-block mb-2 text-success\">");
                                        {
                                            Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "pagetitle"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_10));
                                        }
                                        out.write("</strong>\n                   <h3 class=\"mb-0\">\n                     <a class=\"text-dark\" href=\"blog.html#\">");
                                        {
                                            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "blogtitle"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_11));
                                        }
                                        out.write("</a>\n                   </h3>\n                   <div class=\"mb-1 text-muted\">Jan 23</div>\n                   <p class=\"card-text mb-auto\">This is a wider card with supporting text below as a natural lead-in to additional content.</p>\n                   <a href=\"blog.html#\">Continue reading</a>\n                 </div>\n               </div>\n             </div>\n             ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n           </div>\n\n        <!----\n        <div class=\"col-md-4\">\n          <div class=\"card flex-md-row mb-4 shadow-sm h-md-400\">\n            <div class=\"card-body d-flex flex-column align-items-start\">\n\t\t\t<img class=\"card-img-right flex-auto d-none d-lg-block\" data-src=\"holder.js/320x150?theme=thumb\" alt=\"Card image cap\">\n              <strong class=\"d-inline-block mb-2 text-success\">AEM</strong>\n              <h3 class=\"mb-0\">\n                <a class=\"text-dark\" href=\"blog.html#\">Post title</a>\n              </h3>\n              <div class=\"mb-1 text-muted\">May 19</div>\n              <p class=\"card-text mb-auto\">This is a wider card with supporting text below as a natural lead-in to additional content.</p>\n              <a href=\"blog.html#\">Continue reading</a>\n            </div>\n          </div>\n        </div>\n\t\t<div class=\"col-md-4\">\n          <div class=\"card flex-md-row mb-4 shadow-sm h-md-400\">\n            <div class=\"card-body d-flex flex-column align-items-start\">\n\t\t\t<img class=\"card-img-right flex-auto d-none d-lg-block\" data-src=\"holder.js/320x150?theme=thumb\" alt=\"Card image cap\">\n              <strong class=\"d-inline-block mb-2 text-success\">JS</strong>\n              <h3 class=\"mb-0\">\n                <a class=\"text-dark\" href=\"blog.html#\">Post title</a>\n              </h3>\n              <div class=\"mb-1 text-muted\">Nov 11</div>\n              <p class=\"card-text mb-auto\">This is a wider card with supporting text below as a natural lead-in to additional content.</p>\n              <a href=\"blog.html#\">Continue reading</a>\n            </div>\n          </div>\n          </div>\n          ----->\n      </div>\n\n\n      <!-- Bootstrap core JavaScript\n    ================================================== -->\n    <!-- Placed at the end of the document so the pages load faster -->\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n    <script src=\"assets/js/vendor/holder.min.js\"></script>\n    <script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n\n    </body>\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

