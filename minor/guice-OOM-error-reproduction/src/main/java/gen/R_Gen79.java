
  package gen;
  public class R_Gen79 {
  		@com.google.inject.Inject
  		public R_Gen79(R_Gen80 r_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  