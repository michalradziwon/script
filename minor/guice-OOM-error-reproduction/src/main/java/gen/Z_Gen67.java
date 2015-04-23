
  package gen;
  public class Z_Gen67 {
  		@com.google.inject.Inject
  		public Z_Gen67(Z_Gen68 z_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  