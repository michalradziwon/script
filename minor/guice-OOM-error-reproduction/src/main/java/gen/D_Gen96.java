
  package gen;
  public class D_Gen96 {
  		@com.google.inject.Inject
  		public D_Gen96(D_Gen97 d_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  