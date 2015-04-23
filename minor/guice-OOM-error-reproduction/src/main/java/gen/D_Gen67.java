
  package gen;
  public class D_Gen67 {
  		@com.google.inject.Inject
  		public D_Gen67(D_Gen68 d_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  