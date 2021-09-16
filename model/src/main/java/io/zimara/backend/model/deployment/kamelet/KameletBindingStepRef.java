package io.zimara.backend.model.deployment.kamelet;

/**
 * 🐱class KameletBindingStepRef
 *
 * 🐱example
 * ```
 *       kind: Kamelet
 *       apiVersion: camel.apache.org/v1alpha1
 *       name: twitter-search-source
 * ```
 */
public final class KameletBindingStepRef {

    private String kind = "Kamelet";
    private String apiVersion = "camel.apache.org/v1alpha1";
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }
}