
  package gen;
  public class K_Gen44 {
  		@com.google.inject.Inject
  		public K_Gen44(K_Gen45 k_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  