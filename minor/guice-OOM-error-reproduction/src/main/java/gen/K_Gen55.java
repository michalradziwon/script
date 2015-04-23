
  package gen;
  public class K_Gen55 {
  		@com.google.inject.Inject
  		public K_Gen55(K_Gen56 k_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  