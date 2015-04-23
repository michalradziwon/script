
  package gen;
  public class K_Gen158 {
  		@com.google.inject.Inject
  		public K_Gen158(K_Gen159 k_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  