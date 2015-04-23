
  package gen;
  public class K_Gen173 {
  		@com.google.inject.Inject
  		public K_Gen173(K_Gen174 k_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  