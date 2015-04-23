
  package gen;
  public class L_Gen67 {
  		@com.google.inject.Inject
  		public L_Gen67(L_Gen68 l_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  