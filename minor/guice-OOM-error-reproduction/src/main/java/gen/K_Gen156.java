
  package gen;
  public class K_Gen156 {
  		@com.google.inject.Inject
  		public K_Gen156(K_Gen157 k_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  