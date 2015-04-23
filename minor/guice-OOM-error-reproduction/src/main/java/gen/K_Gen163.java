
  package gen;
  public class K_Gen163 {
  		@com.google.inject.Inject
  		public K_Gen163(K_Gen164 k_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  