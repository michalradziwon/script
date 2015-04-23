
  package gen;
  public class R_Gen48 {
  		@com.google.inject.Inject
  		public R_Gen48(R_Gen49 r_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  