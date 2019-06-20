package net.mytrofanov.aggregator.domain;

abstract class ID {
    protected Long id;

    ID(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
