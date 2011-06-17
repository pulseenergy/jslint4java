package com.googlecode.jslint4java.cli;

import com.beust.jcommander.Parameter;

/**
 * Flags which correspond directly to JSLint options.
 */
class JSLintFlags {
    // BEGIN-OPTIONS
    @Parameter(names = "--asi", description = "If automatic semicolon insertion should be tolerated")
    public Boolean ASI = null;

    @Parameter(names = "--bitwise", description = "If bitwise operators should not be allowed")
    public Boolean BITWISE = null;

    @Parameter(names = "--boss", description = "If advanced usage of assignments should be allowed")
    public Boolean BOSS = null;

    @Parameter(names = "--browser", description = "If the standard browser globals should be predefined")
    public Boolean BROWSER = null;

    @Parameter(names = "--couch", description = "If couchdb globals should be predefined")
    public Boolean COUCH = null;

    @Parameter(names = "--curly", description = "If curly braces around blocks should be required (even in if/for/while)")
    public Boolean CURLY = null;

    @Parameter(names = "--debug", description = "If debugger statements should be allowed")
    public Boolean DEBUG = null;

    @Parameter(names = "--devel", description = "If logging globals should be predefined (console, alert, etc.)")
    public Boolean DEVEL = null;

    @Parameter(names = "--eqeqeq", description = "If === should be required")
    public Boolean EQEQEQ = null;

    @Parameter(names = "--eqnull", description = "If == null comparisons should be tolerated")
    public Boolean EQNULL = null;

    @Parameter(names = "--es5", description = "If es5 syntax should be allowed")
    public Boolean ES5 = null;

    @Parameter(names = "--evil", description = "If eval should be allowed")
    public Boolean EVIL = null;

    @Parameter(names = "--expr", description = "If expressionstatement should be allowed as programs")
    public Boolean EXPR = null;

    @Parameter(names = "--forin", description = "If for in statements must filter")
    public Boolean FORIN = null;

    @Parameter(names = "--globalstrict", description = "If global \"use strict\"; should be allowed (also enables 'strict')")
    public Boolean GLOBALSTRICT = null;

    @Parameter(names = "--immed", description = "If immediate invocations must be wrapped in parens")
    public Boolean IMMED = null;

    @Parameter(names = "--indent", description = "The indentation factor")
    public String INDENT = null;

    @Parameter(names = "--jquery", description = "If jquery globals should be predefined")
    public Boolean JQUERY = null;

    @Parameter(names = "--latedef", description = "If the use before definition should not be tolerated")
    public Boolean LATEDEF = null;

    @Parameter(names = "--laxbreak", description = "If line breaks should not be checked")
    public Boolean LAXBREAK = null;

    @Parameter(names = "--loopfunc", description = "If functions should be allowed to be defined within loops")
    public Boolean LOOPFUNC = null;

    @Parameter(names = "--maxerr", description = "The maximum number of errors to allow")
    public String MAXERR = null;

    @Parameter(names = "--maxlen", description = "The maximum length of a source line")
    public String MAXLEN = null;

    @Parameter(names = "--mootools", description = "If mootools globals should be predefined")
    public Boolean MOOTOOLS = null;

    @Parameter(names = "--newcap", description = "If constructor names must be capitalized")
    public Boolean NEWCAP = null;

    @Parameter(names = "--noarg", description = "If arguments.caller and arguments.callee should be disallowed")
    public Boolean NOARG = null;

    @Parameter(names = "--node", description = "If the node.js environment globals should be predefined")
    public Boolean NODE = null;

    @Parameter(names = "--noempty", description = "If empty blocks should be disallowed")
    public Boolean NOEMPTY = null;

    @Parameter(names = "--nomen", description = "If names should be checked")
    public Boolean NOMEN = null;

    @Parameter(names = "--nonew", description = "If using `new` for side-effects should be disallowed")
    public Boolean NONEW = null;

    @Parameter(names = "--onevar", description = "If only one var statement per function should be allowed")
    public Boolean ONEVAR = null;

    @Parameter(names = "--passfail", description = "If the scan should stop on first error")
    public Boolean PASSFAIL = null;

    @Parameter(names = "--plusplus", description = "If increment/decrement should not be allowed")
    public Boolean PLUSPLUS = null;

    @Parameter(names = "--predef", description = "The names of predefined global variables")
    public String PREDEF = null;

    @Parameter(names = "--prototypejs", description = "If prototype and scriptaculous globals shoudl be predefined")
    public Boolean PROTOTYPEJS = null;

    @Parameter(names = "--regexp", description = "If the . should not be allowed in regexp literals")
    public Boolean REGEXP = null;

    @Parameter(names = "--rhino", description = "If the rhino environment globals should be predefined")
    public Boolean RHINO = null;

    @Parameter(names = "--shadow", description = "If variable shadowing should be tolerated")
    public Boolean SHADOW = null;

    @Parameter(names = "--strict", description = "Require the \"use strict\"; pragma")
    public Boolean STRICT = null;

    @Parameter(names = "--sub", description = "If all forms of subscript notation are tolerated")
    public Boolean SUB = null;

    @Parameter(names = "--supernew", description = "If `new function () { ... };` and `new object;` should be tolerated")
    public Boolean SUPERNEW = null;

    @Parameter(names = "--undef", description = "If variables should be declared before used")
    public Boolean UNDEF = null;

    @Parameter(names = "--white", description = "If strict whitespace rules apply")
    public Boolean WHITE = null;

    // END-OPTIONS
}
