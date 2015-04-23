
  package gen;
  public class R_Gen70 {
  		@com.google.inject.Inject
  		public R_Gen70(R_Gen71 r_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  