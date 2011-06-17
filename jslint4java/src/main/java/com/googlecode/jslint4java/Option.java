package com.googlecode.jslint4java;

import java.util.Locale;

/**
 * All available options for tuning the behaviour of JSLint.
 *
 * TODO Add a "Handler" class for each type, which knows whether it needs an
 * arg, how to parse it, etc.
 *
 * @author dom
 */
public enum Option {
    // BEGIN-OPTIONS
    /** If automatic semicolon insertion should be tolerated */
    ASI("If automatic semicolon insertion should be tolerated", Boolean.class),

    /** If bitwise operators should not be allowed */
    BITWISE("If bitwise operators should not be allowed", Boolean.class),

    /** If advanced usage of assignments should be allowed */
    BOSS("If advanced usage of assignments should be allowed", Boolean.class),

    /** If the standard browser globals should be predefined */
    BROWSER("If the standard browser globals should be predefined", Boolean.class),

    /** If couchdb globals should be predefined */
    COUCH("If couchdb globals should be predefined", Boolean.class),

    /** If curly braces around blocks should be required (even in if/for/while) */
    CURLY("If curly braces around blocks should be required (even in if/for/while)", Boolean.class),

    /** If debugger statements should be allowed */
    DEBUG("If debugger statements should be allowed", Boolean.class),

    /** If logging globals should be predefined (console, alert, etc.) */
    DEVEL("If logging globals should be predefined (console, alert, etc.)", Boolean.class),

    /** If === should be required */
    EQEQEQ("If === should be required", Boolean.class),

    /** If == null comparisons should be tolerated */
    EQNULL("If == null comparisons should be tolerated", Boolean.class),

    /** If es5 syntax should be allowed */
    ES5("If es5 syntax should be allowed", Boolean.class),

    /** If eval should be allowed */
    EVIL("If eval should be allowed", Boolean.class),

    /** If expressionstatement should be allowed as programs */
    EXPR("If expressionstatement should be allowed as programs", Boolean.class),

    /** If for in statements must filter */
    FORIN("If for in statements must filter", Boolean.class),

    /** If global "use strict"; should be allowed (also enables 'strict') */
    GLOBALSTRICT("If global \"use strict\"; should be allowed (also enables 'strict')", Boolean.class),

    /** If immediate invocations must be wrapped in parens */
    IMMED("If immediate invocations must be wrapped in parens", Boolean.class),

    /** The indentation factor */
    INDENT("The indentation factor", Integer.class),

    /** If jquery globals should be predefined */
    JQUERY("If jquery globals should be predefined", Boolean.class),

    /** If the use before definition should not be tolerated */
    LATEDEF("If the use before definition should not be tolerated", Boolean.class),

    /** If line breaks should not be checked */
    LAXBREAK("If line breaks should not be checked", Boolean.class),

    /** If functions should be allowed to be defined within loops */
    LOOPFUNC("If functions should be allowed to be defined within loops", Boolean.class),

    /** The maximum number of errors to allow */
    MAXERR("The maximum number of errors to allow", Integer.class),

    /** The maximum length of a source line */
    MAXLEN("The maximum length of a source line", Integer.class),

    /** If mootools globals should be predefined */
    MOOTOOLS("If mootools globals should be predefined", Boolean.class),

    /** If constructor names must be capitalized */
    NEWCAP("If constructor names must be capitalized", Boolean.class),

    /** If arguments.caller and arguments.callee should be disallowed */
    NOARG("If arguments.caller and arguments.callee should be disallowed", Boolean.class),

    /** If the node.js environment globals should be predefined */
    NODE("If the node.js environment globals should be predefined", Boolean.class),

    /** If empty blocks should be disallowed */
    NOEMPTY("If empty blocks should be disallowed", Boolean.class),

    /** If names should be checked */
    NOMEN("If names should be checked", Boolean.class),

    /** If using `new` for side-effects should be disallowed */
    NONEW("If using `new` for side-effects should be disallowed", Boolean.class),

    /** If only one var statement per function should be allowed */
    ONEVAR("If only one var statement per function should be allowed", Boolean.class),

    /** If the scan should stop on first error */
    PASSFAIL("If the scan should stop on first error", Boolean.class),

    /** If increment/decrement should not be allowed */
    PLUSPLUS("If increment/decrement should not be allowed", Boolean.class),

    /** The names of predefined global variables */
    PREDEF("The names of predefined global variables", StringArray.class),

    /** If prototype and scriptaculous globals should be predefined */
    PROTOTYPEJS("If prototype and scriptaculous globals should be predefined", Boolean.class),

    /** If unescaped last dash (-) inside brackets should be tolerated */
    REGEXDASH("If unescaped last dash (-) inside brackets should be tolerated", Boolean.class),

    /** If the . should not be allowed in regexp literals */
    REGEXP("If the . should not be allowed in regexp literals", Boolean.class),

    /** If the rhino environment globals should be predefined */
    RHINO("If the rhino environment globals should be predefined", Boolean.class),

    /** If script-targeted urls should be tolerated */
    SCRIPTURL("If script-targeted urls should be tolerated", Boolean.class),

    /** If variable shadowing should be tolerated */
    SHADOW("If variable shadowing should be tolerated", Boolean.class),

    /** Require the "use strict"; pragma */
    STRICT("Require the \"use strict\"; pragma", Boolean.class),

    /** If all forms of subscript notation are tolerated */
    SUB("If all forms of subscript notation are tolerated", Boolean.class),

    /** If `new function () { ... };` and `new object;` should be tolerated */
    SUPERNEW("If `new function () { ... };` and `new object;` should be tolerated", Boolean.class),

    /** If trailing whitespace rules apply */
    TRAILING("If trailing whitespace rules apply", Boolean.class),

    /** If variables should be declared before used */
    UNDEF("If variables should be declared before used", Boolean.class),

    /** If strict whitespace rules apply */
    WHITE("If strict whitespace rules apply", Boolean.class),

    /** If the windows scripting host environment globals should be predefined */
    WSH("If the windows scripting host environment globals should be predefined", Boolean.class),

    // END-OPTIONS
    ;

    private String description;
    private Class<?> type;

    private Option(String description, Class<?> type) {
        this.description = description;
        this.type = type;
    }

    /**
     * Return a description of what this option affects.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Return the lowercase name of this option.
     */
    public String getLowerName() {
        return name().toLowerCase(Locale.getDefault());
    }

    /**
     * What type does the value of this option have?
     */
    public Class<?> getType() {
        return type;
    }

    /**
     * Calculate the maximum length of all of the {@link Option} names.
     *
     * @return the length of the largest name.
     */
    public static int maximumNameLength() {
        int maxOptLen = 0;
        for (Option o : values()) {
            int len = o.name().length();
            if (len > maxOptLen) {
                maxOptLen = len;
            }
        }
        return maxOptLen;
    }

    /**
     * Show this option and its description.
     */
    @Override
    public String toString() {
        return getLowerName() + "[" + getDescription() + "]";
    }
}
