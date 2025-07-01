import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateSample{
    public static void main(String args[]){
        // Imprime a data Atual
        System.out.println("Data atual:");
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        // Imprime uma data especificada
        System.out.println("\nDefinindo datas:");
        dataAtual = LocalDate.of(2040, 12, 1);
        System.out.println(dataAtual);

        // Imprime uma data a partir da soma de dias.
        dataAtual = LocalDate.ofEpochDay(1000000000);
        System.out.println(dataAtual);

        // Converte texto em data
        System.out.println("\nConversão de String para datas:");
        dataAtual = LocalDate.parse("2006-01-31");
        System.out.println(dataAtual); 

        System.out.println("\nFormantando Datas para outros modelos:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataAtual = LocalDate.parse("31/01/2006",formatter);
        System.out.println(dataAtual);

        // Criando e utilizando um pattern
        System.out.println("\nCriando seu próprio Pattern:");
        dataAtual = LocalDate.of(2025,9,20);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter2.format(dataAtual));

        // Patterns Enuns.
        System.out.println("\nPatterns Prontos:");
        formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatter2.format(dataAtual));
        formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(formatter2.format(dataAtual));
        formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(formatter2.format(dataAtual));
        formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(formatter2.format(dataAtual));
    }
}

/*
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/run/ircd:/usr/sbin/nologin
_apt:x:42:65534::/nonexistent:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
systemd-network:x:998:998:systemd Network Management:/:/usr/sbin/nologin
systemd-timesync:x:996:996:systemd Time Synchronization:/:/usr/sbin/nologin
dhcpcd:x:100:65534:DHCP Client Daemon,,,:/usr/lib/dhcpcd:/bin/false
messagebus:x:101:101::/nonexistent:/usr/sbin/nologin
syslog:x:102:102::/nonexistent:/usr/sbin/nologin
systemd-resolve:x:991:991:systemd Resolver:/:/usr/sbin/nologin
uuidd:x:103:103::/run/uuidd:/usr/sbin/nologin
tss:x:104:104:TPM software stack,,,:/var/lib/tpm:/bin/false
sshd:x:105:65534::/run/sshd:/usr/sbin/nologin
pollinate:x:106:1::/var/cache/pollinate:/bin/false
tcpdump:x:107:108::/nonexistent:/usr/sbin/nologin
landscape:x:108:109::/var/lib/landscape:/usr/sbin/nologin
fwupd-refresh:x:990:990:Firmware update daemon:/var/lib/fwupd:/usr/sbin/nologin
polkitd:x:989:989:User for polkitd:/:/usr/sbin/nologin
ec2-instance-connect:x:109:65534::/nonexistent:/usr/sbin/nologin
_chrony:x:110:112:Chrony daemon,,,:/var/lib/chrony:/usr/sbin/nologin
ubuntu:x:1000:1000:Ubuntu:/home/ubuntu:/bin/bash
ftp:x:111:114:ftp daemon,,,:/srv/ftp:/usr/sbin/nologin
web7sites:x:1001:33:Web7,,,:/var/www/html:/bin/bash
nagios:x:1002:1002::/home/nagios:/bin/sh
mysql:x:112:115:MySQL Server,,,:/nonexistent:/bin/false
popti:x:1003:1004::/var/www/html/datagrohome/docs/popti/:/bin/sh

 */