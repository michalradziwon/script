
  package gen;
  public class Z_Gen23 {
  		@com.google.inject.Inject
  		public Z_Gen23(Z_Gen24 z_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  