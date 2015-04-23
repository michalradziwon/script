
  package gen;
  public class K_Gen87 {
  		@com.google.inject.Inject
  		public K_Gen87(K_Gen88 k_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  