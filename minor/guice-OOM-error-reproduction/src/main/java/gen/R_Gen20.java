
  package gen;
  public class R_Gen20 {
  		@com.google.inject.Inject
  		public R_Gen20(R_Gen21 r_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  