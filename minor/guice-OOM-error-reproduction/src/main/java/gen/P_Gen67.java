
  package gen;
  public class P_Gen67 {
  		@com.google.inject.Inject
  		public P_Gen67(P_Gen68 p_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  