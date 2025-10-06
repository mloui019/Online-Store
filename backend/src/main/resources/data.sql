
-- Starting categories for testing
INSERT INTO categories (id, name) VALUES 
    (1, 'Hair Products'),
    (2, 'Hair Tools'),
    (3, 'Hair Extensions'),
    (4, 'Accessories');

-- Starting products for testing
INSERT INTO products (id, name, price, description, category_id) VALUES 
    (1, 'Argan Oil Repair Shampoo', 12.99, 'Moisturizing shampoo with argan oil for dry or damaged hair.', 1),
    (2, 'Ceramic Flat Iron 1', 89.99, 'Professional-grade flat iron with adjustable heat settings.', 2),
    (3, '100% Human Hair Bundle - Body Wave (18")', 59.99, 'Soft, tangle-free human hair bundle. Can be dyed and styled.', 3),
    (4, 'Silk Edge Wrap', 8.99, 'Silky, gentle wrap to lay edges and protect styles overnight.', 4),
    (5, 'Leave-In Curl Enhancer', 16.49, 'Defines and moisturizes curls without crunch or residue.', 1);


