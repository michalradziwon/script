
  package gen;
  public class K_Gen48 {
  		@com.google.inject.Inject
  		public K_Gen48(K_Gen49 k_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  