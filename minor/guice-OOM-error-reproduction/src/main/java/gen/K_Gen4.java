
  package gen;
  public class K_Gen4 {
  		@com.google.inject.Inject
  		public K_Gen4(K_Gen5 k_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  