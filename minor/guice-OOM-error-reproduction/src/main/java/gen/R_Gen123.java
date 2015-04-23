
  package gen;
  public class R_Gen123 {
  		@com.google.inject.Inject
  		public R_Gen123(R_Gen124 r_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  