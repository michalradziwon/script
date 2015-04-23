
  package gen;
  public class R_Gen42 {
  		@com.google.inject.Inject
  		public R_Gen42(R_Gen43 r_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  