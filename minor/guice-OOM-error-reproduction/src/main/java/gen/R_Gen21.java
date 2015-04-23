
  package gen;
  public class R_Gen21 {
  		@com.google.inject.Inject
  		public R_Gen21(R_Gen22 r_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  