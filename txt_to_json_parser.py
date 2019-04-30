# Read lines

## Method 1
    # if not newline:
        # line is title
        # titleFound = True

            # if titleFound == True & next line != newline
                # Next next line is new stanza
                # Record poem information
            # else move forward
                # if

## Method 2
    # If line starts with ", it is a title.
        # Find other "
        # Save line to poem title

        # next line should be blank

        # next line should be first line of poem

        # listen for blank line to denote end of stanza
            # if two blank lines, poem has ended

## General structure
# read title
    # new poem JSON
# newline
# stanza
# newline
# newline
# title
# .
# .
# .

# https://stackabuse.com/read-a-file-line-by-line-in-python/

filepath = 'poem_text.txt'
with open(filepath) as fp:
    for count, line in enumerate(fp):
        print(line)
# No need to close fp since using 'with'
