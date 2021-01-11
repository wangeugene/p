"cp .vimrc ~ 
" NEOVIM right click to paste system clickboard which won't work in vim linux
" ~/.config/nvim/init.vim copy your MyConfigs to this place
" add the following to init.vim to load ~/.vimrc to your nvim configuration
"set runtimepath^=~/.vim runtimepath+=~/.vim/after
"    let &packpath = &runtimepath
"    source ~/.vimrc IF HAS('PERSISTENT_UNDO')      "CHECK IF YOUR VIM VERSION SUPPORTS IT
"   set undofile                 "turn on the feature  
"   set undodir=$HOME/.vim/undo  "directory where the undo files will be stored
"   endif
" NEOVIM copy by C-c inside nvim  can be paste with right click bash along with mobaxterm
" NEOVIM :PlugInstall not found inside nvim
" https://github.com/junegunn/vim-plug
"
" GVIM installation instructions:
" set visualbell because noerrorbells not works
" google install vim-plug on windows , just run the command
" :PlugInstall  
" there you go 


"Original Windows Version
set belloff=all
set noswapfile
set nobackup
"set clipboard=unnamedplus
set nu
set encoding=utf-8
set ma     
"set visualbell
"set noerrorbells
set showmode
set autoindent 
set ruler
set hlsearch
colors elflord
au GUIEnter * simalt ~x
"au VimEnter * NERDTree
" the following won't work in linux
"set guioptions -=m
"set guioptions -=T
set noswapfile
set nobackup
set autochdir
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
function! CopyMatches(reg)
  let hits = []
  %s//\=len(add(hits, submatch(0))) ? submatch(0) : ''/gne
  let reg = empty(a:reg) ? '+' : a:reg
  execute 'let @'.reg.' = join(hits, "\n") . "\n"'
endfunction
command! -register CopyMatches call CopyMatches(<q-reg>)
""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
""""""""""""""""""""""""My keymapping""""""""""""""""""""""""""""""""""""""""""""""""""
"  execute current line linux
"  it works and need enter key
nmap <F2> :exec '!'.getline('.')
" following won't work
"nmap <F2> i<C-R>=:.w! bash<CR><Esc>
"imap <F2> <C-R>=:.w! bash<CR>
" print current time
nmap <F3> i<C-R>=strftime("%Y-%m-%d %a %I:%M %p")<CR><Esc>
imap <F3> <C-R>=strftime("%Y-%m-%d %a %I:%M %p")<CR>
" remove all space in current file
nmap <F4> :%s/\s\+$//e
" save using sudo admin
nmap <F5> :!sudo tee %<CR>
""" list linux files
map <F6> :!ls<CR>:e
nmap <F7> Y:!<C-R>"<C-H><CR>
" open nerd tree
nmap <F9> :NERDTree <CR>
" remap key to show in explorer windows
nmap <F10> :!start explorer /e,,%:p:h<CR>
imap <F10> <Esc><F10>
nmap <F11> :!start explorer /select,%:p
imap <F11> <Esc><F11>
" remap key to open in Chrome
nnoremap <F12> :exe ':silent !chrome %'<CR>

" standard editor shortcut"
" mouse = a won't work in linux by using mouse to select v works you have to
" use mouse to copy to system clickboard! V won't work
" set mouse=v
"  mouse = a , windows focus follows mouse
set mouse=a
:map <C-a> GVgg
:map <C-n> :enew
:map <C-o> :e . <Enter>
:map <C-s> :w <Enter>
:map <C-z> u

""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
" CTRL-X and SHIFT-Del are Cut
vnoremap <C-X> "+x
vnoremap <S-Del> "+x

" CTRL-C and CTRL-Insert are Copy
vnoremap <C-C> "+y
vnoremap <C-Insert> "+y

" CTRL-V and SHIFT-Insert are Paste
map <C-V>       "+gP
map <S-Insert>      "+gP

" Pasting blockwise and linewise selections is not possible in Insert and
" Visual mode without the +virtualedit feature.  They are pasted as if they
" were characterwise instead.
" Uses the paste.vim autoload script.

exe 'inoremap <script> <C-V>' paste#paste_cmd['i']
exe 'vnoremap <script> <C-V>' paste#paste_cmd['v']

imap <S-Insert>     <C-V>
vmap <S-Insert>     <C-V>

" Use CTRL-Q to do what CTRL-V used to do
noremap <C-Q>       <C-V>

""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
"vim-plug
" UNIX:
"  
" Specify a directory for plugins
" - For Neovim: ~/.local/share/nvim/plugged
" - Avoid using standard Vim directory names like 'plugin'
silent! call plug#begin('~/.vim/plugged')

" Make sure you use single quotes

" Shorthand notation; fetches https://github.com/junegunn/vim-easy-align
Plug 'junegunn/vim-easy-align'
Plug 'tpope/vim-surround'
Plug 'MarcWeber/vim-addon-mw-utils'
Plug 'tomtom/tlib_vim'
Plug 'garbas/vim-snipmate'
Plug 'yegappan/mru'

" Any valid git URL is allowed
"Plug 'https://github.com/junegunn/vim-github-dashboard.git'

" Multiple Plug commands can be written in a single line using | separators
"Plug 'marijnh/tern_for_vim'
"
"" Optional:
"Plug 'honza/vim-snippets'
"Plug 'robu3/vimongous'
"
"Plug 'jiangmiao/auto-pairs'
"" On-demand loading
"Plug 'scrooloose/nerdtree', { 'on':  'NERDTreeToggle' }
"Plug 'tpope/vim-fireplace', { 'for': 'clojure' }
"
"" Using a non-master branch
"Plug 'rdnetto/YCM-Generator', { 'branch': 'stable' }
"
"" Using a tagged release; wildcard allowed (requires git 1.9.2 or above)
"Plug 'fatih/vim-go', { 'tag': '*' }
"
"" Plugin options
"Plug 'nsf/gocode', { 'tag': 'v.20150303', 'rtp': 'vim' }
""Plug 'hallettj/jslint.vim'
"
"" Plugin outside ~/.vim/plugged with post-update hook
"Plug 'junegunn/fzf', { 'dir': '~/.fzf', 'do': './install --all' }
"
"" Unmanaged plugin (manually installed and updated)
"Plug '~/my-prototype-plugin'

" Initialize plugin system
call plug#end()
" Uncomment the following to have Vim jump to the last position when                                                       
" reopening a file
if has("autocmd")
  au BufReadPost * if line("'\"") > 0 && line("'\"") <= line("$")
    \| exe "normal! g'\"" | endif
endif


if has("gui_running")
   if has("gui_gtk2")
     set guifont=Inconsolata\ 12
   elseif has("gui_macvim")
     set guifont=Menlo\ Regular:h14
   elseif has("gui_win32")
     set guifont=Consolas:h11:cANSI
   endif
endif

"if empty(glob('~/.vim/autoload/plug.vim'))
"  silent !curl -fLo ~/.vim/autoload/plug.vim --create-dirs
"    \ https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim
"  autocmd VimEnter * PlugInstall --sync | source $MYVIMRC
"endif
