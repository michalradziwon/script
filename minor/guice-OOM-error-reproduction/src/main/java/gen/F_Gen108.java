
  package gen;
  public class F_Gen108 {
  		@com.google.inject.Inject
  		public F_Gen108(F_Gen109 f_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  