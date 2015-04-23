
  package gen;
  public class R_Gen31 {
  		@com.google.inject.Inject
  		public R_Gen31(R_Gen32 r_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  