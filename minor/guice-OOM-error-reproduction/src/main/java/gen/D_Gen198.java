
  package gen;
  public class D_Gen198 {
  		@com.google.inject.Inject
  		public D_Gen198(D_Gen199 d_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  