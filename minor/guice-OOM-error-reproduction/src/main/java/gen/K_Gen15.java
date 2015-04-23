
  package gen;
  public class K_Gen15 {
  		@com.google.inject.Inject
  		public K_Gen15(K_Gen16 k_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  