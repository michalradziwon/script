
  package gen;
  public class R_Gen179 {
  		@com.google.inject.Inject
  		public R_Gen179(R_Gen180 r_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  