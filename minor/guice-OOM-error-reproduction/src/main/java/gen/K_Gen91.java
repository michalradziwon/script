
  package gen;
  public class K_Gen91 {
  		@com.google.inject.Inject
  		public K_Gen91(K_Gen92 k_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  