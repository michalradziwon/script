
  package gen;
  public class D_Gen108 {
  		@com.google.inject.Inject
  		public D_Gen108(D_Gen109 d_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  