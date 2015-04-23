
  package gen;
  public class K_Gen31 {
  		@com.google.inject.Inject
  		public K_Gen31(K_Gen32 k_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  