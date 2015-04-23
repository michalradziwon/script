
  package gen;
  public class J_Gen56 {
  		@com.google.inject.Inject
  		public J_Gen56(J_Gen57 j_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  