
  package gen;
  public class Z_Gen98 {
  		@com.google.inject.Inject
  		public Z_Gen98(Z_Gen99 z_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  