
  package gen;
  public class K_Gen34 {
  		@com.google.inject.Inject
  		public K_Gen34(K_Gen35 k_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  