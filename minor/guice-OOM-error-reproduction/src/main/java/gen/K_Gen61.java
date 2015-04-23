
  package gen;
  public class K_Gen61 {
  		@com.google.inject.Inject
  		public K_Gen61(K_Gen62 k_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  