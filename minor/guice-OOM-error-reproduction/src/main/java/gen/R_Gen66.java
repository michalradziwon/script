
  package gen;
  public class R_Gen66 {
  		@com.google.inject.Inject
  		public R_Gen66(R_Gen67 r_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  