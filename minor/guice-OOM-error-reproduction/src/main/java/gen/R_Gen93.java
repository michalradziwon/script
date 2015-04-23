
  package gen;
  public class R_Gen93 {
  		@com.google.inject.Inject
  		public R_Gen93(R_Gen94 r_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  