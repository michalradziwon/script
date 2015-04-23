
  package gen;
  public class K_Gen197 {
  		@com.google.inject.Inject
  		public K_Gen197(K_Gen198 k_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  