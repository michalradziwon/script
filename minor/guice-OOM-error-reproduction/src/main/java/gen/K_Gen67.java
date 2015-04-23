
  package gen;
  public class K_Gen67 {
  		@com.google.inject.Inject
  		public K_Gen67(K_Gen68 k_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  