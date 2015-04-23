
  package gen;
  public class R_Gen19 {
  		@com.google.inject.Inject
  		public R_Gen19(R_Gen20 r_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  