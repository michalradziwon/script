
  package gen;
  public class R_Gen37 {
  		@com.google.inject.Inject
  		public R_Gen37(R_Gen38 r_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  