CREATE TABLE PRODUCT(
PRODUCT_ID INT PRIMARY KEY,
PRODUCT_NAME VARCHAR(240),
BRAND_ID INT,
RATING 	INT
);	


CREATE TABLE PRODUCT (
	Product_id serial PRIMARY KEY,
	Product_name VARCHAR ( 50 ), 
	Brand_id VARCHAR ( 50 ), 
	Rating VARCHAR ( 255 ) 

CONSTRAINT FK_product_brand FOREIGN KEY(brand_id)
REFERENCES brand(brand_id)
	
);


INSERT INTO PRODUCT
(PRODUCT_id,PRODUCT_NAME,BRAND_ID,RATING)
VALUES
(1,'POLO SHIRT',1,4)
;

INSERT INTO PRODUCT VALUES

(2,'COMFORTER',2,4.4),
(3,'TOP ZIP TOTE',3,4.6)
;






drop table product; //Delete table query.



INSERT INTO product
(product_id,product_name,brand_id,rating)
VALUES
(1,'POLO Shirt', 1,4)

INSERT INTO MULTIPUL VALUES; FOLLOWING BELOW;

INSERT INTO product VALUES

(2,'Comforter', 2,4.4),
(3,'Top Zip Tote', 3,4.6)
;


CREATE TABLE BRAND(
 BRAND_ID INT ,
BRAND_NAME VARCHAR (250)
);

INSERT INTO BRAND
(BRAND_id,BRAND_name)
VALUES
(1,'Polo Ralaphruen')
INSERT INTO Brand VALUES

(2,'Royal luxe'),
(3,'Michal corse')
;


CREATE TABLE Color (
	Color_id serial PRIMARY KEY,
	Color_name VARCHAR ( 50 )
	);

SELECT * FROM COLOR;

INSERT INTO COLOR VALUES

(2,'GREY'),
(3,'Platinum'),
(4,'Medium bule'),
(5,'Black'),
(6,'Vennila')
;

SELECT * FROM COLOR;

CREATE TABLE SIZE(
SIZE_ID INT PRIMARY KEY,
SIZE_NAME VARCHAR(240)

);	
SELECT * FROM SIZE;
INSERT INTO Size VALUES

(1,'Small'),
(2,'Midium'),
(3,'Large'),
(4,'XL'),
(5,'XXL'),
(6,'Twin'),
(7,'Full'),
(8,'Queen'),
(9,'King'),
(10,'Nosize')
;

CREATE TABLE SKU(
SKU_ID INT PRIMARY KEY,
SKU_NAME VARCHAR(240),
COLOR_ID INT,
SIZE_ID INT
);	

SELECT * FROM SKU;

INSERT INTO SKU
(sku_id,sku_name,color_id,size_id)
VALUES
(1,'RedSmallShirt', 1,1)


INSERT INTO SKU VALUES

(2,'Red medium shirt', 1,2),
(3,'Red large shirt', 1,3),
(4,'Red Xl shirt', 1,4),
(5,'Red XXL shirt', 1,5),
(6,'Grey small shirt', 2,1),
(7,'Grey Medium shirt', 2,2),
(8,'Grey large shirt', 2,3),
(9,'Grey XL shirt', 2,4),
(10,'Grey XXl shirt', 2,5),
(11,'Platiunum twin comforter', 3,6),
(12,'Platiunum full comforter', 3,7),
(13,'Platiunum queen comforter', 3,8),
(14,'Platiunum king comforter', 3,9),
(15,'medium bule queen comforter', 4,8),
(16,'medium  bule twin comforter', 3,9),
(17,'Top zip tote', 5,10),
(18,'Top Zip tote',6,10)
;


CREATE TABLE SKUPRICE(
SKU_ID INT,
REGULARPRICE double precision,
SALEPRICE double precision

);		

SELECT * FROM SKUPRICE;


INSERT INTO SKUPRICE
(sku_id,REGULARPRICE,SALEPRICE)
VALUES
(1,60, 34.99)
;


INSERT INTO SKUPRICE VALUES

(2,60, 34.99),
(3,60, 34.99),
(4,60, 34.99),
(5,60, 34.99),
(6,60, 34.99),
(7,60, 34.99),
(8,60, 34.99),
(9,60, 34.99),
(10,60, 34.99),
(11,110, 56.09),
(12,110, 56.09),
(13,110, 56.09),
(14,110, 56.09),
(15,120, 61.19),
(16,120, 61.19),
(17,120, 171),
(18,120, 171)
;
	
	SELECT * FROM SKUPRICE;


	CREATE TABLE SKUINVENTORY(
SKU_ID INT,
SKU_INVENTORY bool	
);	
	

	SELECT * FROM SKUINVENTORY;

	INSERT INTO SKUINVENTORY
(sku_id,SKU_INVENTORY)
VALUES
(1,'Y')
;
	
	INSERT INTO SKUINVENTORY VALUES

(2,'Y'),
(3,'Y'),
(4,'N'),
(5,'Y'),
(6,'Y'),
(7,'Y'),
(8,'Y'),
(9,'N'),
(10,'Y'),
(11,'Y'),
(12,'Y'),
(13,'Y'),
(14,'N'),


SELECT * FROM SKUINVENTORY;


CREATE TABLE PRODUCTSKUREL(
PRODUCT_ID INT,
SKU_ID INT
	);


INSERT INTO PRODUCTSKUREL
(PRODUCT_id,SKU_ID)
VALUES
(1,1)
;


SELECT * FROM PRODUCTSKUREL


INSERT INTO PRODUCTSKUREL VALUES

(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,7),
(1,8),
(1,9),
(1,10),
(2,11),
(2,12),
(2,13),
(2,14),
(2,15),
(2,16),
(2,17),
(2,18)
;


SELECT * FROM PRODUCTSKUREL;
SELECT p.*,s.* FROM 
PRODUCT P,SKU S,color c, size s1,skuprice sp,
skuinventory si, productskurel psr
where p.product_id=1 and psr.product_id=p.product_id 
and psr.sku_id=s.sku_id and s.sizeid=s1.sizeid 
and s.color_id=c.color_id ;



