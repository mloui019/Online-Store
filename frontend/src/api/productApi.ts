
export function buildProductUrl(params : Record<string, string | number>) {

    const query = new URLSearchParams();

    for (const key in params) {
        if (params[key] != ' ') {
            query.append(key, String(params[key]));
        }
    }

    return query;
}
