
  package gen;
  public class K_Gen53 {
  		@com.google.inject.Inject
  		public K_Gen53(K_Gen54 k_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  