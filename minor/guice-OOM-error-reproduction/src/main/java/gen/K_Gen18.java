
  package gen;
  public class K_Gen18 {
  		@com.google.inject.Inject
  		public K_Gen18(K_Gen19 k_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  