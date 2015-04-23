
  package gen;
  public class H_Gen67 {
  		@com.google.inject.Inject
  		public H_Gen67(H_Gen68 h_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  