
  package gen;
  public class R_Gen85 {
  		@com.google.inject.Inject
  		public R_Gen85(R_Gen86 r_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  