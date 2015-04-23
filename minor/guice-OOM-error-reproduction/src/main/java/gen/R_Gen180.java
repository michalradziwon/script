
  package gen;
  public class R_Gen180 {
  		@com.google.inject.Inject
  		public R_Gen180(R_Gen181 r_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  