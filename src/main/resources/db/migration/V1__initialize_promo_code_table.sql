drop table if exists promo_codes;
create table promo_codes (
                       id int primary key auto_increment,
                       code varchar(255) not null,
                       discount_amount int not null check (discount_amount > 0),
                       constraint uq_code unique (code)
);
insert into promo_codes values (1, 'SUMMER2023', 25);
insert into promo_codes values (2, 'SALE20', 20);