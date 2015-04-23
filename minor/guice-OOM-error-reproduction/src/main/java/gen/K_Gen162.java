
  package gen;
  public class K_Gen162 {
  		@com.google.inject.Inject
  		public K_Gen162(K_Gen163 k_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  