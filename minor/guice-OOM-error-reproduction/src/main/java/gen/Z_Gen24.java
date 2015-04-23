
  package gen;
  public class Z_Gen24 {
  		@com.google.inject.Inject
  		public Z_Gen24(Z_Gen25 z_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  