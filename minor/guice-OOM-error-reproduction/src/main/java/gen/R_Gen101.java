
  package gen;
  public class R_Gen101 {
  		@com.google.inject.Inject
  		public R_Gen101(R_Gen102 r_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  