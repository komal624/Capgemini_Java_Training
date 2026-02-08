package feature.java_collection_streams.Collections;


import java.time.LocalDate;
import java.util.*;

public class InsuranceManager {

    // HashMap -> Fast lookup
    private Map<String, Policy> policyMap = new HashMap<>();

    // LinkedHashMap -> Maintains insertion order
    private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();

    // TreeMap -> Sorted by Expiry Date
    private TreeMap<LocalDate, Policy> expirySortedMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderMap.put(policy.getPolicyNumber(), policy);
        expirySortedMap.put(policy.getExpiryDate(), policy);
    }

    // Retrieve by policy number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // Policies expiring in next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy p : policyMap.values()) {
            if (!p.isExpired() && p.getExpiryDate().isBefore(limit)) {
                result.add(p);
            }
        }
        return result;
    }

    // Policies by policyholder
    public List<Policy> getPoliciesByHolder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.getPolicyHolder().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Policy> entry = iterator.next();
            if (entry.getValue().isExpired()) {
                insertionOrderMap.remove(entry.getKey());
                expirySortedMap.remove(entry.getValue().getExpiryDate());
                iterator.remove();
            }
        }
    }

    // Display sorted by expiry
    public void displaySortedByExpiry() {
        for (Policy p : expirySortedMap.values()) {
            System.out.println(p);
        }
    }
}
