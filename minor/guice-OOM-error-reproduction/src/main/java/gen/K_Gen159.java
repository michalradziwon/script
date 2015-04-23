
  package gen;
  public class K_Gen159 {
  		@com.google.inject.Inject
  		public K_Gen159(K_Gen160 k_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  