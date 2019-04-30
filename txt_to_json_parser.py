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

with open('txt_to_json.txt') as file:
    file_contents = file.read()
    # print(file_contents)

    #for each line read : check_for_poem_end()


def check_for_poem_end():
    if line == '\n' & line+1 == '\n':
        return True


    # read title
        # new poem JSON
        #
    # newline
    # stanza
    # newline
    # newline
    # title
    # .
    # .
    # .
