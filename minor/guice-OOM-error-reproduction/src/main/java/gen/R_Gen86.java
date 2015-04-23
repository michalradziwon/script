
  package gen;
  public class R_Gen86 {
  		@com.google.inject.Inject
  		public R_Gen86(R_Gen87 r_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  