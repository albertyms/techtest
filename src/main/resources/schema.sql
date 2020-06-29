-- public."order" definition

-- Drop table
DROP TABLE public."sub_order";

DROP TABLE public."order";

DROP TABLE public."product";

CREATE TABLE public."order" (
	id int8 NOT NULL,
	address varchar(255) NULL,
	date_order timestamp NULL,
	num_order int4 NULL,
	num_shipping int4 NULL,
	total_order float8 NULL,
	CONSTRAINT order_pkey PRIMARY KEY (id)
);

-- public.product definition

-- Drop table



CREATE TABLE public.product (
	id int8 NOT NULL,
	create_date timestamp NULL,
	description varchar(255) NULL,
	"name" varchar(255) NULL,
	price float8 NULL,
	stock int4 NULL,
	update_date timestamp NULL,
	CONSTRAINT product_pkey PRIMARY KEY (id)
);

-- public.sub_order definition

-- Drop table




CREATE TABLE public.sub_order (
	id int8 NOT NULL,
	quantity int4 NULL,
	id_order_fk int8 NULL,
	id_product_fk int8 NULL,
	CONSTRAINT sub_order_pkey PRIMARY KEY (id)
);


-- public.sub_order foreign keys

ALTER TABLE public.sub_order ADD CONSTRAINT fk3vjj5tish9710i1ni7ouhs2en FOREIGN KEY (id_order_fk) REFERENCES "order"(id);
ALTER TABLE public.sub_order ADD CONSTRAINT fk7775cw8b82bmyikhy003fih9e FOREIGN KEY (id_product_fk) REFERENCES product(id);