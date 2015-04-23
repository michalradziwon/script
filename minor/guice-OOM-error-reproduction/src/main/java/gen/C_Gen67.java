
  package gen;
  public class C_Gen67 {
  		@com.google.inject.Inject
  		public C_Gen67(C_Gen68 c_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  