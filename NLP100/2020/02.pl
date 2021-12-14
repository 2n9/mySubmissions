use warnings FATAL => 'all';
use strict;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @str1 = split(//, "パトカー");
my @str2 = split(//, "タクシー");

for (my $i = 0; $i < @str1; $i++) {
    print $str1[$i].$str2[$i];
}