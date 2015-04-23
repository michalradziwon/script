
  package gen;
  public class D_Gen42 {
  		@com.google.inject.Inject
  		public D_Gen42(D_Gen43 d_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  