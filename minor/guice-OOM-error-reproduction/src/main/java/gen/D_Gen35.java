
  package gen;
  public class D_Gen35 {
  		@com.google.inject.Inject
  		public D_Gen35(D_Gen36 d_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  