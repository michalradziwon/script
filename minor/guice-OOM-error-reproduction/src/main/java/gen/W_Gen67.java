
  package gen;
  public class W_Gen67 {
  		@com.google.inject.Inject
  		public W_Gen67(W_Gen68 w_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  