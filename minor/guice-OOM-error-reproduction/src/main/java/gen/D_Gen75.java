
  package gen;
  public class D_Gen75 {
  		@com.google.inject.Inject
  		public D_Gen75(D_Gen76 d_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  