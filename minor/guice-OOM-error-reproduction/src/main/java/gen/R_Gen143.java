
  package gen;
  public class R_Gen143 {
  		@com.google.inject.Inject
  		public R_Gen143(R_Gen144 r_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  