my $n = <STDIN>;
chomp($n);

my $s = <STDIN>;
my @weathers;
chomp($s);

@weathers = split(//, $s);
if (@weathers[$n-1] eq "o") {
    print "Yes";
} else {
    print "No";
}