use warnings FATAL => 'all';
use strict;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "パタトクカシーー";
print substr($str,0,1),substr($str,2,1),substr($str,4,1),substr($str,6,1);