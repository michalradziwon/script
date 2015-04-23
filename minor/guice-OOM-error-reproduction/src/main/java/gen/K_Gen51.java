
  package gen;
  public class K_Gen51 {
  		@com.google.inject.Inject
  		public K_Gen51(K_Gen52 k_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  