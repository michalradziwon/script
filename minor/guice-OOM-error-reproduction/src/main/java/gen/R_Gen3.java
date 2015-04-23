
  package gen;
  public class R_Gen3 {
  		@com.google.inject.Inject
  		public R_Gen3(R_Gen4 r_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  