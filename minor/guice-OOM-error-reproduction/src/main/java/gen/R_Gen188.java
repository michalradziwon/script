
  package gen;
  public class R_Gen188 {
  		@com.google.inject.Inject
  		public R_Gen188(R_Gen189 r_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  