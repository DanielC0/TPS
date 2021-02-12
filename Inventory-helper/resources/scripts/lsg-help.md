Usage: ls [OPTION]... [FILE]...
List information about the FILEs (the current directory by default).
Sort entries alphabetically if none of -cftuvSUX nor --sort is specified.

Mandatory arguments to long options are mandatory for short options too.
  -a, --all                  do not ignore entries starting with .
  -A, --almost-all           do not list implied . and ..
      --author               with -l, print the author of each file
  -b, --escape               print C-style escapes for nongraphic characters
      --block-size=SIZE      with -l, scale sizes by SIZE when printing them;
                               e.g., '--block-size=M'; see SIZE format below
  -B, --ignore-backups       do not list implied entries ending with ~
  -c                         with -lt: sort by, and show, ctime (time of last
                               modification of file status information);
                               with -l: show ctime and sort by name;
                               otherwise: sort by ctime, newest first
  -C                         list entries by columns
      --color[=WHEN]         colorize the output; WHEN can be 'always' (default
                               if omitted), 'auto', or 'never'; more info below
  -d, --directory            list directories themselves, not their contents
  -D, --dired                generate output designed for Emacs' dired mode
  -f                         do not sort, enable -aU, disable -ls --color
  -F, --classify             append indicator (one of */=>@|) to entries
      --file-type            likewise, except do not append '*'
      --format=WORD          across -x, commas -m, horizontal -x, long -l,
                               single-column -1, verbose -l, vertical -C
      --full-time            like -l --time-style=full-iso
  -g                         like -l, but do not list owner
      --group-directories-first
                             group directories before files;
                               can be augmented with a --sort option, but any
                               use of --sort=none (-U) disables grouping
  -G, --no-group             in a long listing, don't print group names
  -h, --human-readable       with -l and -s, print sizes like 1K 234M 2G etc.
      --si                   likewise, but use powers of 1000 not 1024
  -H, --dereference-command-line
                             follow symbolic links listed on the command line
      --dereference-command-line-symlink-to-dir
                             follow each command line symbolic link
                               that points to a directory
      --hide=PATTERN         do not list implied entries matching shell PATTERN
                               (overridden by -a or -A)
      --hyperlink[=WHEN]     hyperlink file names; WHEN can be 'always'
                               (default if omitted), 'auto', or 'never'
      --indicator-style=WORD  append indicator with style WORD to entry names:
                               none (default), slash (-p),
                               file-type (--file-type), classify (-F)
  -i, --inode                print the index number of each file
  -I, --ignore=PATTERN       do not list implied entries matching shell PATTERN
  -k, --kibibytes            default to 1024-byte blocks for disk usage;
                               used only with -s and per directory totals
  -l                         use a long listing format
  -L, --dereference          when showing file information for a symbolic
                               link, show information for the file the link
                               references rather than for the link itself
  -m                         fill width with a comma separated list of entries
  -n, --numeric-uid-gid      like -l, but list numeric user and group IDs
  -N, --literal              print entry names without quoting
  -o                         like -l, but do not list group information
  -p, --indicator-style=slash
                             append / indicator to directories
  -q, --hide-control-chars   print ? instead of nongraphic characters
      --show-control-chars   show nongraphic characters as-is (the default,
                               unless program is 'ls' and output is a terminal)
  -Q, --quote-name           enclose entry names in double quotes
      --quoting-style=WORD   use quoting style WORD for entry names:
                               literal, locale, shell, shell-always,
                               shell-escape, shell-escape-always, c, escape
                               (overrides QUOTING_STYLE environment variable)
  -r, --reverse              reverse order while sorting
  -R, --recursive            list subdirectories recursively
  -s, --size                 print the allocated size of each file, in blocks
  -S                         sort by file size, largest first
      --sort=WORD            sort by WORD instead of name: none (-U), size (-S),
                               time (-t), version (-v), extension (-X)
      --time=WORD            with -l, show time as WORD instead of default
                               modification time: atime or access or use (-u);
                               ctime or status (-c); also use specified time
                               as sort key if --sort=time (newest first)
      --time-style=TIME_STYLE  time/date format with -l; see TIME_STYLE below
  -t                         sort by modification time, newest first
  -T, --tabsize=COLS         assume tab stops at each COLS instead of 8
  -u                         with -lt: sort by, and show, access time;
                               with -l: show access time and sort by name;
                               otherwise: sort by access time, newest first
  -U                         do not sort; list entries in directory order
  -v                         natural sort of (version) numbers within text
  -w, --width=COLS           set output width to COLS.  0 means no limit
  -x                         list entries by lines instead of by columns
  -X                         sort alphabetically by entry extension
  -Z, --context              print any security context of each file
  -1                         list one file per line.  Avoid '\n' with -q or -b
      --help     display this help and exit
      --version  output version information and exit

The SIZE argument is an integer and optional unit (example: 10K is 10*1024).
Units are K,M,G,T,P,E,Z,Y (powers of 1024) or KB,MB,... (powers of 1000).

The TIME_STYLE argument can be full-iso, long-iso, iso, locale, or +FORMAT.
FORMAT is interpreted like in date(1).  If FORMAT is FORMAT1<newline>FORMAT2,
then FORMAT1 applies to non-recent files and FORMAT2 to recent files.
TIME_STYLE prefixed with 'posix-' takes effect only outside the POSIX locale.
Also the TIME_STYLE environment variable sets the default style to use.

Using color to distinguish file types is disabled both by default and
with --color=never.  With --color=auto, ls emits color codes only when
standard output is connected to a terminal.  The LS_COLORS environment
variable can change the settings.  Use the dircolors command to set it.

Exit status:
 0  if OK,
 1  if minor problems (e.g., cannot access subdirectory),
 2  if serious trouble (e.g., cannot access command-line argument).

GNU coreutils online help: <https://www.gnu.org/software/coreutils/>
Full documentation at: <https://www.gnu.org/software/coreutils/ls>
or available locally via: info '(coreutils) ls invocation'

lsg: ls-with-git-status

List files, including git information in the output.
We accept switches for ls and attempt to mimic the usual behaviour of the tool.

In addition, switches dedicated to lsg are also supported::

  --nest, --nest=<depth>
      Causes lsg to re-invoke itself on any directories encountered up to the
      depth specified or recursively if no specific depth was supplied.
      May also set the environment variable `LSG_NEST` to true or a number to
      force this behaviour.

  --no-nest
      Disable recursive listing of directories.

Unsupported ls options::
  --format=(commas|vertical|across|horizontal)
  -c | -x | -m
      These options don't leave space for lsg to annotate the output, so will be
      ignored if they are used. Only the 1-file-per-line format is supported.
  --dired | -D
      The --dired option does not make sense - it wouldn't be understood if the
      annotations were added to the output.

Git annotations::

Files within a git repository:
  * File changes are only shown in braces.
  * Untracked and ignored files are shown:
      {untracked}                 - File is not known to git
      {ignored}                   - File is listed as a pattern in .gitignore
  * Changed files in the working tree are shown:
      {modified locally, 3 lines} - Changed in working tree, 3 lines affected (added or deleted)
      {deleted locally}           - File has been deleted in working tree
  * Changed files in the cache are shown:
      {staged, 3 lines}           - Changes have been staged, 3 lines affected (added or deleted)
      {deleted}                   - File has been marked for deletion in cache
      {added}                     - File has been marked for addition in cache
      {renamed}                   - File has been renamed to this name in the cache
  * Merge status is show:
      {unmerged, both added}      - File was added by merge, and we added it as well.

Directories within a git repository:
  * Only untracked or ignored state is shown (to make lists faster):
      {untracked}                 - Directory is not known to git
      {ignored}                   - Directory is listed as a pattern in .gitignore

Repositories and submodules:
  * Branch details are in brackets:
      (master)            - directory is at the head of branch master
  * Relative location compared to upstream is shown with arrows after the name
      (master￪1)          - 1 commits locally ready to be pushed
      (master￬7)          - 8 commits available in fetched upstream
      (master⊗)           - no upstream is configured
      (master~2○)         - detached head
  * Submodule reference changes are described within the brackets:
      (master added)      - Submodule has been added
      (master 8 forward)  - Submodule has moved 8 changes forward in the same tree (in working tree)
      (master 2 back)     - Submodule has moved 2 changes forward in the same tree (in working tree)
      (master new ref)    - Submodule has changed to a ref unrelated to the old tree (in working tree)
      (master staged 1 forward)   - Submodule has moved 1 changes forward in the same tree (in the cache)
  * Summary of changes to the files within the submodule are shown in braces:
      {1 modified}        - 1 file has been changed in the working tree
      {2 staged}          - 2 files have been changed and staged in the working tree
  * All the above options can be combined.

