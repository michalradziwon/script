
  package gen;
  public class K_Gen150 {
  		@com.google.inject.Inject
  		public K_Gen150(K_Gen151 k_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  