
  package gen;
  public class R_Gen14 {
  		@com.google.inject.Inject
  		public R_Gen14(R_Gen15 r_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  