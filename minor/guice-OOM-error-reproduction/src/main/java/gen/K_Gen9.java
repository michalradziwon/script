
  package gen;
  public class K_Gen9 {
  		@com.google.inject.Inject
  		public K_Gen9(K_Gen10 k_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  