
  package gen;
  public class R_Gen118 {
  		@com.google.inject.Inject
  		public R_Gen118(R_Gen119 r_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  