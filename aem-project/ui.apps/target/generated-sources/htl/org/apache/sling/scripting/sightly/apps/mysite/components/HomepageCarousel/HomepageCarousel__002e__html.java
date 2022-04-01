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
package org.apache.sling.scripting.sightly.apps.mysite.components.HomepageCarousel;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class HomepageCarousel__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_banner = null;
Collection var_collectionvar0_list_coerced$ = null;
out.write("<!doctype html>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <meta name=\"description\" content=\"\"/>\n    <meta name=\"author\" content=\"\"/>\n    <link rel=\"icon\" href=\"assets/img/favicons/favicon.ico\"/>\n\n    <title>Bootcamp Blog</title>\n\n    <link rel=\"canonical\" href=\"homepage.html\"/>\n\n    <!-- Bootstrap core CSS -->\n    <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\"/>\n\t<link hreef=\"dist/css/custom.css\" <!-- Custom styles for this template --/>\n    <link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:700,900\" rel=\"stylesheet\"/>\n    <link href=\"blog.css\" rel=\"stylesheet\"/>\n  </head>\n\n  <body>\n\n\n      <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n\t\t<ol class=\"carousel-indicators\">\n\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n\t\t</ol>\n\t\n\t\t<!-- Wrapper for slides -->\n\t\t<div class=\"carousel-inner\">\n\t\t<div class=\"item active\">\n\t\t\t<img src=\"/content/dam/mysite/1.jpg\" alt=\"AEM 1\" style=\"width:100%;height: 325px;\"/>\n\t\t\t<div class=\"carousel-caption\">\n\t\t\t<a href=\"blog.html#\"><h3>Banner 1</h3></a>\n\t\t\t<p>Read more about this</p>\n\t\t\t</div>\n\t\t</div>\n\t\n\t\t<div class=\"item\">\n\t\t\t<img src=\"/content/dam/mysite/2.png\" alt=\"AEM 2\" style=\"width:100%;height: 325px;\"/>\n\t\t\t<div class=\"carousel-caption\">\n\t\t\t<a href=\"blog.html#\"><h3>Banner 2</h3></a>\n\t\t\t<p>Read more about this</p>\n\t\t\t</div>\n\t\t</div>\n\t\t\n\t\t<div class=\"item\">\n\t\t\t<img src=\"/content/dam/mysite/3.jpeg\" alt=\"AEM 3\" style=\"width:100%;height: 325px;\"/>\n\t\t\t<div class=\"carousel-caption\">\n\t\t\t<a href=\"blog.html#\"><h3>Banner 3</h3></a>\n\t\t\t<p>Read more about this</p>\n\t\t\t</div>\n\t\t</div>\n\t\t</div>\n\n\t\t");
_global_banner = renderContext.call("use", com.mysite.core.models.Banner.class.getName(), obj());
out.write("<div sly>\n        ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_banner, "bannerDetailsWithMap");
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
                                    long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index7, 1)).longValue());
                                    {
                                        boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                        if (var_traversal9) {
                                            out.write("\n        <div class=\"item\">\n\t\t\t<img src=\"item.image\" alt=\"AEM 2\" style=\"width:100%;height: 325px;\"/>\n\t\t\t<div class=\"carousel-caption\">\n\t\t\t<a href=\"item.blogLink\"><h3>");
                                            {
                                                Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "heading"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_10));
                                            }
                                            out.write("</h3></a>\n\t\t\t<p>Read more about this</p>\n\t\t\t</div>\n\t\t</div>");
                                            {
                                                String var_11 = (("\n        ---------------Book : " + renderContext.getObjectModel().toString(renderContext.call("xss", itemlist_field$_count, "text"))) + "--------------\n        ");
                                                out.write(renderContext.getObjectModel().toString(var_11));
                                            }
                                            out.write("<p> Book : <b>");
                                            {
                                                String var_12 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "heading"), "text")) + " ");
                                                out.write(renderContext.getObjectModel().toString(var_12));
                                            }
                                            out.write("</b></p>\n        <p> Subject : <b>");
                                            {
                                                Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "image"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_13));
                                            }
                                            out.write("</b> </p>\n        <p> Publish : <b>");
                                            {
                                                Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "blogLink"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_14));
                                            }
                                            out.write("</b> </p>\n    \t");
                                        }
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
out.write("\n        </div>\n\n\n\t\n\t\t<!-- Left and right controls -->\n\t\t<a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n\t\t<span class=\"glyphicon glyphicon-chevron-left\"></span>\n\t\t<span class=\"sr-only\">Previous</span>\n\t\t</a>\n\t\t<a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n\t\t<span class=\"glyphicon glyphicon-chevron-right\"></span>\n\t\t<span class=\"sr-only\">Next</span>\n\t\t</a>\n\t  </div>\n\n      <!-- Bootstrap core JavaScript\n    ================================================== -->\n    <!-- Placed at the end of the document so the pages load faster -->\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n    <script src=\"assets/js/vendor/holder.min.js\"></script>\n    <script>\n      Holder.addTheme('thumb', {\n        bg: '#55595c',\n        fg: '#eceeef',\n        text: 'Thumbnail'\n      });\n    </script>\n\n    </body>\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

