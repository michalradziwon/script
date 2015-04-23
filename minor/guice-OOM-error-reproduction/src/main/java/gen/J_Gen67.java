
  package gen;
  public class J_Gen67 {
  		@com.google.inject.Inject
  		public J_Gen67(J_Gen68 j_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  