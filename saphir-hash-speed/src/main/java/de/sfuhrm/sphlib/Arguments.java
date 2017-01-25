/*
 * Copyright (c) 2014, Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package de.sfuhrm.sphlib;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

/**
 *
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */
public class Arguments {
    
    @Option(name = "-providers", aliases = "-p", usage = "Comma separated names of providers to benchmark (defaults to all)", metaVar = "provider")
    private String providers = "SUN,BC,SPH";

    @Option(name = "-algorithms", aliases = "-a", usage = "Comma separated algorithms to benchmark (defaults to all)", metaVar =  "algorithm")
    private String algorithms = "MD2,MD5,SHA,SHA-224,SHA-256,SHA-384,SHA-512";
    
    @Option(name = "-sizes", aliases = "-s", usage = "Comma separated sizes to benchmark", metaVar =  "1K,5M")
    private String sizes = "100K,1M,100M";

    @Option(name = "-help", aliases = "-h", usage = "This help")
    private boolean help;

    private Arguments() {
        // private
    }

    static Arguments parse(String args[]) {
        if (args == null)
            throw new NullPointerException();
        Arguments bean = new Arguments();
        
        CmdLineParser parser = new CmdLineParser(bean);

        try {
            parser.parseArgument(args);

            if (bean.isHelp()) {
                printUsage(parser);
                return null;
            }

            return bean;
        } catch (CmdLineException e) {
            // handling of wrong arguments
            System.err.println(e.getMessage());
            printUsage(parser);
            return null;
        }
    }

    private static void printUsage(CmdLineParser parser) {
        parser.printUsage(System.err);
        System.err.println();
    }

    public boolean isHelp() {
        return help;
    }

    public String[] getAlgorithms() {
        return algorithms.split(",");
    }

    public String[] getProviders() {
        return providers.split(",");
    }
    
    public SizeWithMultiplier[] getSizes() {
       String str[] = sizes.split(",");
       SizeWithMultiplier[] result = new SizeWithMultiplier[str.length];
       
       for (int i=0; i < str.length; i++) {
           result[i] = SizeWithMultiplier.parseString(str[i]);
       }
       return result;
    }
}
