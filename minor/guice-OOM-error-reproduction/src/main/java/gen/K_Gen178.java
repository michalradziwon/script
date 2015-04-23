
  package gen;
  public class K_Gen178 {
  		@com.google.inject.Inject
  		public K_Gen178(K_Gen179 k_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  