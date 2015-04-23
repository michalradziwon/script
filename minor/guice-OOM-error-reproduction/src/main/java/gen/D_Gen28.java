
  package gen;
  public class D_Gen28 {
  		@com.google.inject.Inject
  		public D_Gen28(D_Gen29 d_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  