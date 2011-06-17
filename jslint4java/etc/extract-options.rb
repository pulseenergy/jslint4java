#!/usr/bin/env ruby
#
# Pull out the list of options from jslint.js.
#

opts = {
  # Hard code, as not mentioned in the source list.
  'indent' => ['The indentation factor', 'Integer'],
  'maxerr' => ['The maximum number of errors to allow', 'Integer'],
  'maxlen' => ['The maximum length of a source line', 'Integer'],
  'predef' => ['The names of predefined global variables', 'StringArray'],
}

File.open(ARGV[0]) do |fh|
  # To match an option declaration.
  re = /^\s+'?(\w+)'?\s*:\s*true,?\s+\/\/(.*)$/
  while line = fh.gets do
    # The jslint options are now in a comment.  Use the first and last options
    # as delimiters.
    if (line =~ /^\s+boolOptions = \{/) .. (line =~ /^\s+\},/)
      if md = line.match(re)
        key = md[1].strip
        desc = md[2].strip.capitalize
        type = 'Boolean'
        opts[key] = [desc, type]
      end
    end
  end
end

if opts.length == 0
  raise 'Ooops, no options found!'
end

def update_file(f, indent, opts)
  contents = []
  File.open(f) do |fh|
    while line = fh.gets do
      if line =~ /\/\/\s*BEGIN-OPTIONS/
        begin_options = line.rstrip
        # Skip up to the end of the options section.
        while line !~ /\/\/\s*END-OPTIONS/
          line = fh.gets
        end
        end_options = line.rstrip

        # And start rewriting.
        contents << begin_options
        opts.keys.sort.map do |k|
          # key, desc, type
          contents << yield(k, opts[k][0], opts[k][1])
        end
        contents << end_options
      else
        contents << line.rstrip()
      end
    end
  end
  File.open(f, "w") do |fh|
    fh.write(contents.join("\n") + "\n")
  end
end

indent = "    "
update_file(ARGV[1], indent, opts) do |k,desc,type|
  descEscaped = desc.gsub(/"/, '\\"')
  ["#{indent}/** #{desc} */",
   "#{indent}#{k.upcase}(\"#{descEscaped}\", #{type}.class),",
   ""]
end

update_file(ARGV[2], indent, opts) do |k,desc,type|
  descEscaped = desc.gsub(/"/, '\\"')
  # Set all non-boolean values to "String" so that they can be parsed by
  # us rather than JCommander.
  if type != 'Boolean'
    type = 'String'
  end
  ["#{indent}@Parameter(names = \"--#{k}\", description = \"#{descEscaped}\")",
   "#{indent}public #{type} #{k.upcase} = null;",
   ""]
end

update_file(ARGV[3], "", opts) do |k,desc,type|
  ["#{indent}<dt>#{k} <dd>#{desc}"]
end
