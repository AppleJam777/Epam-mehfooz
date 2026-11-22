a small inventory system using inheritance. It's a multi-part exercise:

Warehouse (given): a container with a capacity, which lets you add items, take items out, and check the remaining space.

ProductWarehouse: extends the warehouse and adds a product name, so it represents storage for one specific product.

ProductWarehouseWithHistory: extends that and records every change in the stored amount using a ChangeHistory class. The history lets you see the max, min and average amounts it has held.
