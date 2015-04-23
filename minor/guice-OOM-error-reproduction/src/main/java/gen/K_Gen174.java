
  package gen;
  public class K_Gen174 {
  		@com.google.inject.Inject
  		public K_Gen174(K_Gen175 k_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  