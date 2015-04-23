
  package gen;
  public class J_Gen172 {
  		@com.google.inject.Inject
  		public J_Gen172(J_Gen173 j_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  