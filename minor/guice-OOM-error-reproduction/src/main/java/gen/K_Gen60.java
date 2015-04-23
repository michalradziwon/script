
  package gen;
  public class K_Gen60 {
  		@com.google.inject.Inject
  		public K_Gen60(K_Gen61 k_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  