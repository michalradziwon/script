
  package gen;
  public class K_Gen180 {
  		@com.google.inject.Inject
  		public K_Gen180(K_Gen181 k_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  