
  package gen;
  public class K_Gen30 {
  		@com.google.inject.Inject
  		public K_Gen30(K_Gen31 k_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  