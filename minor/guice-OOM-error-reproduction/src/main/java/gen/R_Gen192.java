
  package gen;
  public class R_Gen192 {
  		@com.google.inject.Inject
  		public R_Gen192(R_Gen193 r_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  