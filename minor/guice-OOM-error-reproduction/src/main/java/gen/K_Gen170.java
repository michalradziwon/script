
  package gen;
  public class K_Gen170 {
  		@com.google.inject.Inject
  		public K_Gen170(K_Gen171 k_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  