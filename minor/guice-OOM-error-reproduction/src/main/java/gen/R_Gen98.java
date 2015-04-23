
  package gen;
  public class R_Gen98 {
  		@com.google.inject.Inject
  		public R_Gen98(R_Gen99 r_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  