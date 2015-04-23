
  package gen;
  public class K_Gen175 {
  		@com.google.inject.Inject
  		public K_Gen175(K_Gen176 k_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  