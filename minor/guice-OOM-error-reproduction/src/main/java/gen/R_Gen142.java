
  package gen;
  public class R_Gen142 {
  		@com.google.inject.Inject
  		public R_Gen142(R_Gen143 r_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  