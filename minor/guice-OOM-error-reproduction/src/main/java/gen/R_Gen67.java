
  package gen;
  public class R_Gen67 {
  		@com.google.inject.Inject
  		public R_Gen67(R_Gen68 r_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  