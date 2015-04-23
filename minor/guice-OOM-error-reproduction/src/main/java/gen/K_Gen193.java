
  package gen;
  public class K_Gen193 {
  		@com.google.inject.Inject
  		public K_Gen193(K_Gen194 k_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  