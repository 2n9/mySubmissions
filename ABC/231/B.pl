my $n = <STDIN>;
chomp($n);
my @ss;
my %as;

for (my $i = 0; $i < $n; $i++){
    $ss[$i] = <STDIN>;
    chomp($ss[$i]);
    $as{$ss[$i]}++;
}

my $max;
my $maxstr;
for my $key (sort keys %as) {
    if (!defined($max)) {
        $max = $as{$key};
        $maxstr = $key;
    } elsif ($as{$key} > $max) {
        $max = $as{$key};
        $maxstr = $key;
    }
}
print $maxstr;