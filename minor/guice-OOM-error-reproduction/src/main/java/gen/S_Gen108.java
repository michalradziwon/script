
  package gen;
  public class S_Gen108 {
  		@com.google.inject.Inject
  		public S_Gen108(S_Gen109 s_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  